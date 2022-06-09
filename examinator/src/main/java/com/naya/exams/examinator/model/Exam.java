package com.naya.exams.examinator.model;

import lombok.*;

import java.util.List;

/**
 * @author vladislav_syrov
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Exam {
    private String title;
    @Singular
    private List<Section> sections;
}
