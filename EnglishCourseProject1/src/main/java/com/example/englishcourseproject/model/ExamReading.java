package com.example.englishcourseproject.model;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Setter
@Getter
public class ExamReading {


    @Id
    private Long id;


}