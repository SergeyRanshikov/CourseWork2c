package com.example.coursework2c;


import com.example.coursework2c.model.Question;
import com.example.coursework2c.sevice.ExaminerServiceImpl;
import com.example.coursework2c.sevice.QuestionService;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceTest {

    @Mock
    QuestionService questionService;

    @InjectMocks
    ExaminerServiceImpl examinerService;

    private List<Question> questions = List.of(
            new Question("a", "b"),
            new Question("c","d"),
            new Question("e","f")
    );

    @Test
    void getQuestions() {
        when(questionService.getAll()).thenReturn(questions);
        when(questionService.getRandomQuestion())
                .thenReturn(questions.get(1))
                .thenReturn(questions.get(2))
                .thenReturn(questions.get(0));
        Collection<Question> actual = examinerService.getQuestions(2);
        assertEquals(2, actual.size());
        assertTrue(questions.containsAll(actual));
    }
}
