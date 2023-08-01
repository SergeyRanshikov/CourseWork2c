package com.example.coursework2c.sevice;

import com.example.coursework2c.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
