package com.poshyweb.aluguelapi.service;

import com.poshyweb.aluguelapi.model.InquilinoEntity;
import com.poshyweb.aluguelapi.repository.InquilinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InquilinoService {

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

    public Optional<InquilinoEntity> findById(Long id) {
        return repository.findById(id);
    }

    public InquilinoEntity update(Long id, InquilinoEntity inquilino) {
        InquilinoEntity entity = repository.getById(id);
        entity.setNome(inquilino.getNome());
        entity.setCpf(inquilino.getCpf());
        entity.setConjude(inquilino.getConjude());
        entity.setQtdDependentes(inquilino.getQtdDependentes());
        return repository.save(entity);
    }

    public InquilinoEntity delete(Long id) {
        InquilinoEntity inquilinoEntity= repository.getById(id);
        try {
            repository.deleteById(id);
        } catch (Exception e) {
            System.out.println(e+"aqui deu pau"+ e.getMessage());
        }
        return inquilinoEntity;
    }

}
