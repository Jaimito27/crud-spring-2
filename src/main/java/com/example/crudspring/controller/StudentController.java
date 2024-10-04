package com.example.crudspring.controller;

import com.example.crudspring.entity.Student;
import com.example.crudspring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public void createStudent(@RequestBody Student student) { //el request body me indica que debo pasar datos de una estructura
        studentService.createStudent(student);
    }

    @PatchMapping("/{studentId}")
    public ResponseEntity<Student> updateStudent(@PathVariable("studentId") Long studentId, @RequestBody Student student) {
        return ResponseEntity.ok(studentService.updateStudent(studentId, student));
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) { //pasa una vairbale que es id student
        studentService.deleteStudent(studentId);
    }

}
