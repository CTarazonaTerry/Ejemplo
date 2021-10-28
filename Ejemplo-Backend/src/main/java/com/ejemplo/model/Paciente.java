package com.ejemplo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="pacientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paciente
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPaciente;

    @NotNull
    @Size(min = 3, message = "Nombre debe tener minimo 3 caracteres")
    @Column(name = "nombres", nullable = false, length = 78)
    private String nombres;

    @NotNull
    @Size(min = 3, message = "Apellido debe tener minimo 3 caracteres")
    @Column(name = "apellidos", nullable = false, length = 78)
    private String apellidos;

    @Size(min = 8, max = 8, message = "DNI debe tener 8 caracteres")
    @Column(name = "dni", nullable = false, length = 8, unique = true)
    private String dni;

    @Size(min = 5, max = 150, message = "Direccion debe tener minimo 3 caracteres")
    @Column(name = "direccion", nullable = false, length = 150)
    private String direccion;

    @Size(min = 6, max = 9, message = "Telefono debe tener minimo 4 caracteres")
    @Column(name = "telefono", nullable = false, length = 8)
    private String telefono;

    @Email(message = "Email formato incorrecto")
    @Column(name = "email", nullable = false, length = 55)
    private String email;
}
