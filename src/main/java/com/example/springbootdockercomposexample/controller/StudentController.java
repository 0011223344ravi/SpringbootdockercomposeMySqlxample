package com.example.springbootdockercomposexample.controller;
import com.example.springbootdockercomposexample.entity.Student;
import com.example.springbootdockercomposexample.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

     @Autowired
    private StudentService studentService;



    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")

    public Student getStudentById(@PathVariable Integer id) {

        return studentService.getStudentById(id);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @PutMapping("/{id}")

    public Student updateStudent( @RequestBody Student student,@PathVariable Integer id) {
        return studentService.updateStudent(student , id);
    }


    @DeleteMapping("/{id}")
    public Student deleteStudent(@PathVariable Integer id) {
       return studentService.deleteStudent(id);
    }
}

