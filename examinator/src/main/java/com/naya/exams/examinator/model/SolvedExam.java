package com.naya.exams.examinator.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Delegate;

/**
 * @author vladislav_syrov
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SolvedExam {
    @Delegate
    @JsonIgnore
    private Exam exam = new Exam();

    private String student;


}
