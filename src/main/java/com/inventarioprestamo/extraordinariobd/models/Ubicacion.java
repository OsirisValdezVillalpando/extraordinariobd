package com.inventarioprestamo.extraordinariobd.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ubicacion")//hace referencia a la tabla de la base de datos con el nombre ubicacion
public class Ubicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//llave primaria de la tabla ubicacion
    @Getter @Setter @Column(name = "UBI_ID")
    private int ubi_id;

    //atributos de la tabla ubicacion
    @Getter @Setter @Column(name = "UBI_NOMBRE")
    private String ubi_nombre;
}
