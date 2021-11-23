package org.example.model;

import java.util.UUID;

public class Premises {
    private final String id;
    private String name;
    private Address address;
    private ContactInfo contactInfo;

    public Premises(String name, Address address, ContactInfo contactInfo) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "Premises{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", contactInfo=" + contactInfo +
                '}';
    }
}
