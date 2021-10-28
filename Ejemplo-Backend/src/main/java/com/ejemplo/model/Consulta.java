package com.ejemplo.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "consultas")
public class Consulta
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idConsulta;

    @Column(name = "fecha", nullable = false)
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "id_paciente", nullable = false,
            foreignKey = @ForeignKey(name = "FK_consulta_pacinte"))
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "id_medico", nullable = false,
            foreignKey = @ForeignKey(name = "FK_consulta_medico"))
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "id_especialidad", nullable = false,
            foreignKey = @ForeignKey(name = "FK_consulta_especialidad"))
    private Especialiadad especialiadad;

    @Column(name = "num_consultorio", length = 3, nullable = true)
    private String numConsultorio;

    public Integer getIdConsulta()
    {
        return idConsulta;
    }

    public void setIdConsulta(Integer idConsulta)
    {
        this.idConsulta = idConsulta;
    }

    public LocalDateTime getFecha()
    {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha)
    {
        this.fecha = fecha;
    }

    public Paciente getPaciente()
    {
        return paciente;
    }

    public void setPaciente(Paciente paciente)
    {
        this.paciente = paciente;
    }

    public Medico getMedico()
    {
        return medico;
    }

    public void setMedico(Medico medico)
    {
        this.medico = medico;
    }

    public Especialiadad getEspecialiadad()
    {
        return especialiadad;
    }

    public void setEspecialiadad(Especialiadad especialiadad)
    {
        this.especialiadad = especialiadad;
    }

    public String getNumConsultorio()
    {
        return numConsultorio;
    }

    public void setNumConsultorio(String numConsultorio)
    {
        this.numConsultorio = numConsultorio;
    }
}
