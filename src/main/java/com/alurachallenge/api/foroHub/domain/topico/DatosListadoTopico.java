package com.alurachallenge.api.foroHub.domain.topico;

import java.time.LocalDateTime;

public record DatosListadoTopico(Long id, String título, String mensaje, LocalDateTime fechaDeCreacion, Status status, String autor, Curso curso) {

    public DatosListadoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaDeCreacion(), topico.getStatus(), topico.getAutor(), topico.getCurso());
    }

}


