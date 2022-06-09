package com.naya.exams.history.services;

import com.naya.exams.history.model.Exercise;

import java.util.List;

/**
 * @author vladislav_syrov
 */
public interface HistoryExerciseService {
    List<Exercise> getRandom(int amount);

    void setVersion(int version);

    int getVersion();

    void fillDB();
}
