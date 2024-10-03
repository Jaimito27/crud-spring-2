package com.example.crudspring.repository;

import com.example.crudspring.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> { //le indico que extiendo de jpa repository y hago referencia a la entidad Student y el tipo de dato del campo primario


}
