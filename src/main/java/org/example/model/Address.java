package org.example.model;

import javax.xml.crypto.URIReferenceException;
import java.util.UUID;

public class Address {
    private final String id;
    private String streetAddress;
    private String zipCode;
    private String city;

    public Address(String streetAddress, String zipCode, String city) {
        this.id = UUID.randomUUID().toString();
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        if(streetAddress == null) throw new IllegalArgumentException("streetAddress was null");
        this.streetAddress = streetAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        if(zipCode == null) throw new IllegalArgumentException("zipCode was null");
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if(city == null) throw new IllegalArgumentException("city was null");
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id='" + id + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
