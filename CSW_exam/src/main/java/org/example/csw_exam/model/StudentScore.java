package org.example.csw_exam.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "student_score_t")
@Getter
@Setter

public class StudentScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_score_id")
    private Long studentScoreId;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @Column(name = "score1")
    private BigDecimal score1;

    @Column(name = "score2")
    private BigDecimal score2;

    public StudentScore() {

    }

    public StudentScore(Long studentScoreId, Student student, Subject subject, BigDecimal score1, BigDecimal score2) {
        this.studentScoreId = studentScoreId;
        this.student = student;
        this.subject = subject;
        this.score1 = score1;
        this.score2 = score2;
    }
}
