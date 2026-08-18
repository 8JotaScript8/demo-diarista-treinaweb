package br.com.treinaweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.demo.models.Diarista;

public interface DiaristaRepository extends JpaRepository<Diarista, Long> {
    
}
