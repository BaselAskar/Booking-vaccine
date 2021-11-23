package org.example.model;

import java.util.UUID;

public class ContactInfo {
    private String id;
    private String email;
    private String phone;

    public ContactInfo(String email, String phone) {
        this.id = UUID.randomUUID().toString();
        this.email = email;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
