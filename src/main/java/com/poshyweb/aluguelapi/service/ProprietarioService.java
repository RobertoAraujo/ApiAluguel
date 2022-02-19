package com.poshyweb.aluguelapi.service;

import com.poshyweb.aluguelapi.model.Proprietario;
import com.poshyweb.aluguelapi.repository.ProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProprietarioService {

    @Autowired
    private ProprietarioRepository repository;

    public List<Proprietario> listaDeProprietarios() {
        return repository.findAll();
    }
}
