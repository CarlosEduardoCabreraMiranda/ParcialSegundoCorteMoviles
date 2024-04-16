package com.example.EventorParties.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "correo_electronico", length = 50, nullable = false)
    private String correo_electronico;




    public Cliente(){}
    public Cliente(Long id, String nombre, String apellido, String nacionalidad, Date fechaNacimiento, String biografia) {
        this.id = id;
        this.nombre = nombre;
    }
}
