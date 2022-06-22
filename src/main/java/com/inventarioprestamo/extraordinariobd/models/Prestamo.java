package com.inventarioprestamo.extraordinariobd.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "prestamo") //hace referencia a la tabla de la base de datos con el nombre prestamo
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //llave primaria de la tabla prestamo
    @Getter @Setter @Column(name = "PRE_ID")
    private int pre_id;

    //atributos de la tabla prestamo
    @Getter @Setter @Column(name = "SOL_ID")
    private int sol_id;

    @Getter @Setter @Column(name = "PRE_FECHA_INICIO")
    private Date pre_fecha_inicio;

    @Getter @Setter @Column(name = "PRE_FECHA_DEVOLUCION")
    private Date pre_fecha_devolucion;

    @Getter @Setter @Column(name = "PRE_FECHA_ENTREGA")
    private Date pre_fecha_entrega;

    @Getter @Setter @Column(name = "USU_ID")
    private int usu_id;

    @Getter @Setter @Column(name = "DOC_AUTORIZA")
    private int doc_autoriza;

    @Getter @Setter @Column(name = "PRE_OBSERVACIONES")
    private String pre_observaciones;

    @Getter @Setter @Column(name = "PRE_ESTADO")
    private int pre_estado;

    @Getter @Setter @Column(name = "INV_ID")
    private int inv_id;
}
