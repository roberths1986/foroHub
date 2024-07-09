package com.alurachallenge.api.foroHub.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaDeCreacion;
    @Enumerated(EnumType.STRING)
    private Status status;
    private String autor;
    @Enumerated(EnumType.STRING)
    private Curso curso;
    private Boolean activo;

    public Topico(DatosRegistroTopico datosRegistroTopico) {

        this.titulo = datosRegistroTopico.titulo();
        this.mensaje = datosRegistroTopico.mensaje();
        this.fechaDeCreacion = LocalDateTime.now();
        this.status = datosRegistroTopico.status();
        this.autor = datosRegistroTopico.autor();
        this.curso = datosRegistroTopico.curso();
        this.activo = true;

    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {

        if (datosActualizarTopico.titulo() != null) {
            this.titulo = datosActualizarTopico.titulo();
        }

        if (datosActualizarTopico.mensaje() != null) {
            this.mensaje = datosActualizarTopico.mensaje();
        }

        if (datosActualizarTopico.status() != null) {
            this.status = datosActualizarTopico.status();
        }

        if (datosActualizarTopico.autor() != null) {
            this.autor = datosActualizarTopico.autor();
        }

        if (datosActualizarTopico.curso() != null) {
            this.curso = datosActualizarTopico.curso();
        }
    }

    public void desactivarTopico() {
        this.activo = false;
    }
}