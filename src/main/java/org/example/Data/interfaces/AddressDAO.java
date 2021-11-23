package org.example.Data.interfaces;

import org.example.model.Address;

import java.util.List;

public interface AddressDAO extends GenericCRUD<Address,String> {

    List<Address> findByStreetAddress(String streetAddress);
    List<Address> findByZipCode(String zipCode);
    List<Address> findByCity(String city);
}
