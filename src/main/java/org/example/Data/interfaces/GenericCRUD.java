package org.example.Data.interfaces;

import java.util.*;

public interface GenericCRUD <T,ID>{
    T create(T t);
    List<T> findAll();
    Optional<T> findById(ID id);
    boolean delete(ID id);
}
