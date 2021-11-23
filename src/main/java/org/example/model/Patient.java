package org.example.model;

import java.time.LocalDate;
import java.util.UUID;

public class Patient {
    private final String id;
    private String firstName;
    private String lastName;
    private String ssn;
    private LocalDate birthDate;
    private UserCredentials userCredentials;
    private ContactInfo info;

    public Patient(String firstName, String lastName,
                   String ssn, LocalDate birthDate,
                   UserCredentials userCredentials, ContactInfo info) {

        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.birthDate = birthDate;
        this.userCredentials = userCredentials;
        this.info = info;

    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public UserCredentials getUserCredentials() {
        return userCredentials;
    }

    public void setUserCredentials(UserCredentials userCredentials) {
        if(userCredentials == null) throw new RuntimeException("User credentials was null");
        this.userCredentials = userCredentials;
    }

    public ContactInfo getInfo() {
        return info;
    }

    public void setInfo(ContactInfo info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn='" + ssn + '\'' +
                ", userCredentials=" + userCredentials +
                ", info=" + info +
                '}';
    }
}
