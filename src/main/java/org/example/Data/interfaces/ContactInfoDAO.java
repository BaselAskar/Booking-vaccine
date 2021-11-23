package org.example.Data.interfaces;

import org.example.model.ContactInfo;

import java.util.Optional;

public interface ContactInfoDAO extends GenericCRUD<ContactInfo,String>{

    Optional<ContactInfo> findByEmail(String email);
}
