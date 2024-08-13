package com.example.question_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String questionTitle;
    public String option1;
    public String option2;
    public String option3;
    public String option4;
    public String rightAnswer;
    public String difficultyLevel;
    public String category;
}
