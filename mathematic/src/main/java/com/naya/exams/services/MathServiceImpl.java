package com.naya.exams.services;

import com.naya.exams.model.Exercise;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author vladislav_syrov
 */
@Service
@RefreshScope
public class MathServiceImpl implements MathService {

    @Value("${math.max:1000}")
    private int max;

    private final Random random = new Random();

    @Override
    public Exercise getRandomExercise() {
        int a = random.nextInt(max);
        int b = random.nextInt(max);
        return Exercise.builder().question(a + " + " + b + " = ?").answer(String.valueOf(a + b)).build();
    }

    @Override
    public int getMaxAvailableNumber() {
        return max;
    }
}


















