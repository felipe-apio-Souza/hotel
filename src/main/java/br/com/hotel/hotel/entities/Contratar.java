package br.com.hotel.hotel.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Contratar")
public class Contratar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Date data;

    @OneToMany
    @JoinColumn(name = "cpf")
    private Candidatos candidatos;
    @OneToOne
    @JoinColumn(name = "cnpj")
    private Administrador administrador;
    
    
    public Contratar() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Candidatos getCandidatos() {
        return candidatos;
    }
    public void setCandidatos(Candidatos candidatos) {
        this.candidatos = candidatos;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    
    public Administrador getAdministrador() {
        return administrador;
    }
    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
    
}
