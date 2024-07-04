package com.alurachallenge.api.foroHub.controller;

import com.alurachallenge.api.foroHub.topico.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public void registrarTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico) {
        topicoRepository.save(new Topico(datosRegistroTopico));
    }

    @GetMapping
    public Page<DatosListadoTopico> listadoTopicos(@PageableDefault(size = 10, sort = "fechaDeCreacion", direction = Sort.Direction.ASC) Pageable paginacion) {
//        return topicoRepository.findAll(paginacion).map(DatosListadoTopico::new);
        return topicoRepository.findByActivoTrue(paginacion).map(DatosListadoTopico::new);

    }

    @GetMapping("/{id}")
    @Operation(summary = "Consulta tópicos por Id")
    public ResponseEntity<DatosListadoTopico> retornaDatosTopico(@PathVariable Long id) {
        Topico topico = topicoRepository.getReferenceById(id);
        var datosTopico = new DatosListadoTopico(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaDeCreacion(),
                topico.getStatus(), topico.getAutor(), topico.getCurso());
        return ResponseEntity.ok(datosTopico);


    }

    @PutMapping
    @Transactional
    public void actualizarTopico(@RequestBody @Valid DatosActualizarTopico datosActualizarTopico) {
        Topico topico = topicoRepository.getReferenceById(datosActualizarTopico.id());
        topico.actualizarDatos(datosActualizarTopico);

    }

    // DELETE LOGICO QUE PERMITE QUE LA INFORMACION CONTINUE EN LA BASE DE DATOS
    @DeleteMapping("/{id}")
    @Transactional
    public void eliminarTopico(@PathVariable Long id) {
        Topico topico = topicoRepository.getReferenceById(id);
        topico.desactivarTopico();
    }


// DELETE EN BASE DE DATOS --- DELETE REAL
//    public void eliminarTopico(@PathVariable Long id) {
//    Topico topico = topicoRepository.getReferenceById(id);
//    topicoRepository.delete(topico);
//    }


}




