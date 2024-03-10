package com.example.englishcourseproject.model.test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class TestExam extends Category implements Serializable {

    String name;
    String image;
    int member;
    int time;
    int numPart;

    public TestExam( String name, String image, int member, int time, int numPart, String nameCategory) {

        super(nameCategory);
        this.name = name;
        this.image = image;
        this.member = member;
        this.time = time;
        this.numPart = numPart;
    }

    public String getCategoryName() {

        return super.getName();
    }

}
