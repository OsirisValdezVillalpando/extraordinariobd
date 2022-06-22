package com.inventarioprestamo.extraordinariobd.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "alumno") //hace referencia a la tabla de la base de datos con el nombre alumno
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //llave primaria de la tabla alumno
    @Getter @Setter @Column(name = "SOL_ID")
    private int sol_id;

    //atributos de la tabla alumno
    @Getter @Setter @Column(name = "ALU_CARRERA")
    private String alu_carrera;
}
