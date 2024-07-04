package com.alurachallenge.api.foroHub.topico;

import jakarta.validation.constraints.NotNull;


public record DatosRegistroTopico(
        @NotNull
        String titulo,
        @NotNull
        String mensaje,
        @NotNull
        Status status,
        @NotNull
        String autor,
        @NotNull
        Curso curso) {
}