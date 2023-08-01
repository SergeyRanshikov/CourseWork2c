package com.example.coursework2c.controller;


import com.example.coursework2c.model.Question;
import com.example.coursework2c.sevice.JavaQuestionService;
import com.example.coursework2c.sevice.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {
  private final QuestionService service;

    public JavaQuestionController(JavaQuestionService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public Question add(String question, String answer) {
        return service.add(question, answer);
    }

    @GetMapping("/remove")
    public Question remove(String question, String answer) {
        return service.remove(new Question(question, answer));
    }

    @GetMapping
    public Collection<Question> getAll() {
        return service.getAll();
    }
}
