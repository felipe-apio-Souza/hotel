package br.com.hotel.hotel.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Contratar")
public class Contratar {
    @Id
    private Integer id;
    public Contratar() {
    }
    @Column(nullable = false)
    private Date data;
    @Column(nullable = false)
    private String cpf;
    public Contratar(Integer id, Date data, String cpf, String cnpj) {
        this.id = id;
        this.data = data;
        this.cpf = cpf;
        this.cnpj = cnpj;
    }
    @Column(nullable = false)
    private String cnpj;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
}
