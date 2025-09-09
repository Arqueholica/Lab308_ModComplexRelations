package com.ironhack.Lab308_ModComplexRelations.model_Nurses;


import jakarta.persistence.*;


import java.util.List;

@Entity
public class Chapter {
    @Id
    private String chapter_name;
    private String district;

    @OneToOne
    @JoinColumn(name = "presidentName", referencedColumnName = "member_ID")
    private Member president;

    @OneToMany(mappedBy = "chapter")
    private List<Member> memberList;


//    CONSTRUCTORES


    public Chapter() {
    }

    public Chapter(String chapter_name, String district, Member president, List<Member> memberList) {
        this.chapter_name = chapter_name;
        this.district = district;
        this.president = president;
        this.memberList = memberList;
    }

    //    GETTERS&SETTERS


    public String getChapter_name() {
        return chapter_name;
    }

    public void setChapter_name(String chapter_name) {
        this.chapter_name = chapter_name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
    }


    @Override
    public String toString() {
        return "CHAPTER" + '\n' +
                "Chapter Name: " + chapter_name + '\n' +
                "District:" + district + '\n' +
                "President: " + president + '\n' +
                "Member List:" + memberList + '\n';
    }
}
