package com.example.springbootwithhibernate.repositories;

import com.example.springbootwithhibernate.entities.Student;
import org.springframework.data.repository.Repository;

public interface StudentRepository extends Repository<Student, Long> {

    Student findStudentById(Long id); //
}
