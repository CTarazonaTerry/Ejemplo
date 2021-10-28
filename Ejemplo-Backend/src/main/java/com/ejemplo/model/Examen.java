package com.ejemplo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "examenes")
public class Examen
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idExamen;

    @NotNull
    @Size(min = 7, message = "Nombre debe tener minimo 7 caracteres")
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "descripcion", nullable = false, length = 50)
    private String descripcion;

    public Integer getIdExamen()
    {
        return idExamen;
    }

    public void setIdExamen(Integer idExamen)
    {
        this.idExamen = idExamen;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
