package com.ironhack.Lab308_2_ModComplexRelations.model_Events;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import java.util.List;


@Entity

public class Conference extends Event{

    @ManyToMany
    @JoinTable(
            name = "conference_Speakers",
            joinColumns = @JoinColumn(name = "conference_id"),
            inverseJoinColumns = @JoinColumn(name = "speaker_id")

    )

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
