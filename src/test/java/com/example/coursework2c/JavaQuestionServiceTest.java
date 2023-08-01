package com.example.coursework2c;

import com.example.coursework2c.model.Question;
import com.example.coursework2c.sevice.JavaQuestionService;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;


public class JavaQuestionServiceTest {
    JavaQuestionService service = new JavaQuestionService();

    @Test
    void add() {
        service.add(new Question("1","2"));
        service.add(new Question("3","4"));

        Collection<Question>actual = service.getAll();
        assertEquals(2,actual.size());
        assertTrue(actual.contains(new Question("1","2")));
        assertTrue(actual.contains(new Question("3","4")));

    }
    @Test
    void remove() {
        service.add(new Question("1","2"));
        service.add(new Question("3","4"));

        Collection<Question>actual = service.getAll();
        service.remove(new Question("1","2"));

        assertEquals(1,actual.size());
        assertFalse(actual.contains(new Question("1","2")));
        assertTrue(actual.contains(new Question("3","4")));

    }

}
