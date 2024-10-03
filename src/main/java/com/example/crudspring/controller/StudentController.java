package com.example.crudspring.controller;

import com.example.crudspring.entity.Student;
import com.example.crudspring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/{studentId}")
    public Optional <Student> getStudent(@PathVariable("studentId") Long studentId) {
        return studentService.getStudent(studentId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Student student) { //el request body me indica que debo pasar datos de una estructura
        studentService.saveOrUpdate(student);
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) { //pasa una vairbale que es id student
        studentService.deleteStudent(studentId);
    }

}
