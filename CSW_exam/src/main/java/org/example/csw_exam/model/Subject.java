package org.example.csw_exam.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "subject_t")
@Getter
@Setter
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private int subjectId;

    @Column(name = "subject_code")
    private String subjectCode;

    @Column(name = "subject_name")
    private String subjectName;

    @Column(name = "credit")
    private int credit;

    public Subject() {

    }

    public Subject(int subjectId, String subjectCode, String subjectName, int credit) {
        this.subjectId = subjectId;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.credit = credit;
    }

}
