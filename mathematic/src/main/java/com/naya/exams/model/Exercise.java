package com.naya.exams.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Wither;

/**
 * @author vladislav_syrov
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@Wither
public class Exercise {
    private String question;
    private String answer;

}