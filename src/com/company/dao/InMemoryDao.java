package com.company.dao;

import com.company.model.Student;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InMemoryDao {
    private Map<Long, Student> studentMap = new HashMap<>();

    public InMemoryDao() {
        Student student = new Student("Ahmet", "DELLAL");
        studentMap.put(1L, student);
    }

    public void create(Student student) {
        studentMap.put(new Date().getTime(), student);
    }

    public Student getStudentByName(String name) {
        return studentMap.values().stream()
                .filter(student -> student.getName().equals(name))
                .findAny().orElse(null);
    }

    public List<Student> getAllStudent() {
        return studentMap.values().stream()
                .collect(Collectors.toList());
    }
}
