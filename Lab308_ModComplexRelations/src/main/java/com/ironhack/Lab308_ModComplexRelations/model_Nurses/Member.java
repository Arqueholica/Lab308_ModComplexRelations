package com.ironhack.Lab308_ModComplexRelations.model_Nurses;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer member_ID;
    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;

    private LocalDate renewal_date;

    @ManyToOne
    @JoinColumn(name = "chapterName", referencedColumnName = "chapter_name")
    private Chapter chapter;

//    CONSTRUCTORES


    public Member() {
    }

    public Member(String name, Status status, LocalDate renewal_date) {
        this.name = name;
        this.status = status;
        this.renewal_date = renewal_date;
    }

    //    GETTERS&SETTERS


    public Integer getMember_ID() {
        return member_ID;
    }

    public void setMember_ID(Integer member_ID) {
        this.member_ID = member_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getRenewal_date() {
        return renewal_date;
    }

    public void setRenewal_date(LocalDate renewal_date) {
        this.renewal_date = renewal_date;
    }


    @Override
    public String toString() {
        return "MEMBER" + '\n' +
                "Member ID: " + member_ID + '\n' +
                "Name: " + name + '\n' +
                "Status: " + status + '\n' +
                "Renewal Date:" + renewal_date + '\n';
    }
}
