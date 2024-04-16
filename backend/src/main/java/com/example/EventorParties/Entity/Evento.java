package com.example.EventorParties.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "evento")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;


    @Column(name = "fecha")
    private Date fecha;


    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    private Cliente cliente;

    public Evento(){}
    public Evento(Long id, String titulo, String isbn, String genero, Date anioPublicacion, String sinopsis, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
    }





}
