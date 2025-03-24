package com.flight_management.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "flightdata")
public class Airline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Airline")
    private String airline;

    @Column(name = "Source")
    private String source;

    @Column(name = "Source Name")
    private String sourceName;

    @Column(name = "Destination")
    private String destination;

    @Column(name = "Destination Name")
    private String destinationName;

    @Column(name = "Departure Date & Time")
    private LocalDateTime departureDateTime;

    @Column(name = "Arrival Date & Time")
    private LocalDateTime arrivalDateTime;

    @Column(name = "Duration (hrs)")
    private double durationHours;

    @Column(name = "Stopovers")
    private String stopovers;

    @Column(name = "Aircraft Type")
    private String aircraftType;

    @Column(name = "Class")
    private String flightClass;

    @Column(name = "Booking Source")
    private String bookingSource;

    @Column(name = "Base Fare (BDT)")
    private double baseFareBdt;

    @Column(name = "Tax & Surcharge (BDT)")
    private double taxSurchargeBdt;

    @Column(name = "Total Fare (BDT)")
    private double totalFareBdt;

    @Column(name = "Seasonality")
    private String seasonality;

    @Column(name = "Days Before Departure")
    private int daysBeforeDeparture;
}