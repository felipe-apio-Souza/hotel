package br.com.hotel.hotel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hotel.hotel.entities.Administrador;
import br.com.hotel.hotel.exception.AdministradorNotFoundException;
import br.com.hotel.hotel.repositories.AdministradorRepositories;

@Service
public class AdministradorService {
    
    @Autowired private AdministradorRepositories repo;

    public List<Administrador> listAll(){
        return (List<Administrador>) repo.findAll();
    }

    public void save(Administrador adm){
        repo.save(adm);
    }
    
    public Administrador get(Long id) throws AdministradorNotFoundException{
        Optional<Administrador> result = repo.findById(id);
        if(result.isPresent()){
            return result.get();
        }
        throw new AdministradorNotFoundException("Nao foi possivel obter admn");
    }

    public void delete(Long id) throws AdministradorNotFoundException{
        if(get(id) == null){
            throw new AdministradorNotFoundException("ID inexistente");
        }
        repo.deleteById(id);
    }
}
