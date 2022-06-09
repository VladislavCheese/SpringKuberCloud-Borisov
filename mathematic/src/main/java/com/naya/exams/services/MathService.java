package com.naya.exams.services;

import com.naya.exams.model.Exercise;

/**
 * @author vladislav_syrov
 */
public interface MathService {
    Exercise getRandomExercise();

    /**
     * Get max available value in the exercise.
     * @return
     */
    int getMaxAvailableNumber();
}
