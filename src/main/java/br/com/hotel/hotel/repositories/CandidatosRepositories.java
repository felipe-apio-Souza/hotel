package br.com.hotel.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hotel.hotel.entities.Candidatos;

public interface CandidatosRepositories extends JpaRepository<Candidatos,String> {

}