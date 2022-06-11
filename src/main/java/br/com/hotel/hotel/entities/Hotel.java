package br.com.hotel.hotel.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Hotel")
public class Hotel {
    @Id
    private String cnpj;
    @Column(nullable = false)
    private String endereco;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Hotel(String cnpj, String endereco) {
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public Hotel() {
    }

    
}