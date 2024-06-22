package org.example.csw_exam.service;

import org.example.csw_exam.model.StudentScore;
import org.example.csw_exam.repository.StudentScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentScoreService {
    @Autowired
    private StudentScoreRepository studentScoreRepository;

    public StudentScore saveOrUpdateStudentScore(StudentScore studentScore) {
        return studentScoreRepository.save(studentScore);
    }

    public List<StudentScore> getAllStudentScores() {
        return studentScoreRepository.findAll();
    }

    public Optional<StudentScore> getStudentScoreById(Long id) {
        return studentScoreRepository.findById(id);
    }

    public String calculateGrade(double score1, double score2) {
        double grade = 0.3 * score1 + 0.7 * score2;
        if (grade >= 8.0) {
            return "A";
        } else if (grade >= 6.0) {
            return "B";
        } else if (grade >= 4.0) {
            return "D";
        } else {
            return "F";
        }
    }
}
