package com.example.crudspring.service;

import com.example.crudspring.entity.Student;
import com.example.crudspring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(Long id){
        return studentRepository.findById(id);
    }

    public void createStudent(Student student){
        studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student studentUpdated){
        Optional<Student> student = studentRepository.findById(id);
        if(student.isPresent()){
            Student updatedStudent = student.get();
            updatedStudent.setFirstName(studentUpdated.getFirstName());
            updatedStudent.setLastName(studentUpdated.getLastName());
            updatedStudent.setEmail(studentUpdated.getEmail());
            return studentRepository.save(updatedStudent);
        }else{
            throw new RuntimeException("Usuario no encontrado");
        }
    }

    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }
}
