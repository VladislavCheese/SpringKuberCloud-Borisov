package com.naya.exams.examinator.dao;

import com.naya.exams.examinator.model.Exercise;

import java.util.List;

/**
 * @author vladislav_syrov
 */
public interface ExerciseDao {
    List<Exercise> getDefault();

}
