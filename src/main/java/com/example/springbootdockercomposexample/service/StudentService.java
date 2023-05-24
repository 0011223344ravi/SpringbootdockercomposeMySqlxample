package com.example.springbootdockercomposexample.service;



import com.example.springbootdockercomposexample.entity.Student;

import java.util.List;

public interface StudentService {



        List<Student> getAllStudents();
        Student getStudentById(Integer studentId);
        Student createStudent(Student student);
        Student updateStudent(Student student,  Integer studentId);
        Student deleteStudent(Integer studentId);


}
