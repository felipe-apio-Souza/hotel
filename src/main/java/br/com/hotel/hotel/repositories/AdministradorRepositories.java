package br.com.hotel.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hotel.hotel.entities.Administrador;

public interface AdministradorRepositories extends JpaRepository<Administrador, Integer>{
    
}
