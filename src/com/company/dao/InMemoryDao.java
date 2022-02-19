package com.company.dao;

import com.company.model.Student;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//ahmet dellal
public class InMemoryDao {
    private Map<Long, Student> studentMap = new HashMap<>();

    public InMemoryDao() {
        Student student = new Student("Ahmet", "DELLAL");
        studentMap.put(1L, student);
    }

    public void create(Student student) {
        studentMap.put(new Date().getTime(), student);
    }

    
    //pull requesr görüntülenmesi icin eklendi.
    public Student getStudentByName(String name) {
        return studentMap.values().stream()
                .filter(student -> student.getName().equals(name))
                .findAny().orElse(null);
    }

    //pull requesr görüntülenmesi icin eklendi.
    public Student getStudentByName2(String name) {
        return studentMap.values().stream()
                .filter(student -> student.getName().equals(name))
                .findAny().orElse(null);
    }



    public List<Student> getAllStudent2() {
        return studentMap.values().stream()
                .collect(Collectors.toList());
    }
    //deneme
    public List<Student> getAllStudent() {
        return studentMap.values().stream()
                .collect(Collectors.toList());
    }

    //deneme3
    public List<Student> getAllStudent3() {
        return studentMap.values().stream()
                .collect(Collectors.toList());
    }

    //yaşı 15 den büyük olanları getirmesi
    public List<Student> getStudentListOnAge(){
        return studentMap.values().stream()
                .filter(student -> student.getAge() > 15)
                .collect(Collectors.toList());
    }



    public List<Student> getNameIsZeynep(){
        return studentMap.values().stream()
                .filter(student -> student.getSecondryName().equals("zeynep"))
                .collect(Collectors.toList());
    }

}
