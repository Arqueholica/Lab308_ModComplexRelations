package com.ironhack.Lab308_2_ModComplexRelations.model_Events;

import jakarta.persistence.*;


@Entity

public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer guest_ID;

    private String guest_name;

    @Enumerated(EnumType.STRING)
    private guest_Status status;
}
