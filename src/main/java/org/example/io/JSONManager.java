package org.example.io;


import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

public class JSONManager {

    private static final JSONManager INSTANCE = new JSONManager();

    public static JSONManager getInstance(){
        return INSTANCE;
    }


    private final ObjectMapper objectMapper;
    private static final Logger LOGGER = Logger.getLogger(JSONManager.class.getName());

    private JSONManager(){
        objectMapper = new ObjectMapper()
                .enable(SerializationFeature.INDENT_OUTPUT)
                .registerModule(new JavaTimeModule());
    }

    public <T> void serializeToJSON(Collection<T> data, File file){
        try{
            objectMapper.writeValue(file,data);
        }catch (IOException ex){
            LOGGER.warning(ex.getMessage());
        }
    }

    public <T> List<T> deserializeFromJSON(File file, Class<T> clazz){
        List<T> result = new ArrayList<>();
        JavaType type = objectMapper.getTypeFactory().constructParametricType(List.class,clazz);
        try{
            result = objectMapper.readValue(file,type);
            LOGGER.info("Collection of " + clazz.getSimpleName() + " successfully deserialized");
        }catch (IOException ex){
            LOGGER.warning(ex.getMessage());
        }
        return result;
    }


}
