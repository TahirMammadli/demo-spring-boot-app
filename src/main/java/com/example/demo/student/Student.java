package com.example.demo.student;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Integer age;
    private Long id;
    private String name;
    private LocalDate dob;
    private String email;

    public Student() {
    }

    public Student(Integer age, Long id, String name, LocalDate dob, String email) {
        this.age = age;
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.email = email;
    }

    public Student(Integer age, String name, LocalDate dob, String email) {
        this.age = age;
        this.name = name;
        this.dob = dob;
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                '}';
    }
}
