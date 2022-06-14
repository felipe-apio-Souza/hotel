package br.com.hotel.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hotel.hotel.entities.Funcionario;

public interface FuncionarioRepositories extends JpaRepository<Funcionario, Long>{
    
}