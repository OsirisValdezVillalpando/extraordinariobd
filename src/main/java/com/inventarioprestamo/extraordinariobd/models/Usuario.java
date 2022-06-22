package com.inventarioprestamo.extraordinariobd.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "usuario") //hace referencia a la tabla de la base de datos con el nombre usuario
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //llave primaria de la tabla usuario
    @Getter @Setter @Column(name = "USU_ID")
    private int usu_id;

    //atributos de la tabla usuario
    @Getter @Setter @Column(name = "USU_PASWORD")
    private String usu_pasword;

    @Getter @Setter @Column(name = "USU_NOMBRE")
    private String usu_nombre;

    @Getter @Setter @Column(name = "USU_APELLIDO")
    private String usu_apellido;

    @Getter @Setter @Column(name = "USU_NO_TELEFONO")
    private String usu_no_telefono;

    @Getter @Setter @Column(name = "USU_EMAIL")
    private String usu_email;
}
