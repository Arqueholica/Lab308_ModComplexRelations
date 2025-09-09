package com.ironhack.Lab308_2_ModComplexRelations.model_Events;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.List;

@Entity

public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer event_ID;
    private String event_title;
    private DateFormat event_date;
    private DecimalFormat event_duration;
    private String event_location;
    private List<Guest> guestList;



}
