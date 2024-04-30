package com.assign.quizeonline.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Question {

    // defining primary key
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;

    @NotBlank(message = "cant be empty ")
    private String question;

    @NotBlank
    private String subject;


    @NotBlank
    private String questionType;

    // table many to many
    // annotation used for mapping of string
    @NotBlank
    @ElementCollection
    private List<String> choices;

    @NotBlank
    @ElementCollection
    private List<String> correctAnswers;
}
