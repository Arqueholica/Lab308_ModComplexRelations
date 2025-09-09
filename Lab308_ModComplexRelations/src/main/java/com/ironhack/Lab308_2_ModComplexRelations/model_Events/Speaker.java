package com.ironhack.Lab308_2_ModComplexRelations.model_Events;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import java.text.DecimalFormat;

@Entity


public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer speaker_ID;

    private String speaker_name;
    private DecimalFormat presentation_duration;

}
