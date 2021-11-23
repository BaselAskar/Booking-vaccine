package org.example.Data.interfaces;

import org.example.model.UserCredentials;

import java.util.*;

public interface UserCredentialsDAO extends GenericCRUD<UserCredentials,String> {

    //CRUD - Create update Read Delete
    Optional<UserCredentials> findByUserName(String userName);
    List<UserCredentials> findByRole(String role);
}
