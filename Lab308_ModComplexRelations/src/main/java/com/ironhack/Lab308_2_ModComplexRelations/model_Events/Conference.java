package com.ironhack.Lab308_2_ModComplexRelations.model_Events;

import jakarta.persistence.Entity;

import java.util.List;


@Entity

public class Conference extends Event{

    private List<Speaker> speakerList;



    public Conference() {
    }


    public List<Speaker> getSpeakerList() {
        return speakerList;
    }

    public void setSpeakerList(List<Speaker> speakerList) {
        this.speakerList = speakerList;
    }
}
