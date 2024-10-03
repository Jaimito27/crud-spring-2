package com.example.crudspring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data //ya no es obligatorio agregar get y set

@Entity
@Table(name = "tbl_student")
public class Student {

}
