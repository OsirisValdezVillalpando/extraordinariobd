package com.inventarioprestamo.extraordinariobd.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "docente") //hace referencia a la tabla de la base de datos con el nombre docente
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //llave primaria de la tabla docente
    @Getter @Setter @Column(name = "SOL_ID")
    private int sol_id;

    //atributos de la tabla docente
    @Getter @Setter @Column(name = "DOC_GRADO")
    private String doc_grado;
}
