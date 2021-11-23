package org.example.Data.interfaces;

import org.example.model.Booking;

import java.awt.print.Book;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface BookingDAO extends GenericCRUD<Book,String> {

    List<Booking> findByDateBetween(LocalDate start, LocalDate end);
    List<Booking> findByDateAfter(LocalDate start);
    List<Booking> findByDateBefore(LocalDate end);
    List<Booking> findByVaccineId(String vaccineId);
    List<Booking> findVacantStatus(boolean vacantStatus);
    List<Booking> findByPremisesId(String premisesId);
    List<Booking> findByPatientId(String patientId);
    List<Booking> findByCity(String city);
}
