package com.example.coursework2c.sevice;

import com.example.coursework2c.exception.BadRequestException;
import com.example.coursework2c.model.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService service;

    public ExaminerServiceImpl(QuestionService service) {
        this.service = service;
    }


    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount > service.getAll().size()) {
            throw new BadRequestException();
        }
        return Stream.generate(service::getRandomQuestion)
                .distinct()
                .limit(amount)
                .collect(Collectors.toList());
    }

}
