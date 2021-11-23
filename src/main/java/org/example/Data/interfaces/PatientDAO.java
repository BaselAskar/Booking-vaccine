package org.example.Data.interfaces;

import org.example.model.Patient;

import java.util.*;

public interface PatientDAO extends GenericCRUD<Patient,String> {

    Optional<Patient> findBySSN(String ssn);
    List<Patient> findByName(String name);
    Optional<Patient> findByUsername(String username);
    Optional<Patient> findByEmail(String email);
}
