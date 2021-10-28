package com.ejemplo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="medicos")
public class Medico
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMedico;

    @NotNull
    @Size(min = 3, message = "Nombre debe tener minimo 3 caracteres")
    @Column(name = "nombres", nullable = false, length = 78)
    private String nombres;

    @NotNull
    @Size(min = 3, message = "Apellido debe tener minimo 3 caracteres")
    @Column(name = "apellidos", nullable = false, length = 78)
    private String apellidos;

    @Column(name = "cmp", nullable = false, length = 12, unique = true)
    private String cmp;

    @Column(name = "foto_url", nullable = true)
    private String fotoUrl;

    public Integer getIdMedico()
    {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico)
    {
        this.idMedico = idMedico;
    }

    public String getNombres()
    {
        return nombres;
    }

    public void setNombres(String nombres)
    {
        this.nombres = nombres;
    }

    public String getApellidos()
    {
        return apellidos;
    }

    public void setApellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }

    public String getCmp()
    {
        return cmp;
    }

    public void setCmp(String cmp)
    {
        this.cmp = cmp;
    }

    public String getFotoUrl()
    {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl)
    {
        this.fotoUrl = fotoUrl;
    }
}
