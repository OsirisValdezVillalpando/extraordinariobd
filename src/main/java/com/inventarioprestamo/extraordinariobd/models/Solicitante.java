package com.inventarioprestamo.extraordinariobd.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "solicitante") //hace referencia a la tabla de la base de datos con el nombre solicitante
public class Solicitante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//llave primaria de la tabla solicitante
    @Getter @Setter @Column(name = "SOL_ID")
    private int sol_id;

    //atributos de la tabla solicitante
    @Getter @Setter @Column(name = "SOL_NO_MATRICULA")
    private String sol_no_matricula;

    @Getter @Setter @Column(name = "SOL_NOMBRE")
    private String sol_nombre;

    @Getter @Setter @Column(name = "SOL_APELLIDO")
    private String sol_apellido;

    @Getter @Setter @Column(name = "SOL_NO_TELEFONO")
    private String sol_no_telefono;

    @Getter @Setter @Column(name = "SOL_EMAIL")
    private String sol_email;

    @Getter @Setter @Column(name = "SOL_TIPO")
    private char sol_tipo;
}
