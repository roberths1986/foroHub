package com.alurachallenge.api.foroHub.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull
        Long id,
        String titulo,
        String mensaje,
        Status status,
        String autor,
        Curso curso) {
}
