package org.example.csw_exam.controller;

import org.example.csw_exam.model.Subject;
import org.example.csw_exam.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @PostMapping("/")
    public Subject addSubject(@RequestBody Subject subject) {
        return subjectService.saveOrUpdateSubject(subject);
    }

    @GetMapping("/")
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Subject> getSubjectById(@PathVariable Long id) {
        Optional<Subject> subject = subjectService.getSubjectById(id);
        return subject.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
