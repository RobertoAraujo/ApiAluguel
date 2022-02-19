package com.poshyweb.aluguelapi.repository;

import com.poshyweb.aluguelapi.model.InquilinoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InquilinoRepository extends JpaRepository<InquilinoEntity, Long> {

    List<InquilinoEntity> findAllByNomeIsLike(String nome);

    Optional<InquilinoEntity> findById(Long id);

    Optional<InquilinoEntity> deleteBy();
}
