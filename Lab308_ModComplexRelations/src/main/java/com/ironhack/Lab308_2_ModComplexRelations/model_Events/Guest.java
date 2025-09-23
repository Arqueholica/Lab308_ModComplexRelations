package com.ironhack.Lab308_2_ModComplexRelations.model_Events;

import jakarta.persistence.*;

import java.util.List;


@Entity

public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer guest_ID;

    private String guest_name;

    @Enumerated(EnumType.STRING)
    private guest_Status status;


    @ManyToMany(mappedBy = "guestList")
    private List<Event> events;



    public Guest() {
    }


    public Integer getGuest_ID() {
        return guest_ID;
    }

    public void setGuest_ID(Integer guest_ID) {
        this.guest_ID = guest_ID;
    }

    public String getGuest_name() {
        return guest_name;
    }

    public void setGuest_name(String guest_name) {
        this.guest_name = guest_name;
    }

    public guest_Status getStatus() {
        return status;
    }

    public void setStatus(guest_Status status) {
        this.status = status;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
