package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        24,
                        1L,
                        "Tahir",
                        LocalDate.of(1998, Month.JULY, 13),
                        "tahirmammadli13@gmail.com"
                )
        );
    }
}
