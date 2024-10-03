package com.example.crudspring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data //ya no es obligatorio agregar get y set

@Entity
@Table(name = "tbl_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;


}
