package com.inventarioprestamo.extraordinariobd.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "inventario") //hace referencia a la tabla de la base de datos con el nombre inventario
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //llave primaria de la tabla inventario
    @Getter @Setter @Column(name = "INV_ID")
    private int inv_id;

    //atributos de la tabla inventario
    @Getter @Setter @Column(name = "INV_CLAVE")
    private String inv_clave;

    @Getter @Setter @Column(name = "INV_DESCRIPCION")
    private String inv_descripcion;

    @Getter @Setter @Column(name = "INV_MARCA")
    private String inv_marca;

    @Getter @Setter @Column(name = "INV_MODELO")
    private String inv_modelo;

    @Getter @Setter @Column(name = "UBI_ID")
    private int ubi_id;
}
