package br.com.hotel.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hotel.hotel.entities.LiberarQuartos;

public interface LiberarQuartosRepositories extends JpaRepository<LiberarQuartos, Long>{
    
}