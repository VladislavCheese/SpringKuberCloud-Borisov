package com.naya.exams.examinator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author vladislav_syrov
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Exercise {
    private String question;
    private String answer;
}
