package br.com.hotel.hotel.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
    @Column(nullable = false)
    private String senha;

    //relacionemtos

    @OneToMany
    @JoinColumn(name = "id_conta")
    private List<Conta> conta;
    @OneToMany
    @JoinColumn(name = "id_quarto")
    private List<Quarto> quartos;
    @OneToOne
    @JoinColumn(name = "id_contratar")
    private Contratar contratar;
    @OneToMany
    @JoinColumn(name = "id_funcionario")
    private List<Funcionario> funcionarios;
    @OneToMany
    @JoinColumn(name = "id_faleConosco")
    private List<FaleConosco> faleConosco;

    public Contratar getContratar() {
        return contratar;
    }

    public void setContratar(Contratar contratar) {
        this.contratar = contratar;
    }

    public Administrador() {
    }
    
    public List<Conta> getConta() {
        return conta;
    }

    public void setConta(List<Conta> conta) {
        this.conta = conta;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<FaleConosco> getFaleConosco() {
        return faleConosco;
    }

    public void setFaleConosco(List<FaleConosco> faleConosco) {
        this.faleConosco = faleConosco;
    }

    public String getCnpj() {
        return cnpj;
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
