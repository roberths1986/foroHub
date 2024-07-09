package com.alurachallenge.api.foroHub.domain.topico;

public record DatosRespuestaTopico(Long id, String titulo, String mensaje, Status status, String autor, Curso curso) {
}