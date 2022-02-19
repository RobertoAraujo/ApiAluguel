package com.poshyweb.aluguelapi.controller;

import com.poshyweb.aluguelapi.model.InquilinoEntity;
import com.poshyweb.aluguelapi.service.InquilinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class InquilinoController {

    @Autowired
    private InquilinoService service;

    @GetMapping(value = "/listar")
    public ResponseEntity<List<InquilinoEntity>> listarTodos() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping(value = "/nome/{nome}")
    public ResponseEntity<List<InquilinoEntity>> listarPorNome(@PathVariable String nome) {
        return ResponseEntity.ok(service.findByNomeInquilino(nome));
    }

    @GetMapping(value = "id/{id}")
    public ResponseEntity<Object> listarPorId(@PathVariable("id") long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping(value = "/cadastrar")
    public ResponseEntity<InquilinoEntity> cadastrar(
            @RequestBody InquilinoEntity inquilino, UriComponentsBuilder uriBilder) {
        service.save(inquilino);
        URI uri = uriBilder.path("/inquilino/{id}").buildAndExpand(inquilino.getId()).toUri();
        return ResponseEntity.created(uri).body(
                new InquilinoEntity(inquilino.getId(), inquilino.getNome(), inquilino.getCpf(),
                        inquilino.getConjude(), inquilino.getQtdDependentes()));
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity<InquilinoEntity> update(@Validated @PathVariable Long id, @RequestBody InquilinoEntity inquilino) {
        InquilinoEntity entity = service.update(id, inquilino);
        return ResponseEntity.ok().body(entity);
    }

    @DeleteMapping(value = "/deletar/{id}")
    public ResponseEntity<InquilinoEntity> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }


}
