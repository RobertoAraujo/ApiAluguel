package com.poshyweb.aluguelapi.controller;

import com.poshyweb.aluguelapi.model.Proprietario;
import com.poshyweb.aluguelapi.service.ProprietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/v1/proprietario")
public class ProprietarioController {

    @Autowired
    private ProprietarioService service;

    @GetMapping(value = "/listar")
    public ResponseEntity<List<Proprietario>> listar(){
        return ResponseEntity.ok().body(service.listaDeProprietarios());
    }

    @PostMapping(value = "/cadastrar")
    public List<Proprietario> cadastrarProprietario(@RequestBody Proprietario proprietario, UriComponentsBuilder uriBuilder){
        service.save(proprietario);
        URI uri = uriBuilder.path("cadastrado/{id}").buildAndExpand(proprietario.getId()).toUri();
        return null;
    }
}
