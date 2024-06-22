package org.example.csw_exam.controller;

import org.example.csw_exam.model.StudentScore;
import org.example.csw_exam.service.StudentScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api/scores")
public class StudentScoreController {
    @Autowired
    private StudentScoreService studentScoreService;

    @PostMapping("/")
    public StudentScore addStudentScore(@RequestBody StudentScore studentScore) {
        return studentScoreService.saveOrUpdateStudentScore(studentScore);
    }

    @GetMapping("/")
    public List<StudentScore> getAllStudentScores() {
        return studentScoreService.getAllStudentScores();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentScore> getStudentScoreById(@PathVariable Long id) {
        Optional<StudentScore> studentScore = studentScoreService.getStudentScoreById(id);
        return studentScore.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/grade/{score1}/{score2}")
    public String calculateGrade(@PathVariable double score1, @PathVariable double score2) {
        return studentScoreService.calculateGrade(score1, score2);
    }
}
