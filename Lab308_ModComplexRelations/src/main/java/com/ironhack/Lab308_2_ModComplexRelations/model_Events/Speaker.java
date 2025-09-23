package com.ironhack.Lab308_2_ModComplexRelations.model_Events;

import jakarta.persistence.*;


import java.text.DecimalFormat;
import java.util.List;

@Entity


public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer speaker_ID;

    private String speaker_name;
    private DecimalFormat presentation_duration;



    @ManyToMany(mappedBy = "speakerList")
    private List<Conference> conferences;



    public Speaker() {
    }


    public Integer getSpeaker_ID() {
        return speaker_ID;
    }

    public void setSpeaker_ID(Integer speaker_ID) {
        this.speaker_ID = speaker_ID;
    }

    public String getSpeaker_name() {
        return speaker_name;
    }

    public void setSpeaker_name(String speaker_name) {
        this.speaker_name = speaker_name;
    }

    public DecimalFormat getPresentation_duration() {
        return presentation_duration;
    }

    public void setPresentation_duration(DecimalFormat presentation_duration) {
        this.presentation_duration = presentation_duration;
    }

    public List<Conference> getConferences() {
        return conferences;
    }

    public void setConferences(List<Conference> conferences) {
        this.conferences = conferences;
    }
}
