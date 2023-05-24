package com.example.springbootdockercomposexample.repository;


import com.example.springbootdockercomposexample.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
