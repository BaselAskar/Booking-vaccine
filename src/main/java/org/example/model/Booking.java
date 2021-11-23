package org.example.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Booking {
    private final String id;
    private LocalDateTime dateTime;
    private double price;
    private String administrator;
    private String vaccineId;
    private boolean vacant;
    private Premises premises;
    private Patient patient;

    public Booking(LocalDateTime dateTime,
                   double price, String administrator,
                   String vaccineId, boolean vacant,
                   Premises premises, Patient patient) {

        this.id = UUID.randomUUID().toString();
        this.dateTime = dateTime;
        this.price = price;
        this.administrator = administrator;
        this.vaccineId = vaccineId;
        this.vacant = vacant;
        this.premises = premises;
        this.patient = patient;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAdministrator() {
        return administrator;
    }

    public void setAdministrator(String administrator) {
        this.administrator = administrator;
    }

    public String getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(String vaccineId) {
        this.vaccineId = vaccineId;
    }

    public boolean isVacant() {
        return vacant;
    }

    public void setVacant(boolean vacant) {
        this.vacant = vacant;
    }

    public Premises getPremises() {
        return premises;
    }

    public void setPremises(Premises premises) {
        this.premises = premises;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
        setVacant(this.patient == null);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id='" + id + '\'' +
                ", dateTime=" + dateTime +
                ", price=" + price +
                ", administrator='" + administrator + '\'' +
                ", vaccineId='" + vaccineId + '\'' +
                ", vacant=" + vacant +
                ", premises=" + premises +
                ", patient=" + patient +
                '}';
    }
}
