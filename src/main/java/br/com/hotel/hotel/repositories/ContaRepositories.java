package br.com.hotel.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hotel.hotel.entities.Conta;

public interface ContaRepositories extends JpaRepository<Conta, Long>{
    
}
