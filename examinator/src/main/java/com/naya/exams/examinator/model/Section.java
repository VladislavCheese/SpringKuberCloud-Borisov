package com.naya.exams.examinator.model;

import lombok.*;

import java.util.List;

/**
 * @author vladislav_syrov
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Section {
    private String title;
    private String desc;
    @Singular
    private List<Exercise> exercises;
}
