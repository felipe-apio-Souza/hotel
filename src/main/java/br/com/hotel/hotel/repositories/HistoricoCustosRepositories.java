package br.com.hotel.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hotel.hotel.entities.HistoricoCustos;

public interface HistoricoCustosRepositories extends JpaRepository<HistoricoCustos, Long>{
    
}
