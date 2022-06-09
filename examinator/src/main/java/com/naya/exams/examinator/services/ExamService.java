package com.naya.exams.examinator.services;

import com.naya.exams.examinator.model.CheckedExam;
import com.naya.exams.examinator.model.Exercise;
import com.naya.exams.examinator.model.SolvedExam;

import java.util.List;

/**
 * @author vladislav_syrov
 */
public interface ExamService {

    CheckedExam convert(SolvedExam solvedExam);

    List<Exercise> getExercises();
}
