package org.example.csw_exam.repository;

import org.example.csw_exam.model.StudentScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentScoreRepository extends JpaRepository<StudentScore, Long> {
}
