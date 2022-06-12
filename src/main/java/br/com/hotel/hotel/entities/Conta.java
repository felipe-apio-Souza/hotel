package br.com.hotel.hotel.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Conta")
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Date data;
    @Column(nullable = false)
    private Double salarios;
    @Column(nullable = false)
    private Double custosHospedagem;

    
    public Conta() {
    }
    public Conta(Integer id, Date data, Double salarios, Double custosHospedagem) {
        this.id = id;
        this.data = data;
        this.salarios = salarios;
        this.custosHospedagem = custosHospedagem;
    }
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
    public Double getSalarios() {
        return salarios;
    }
    public void setSalarios(Double salarios) {
        this.salarios = salarios;
    }
    public Double getCustosHospedagem() {
        return custosHospedagem;
    }
    public void setCustosHospedagem(Double custosHospedagem) {
        this.custosHospedagem = custosHospedagem;
    }

    
}
