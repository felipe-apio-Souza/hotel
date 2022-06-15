package br.com.hotel.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hotel.hotel.entities.Hospede;

public interface HospedeRepositories extends JpaRepository<Hospede, String>{
    
}
