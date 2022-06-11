package br.com.hotel.hotel.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Administrador")
public class Administrador {
    @Id
    private String cnpj;
    @Column(nullable = false)
    private Integer id;
    @Column(nullable = false)
    private String email;
    public Administrador() {
    }
    private String senha;
    public String getCnpj() {
        return cnpj;
    }
    public Administrador(String cnpj, Integer id, String email, String senha) {
        this.cnpj = cnpj;
        this.id = id;
        this.email = email;
        this.senha = senha;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    
}
