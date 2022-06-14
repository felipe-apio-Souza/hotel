package br.com.hotel.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hotel.hotel.entities.Quarto;

public Interface QuartoRepositories extends JpaRepository<Quarto, Long>{
    
}