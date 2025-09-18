package com.ironhack.Lab308_2_ModComplexRelations.model_Events;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;

@Entity

public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer event_ID;
    private String event_title;
    private Date event_date;
    private DecimalFormat event_duration;
    private String event_location;
    private List<Guest> guestList;

    public Event() {
    }

    public Integer getEvent_ID() {
        return event_ID;
    }

    public void setEvent_ID(Integer event_ID) {
        this.event_ID = event_ID;
    }

    public String getEvent_title() {
        return event_title;
    }

    public void setEvent_title(String event_title) {
        this.event_title = event_title;
    }

    public Date getEvent_date() {
        return event_date;
    }

    public void setEvent_date(Date event_date) {
        this.event_date = event_date;
    }

    public DecimalFormat getEvent_duration() {
        return event_duration;
    }

    public void setEvent_duration(DecimalFormat event_duration) {
        this.event_duration = event_duration;
    }

    public String getEvent_location() {
        return event_location;
    }

    public void setEvent_location(String event_location) {
        this.event_location = event_location;
    }

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(List<Guest> guestList) {
        this.guestList = guestList;
    }
}
