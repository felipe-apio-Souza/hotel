package br.com.hotel.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hotel.hotel.entities.Hospedagem;

public interface HospedagemRepositories extends JpaRepository<Hospedagem, Long>{
    
}
