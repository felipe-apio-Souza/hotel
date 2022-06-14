package br.com.hotel.hotel.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Conta")
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Date data;
    @Column(nullable = false)
    private Double salarios;
    @Column(nullable = false)
    private Double custosHospedagem;

    @OneToOne
    @JoinColumn(name = "cnpj")
    private Administrador administrador;
    
    public Conta() {
    }
    
    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
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
