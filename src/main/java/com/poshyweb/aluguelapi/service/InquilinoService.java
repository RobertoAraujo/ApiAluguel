package com.poshyweb.aluguelapi.service;

import com.poshyweb.aluguelapi.model.InquilinoEntity;
import com.poshyweb.aluguelapi.repository.InquilinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class InquilinoService implements Serializable {

    @Autowired
    private InquilinoRepository repository;

    public void save(InquilinoEntity inquilino) {
        repository.save(inquilino);
    }

    public List<InquilinoEntity> findAll() {
        return repository.findAll();
    }

    public List<InquilinoEntity> findByNomeInquilino(String nome) {
        return repository.findAllByNomeIsLike(nome);
    }

    public Object findById(Long id) {
        return repository.findById(id);
    }
}
