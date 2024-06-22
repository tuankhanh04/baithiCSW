package org.example.csw_exam.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "student_t")
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "student_code")
    private String studentCode;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "address")
    private String address;

    public Student() {

    }

    public Student(Long studentId, String studentCode, String fullName, String address) {
        this.studentId = studentId;
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.address = address;
    }


}
