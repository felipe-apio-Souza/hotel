package br.com.hotel.hotel.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Hospede")
public class Hospede {
    @Id
    private String cpf;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String inicioHospedagem;
    @Column(nullable = false)
    private String fimHospedagem;
    @Column(nullable = false)
    private Double custoHospedagem;
    @Column(nullable = false)
    private Integer qtdPessoas;
    @Column(nullable = false)
    private String senha;

    //relacionamento
    /* 
    @OneToOne
    @JoinColumn(name = "id_quarto")
    private Quarto quarto;
    */
    
    

    
    
    /* 
    public Quarto getQuarto() {
        return quarto;
    }
    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
    */
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getInicioHospedagem() {
        return inicioHospedagem;
    }
    public void setInicioHospedagem(String inicioHospedagem) {
        this.inicioHospedagem = inicioHospedagem;
    }
    public String getFimHospedagem() {
        return fimHospedagem;
    }
    public void setFimHospedagem(String fimHospedagem) {
        this.fimHospedagem = fimHospedagem;
    }
    public Double getCustoHospedagem() {
        return custoHospedagem;
    }
    public void setCustoHospedagem(Double custoHospedagem) {
        this.custoHospedagem = custoHospedagem;
    }
    public Integer getQtdPessoas() {
        return qtdPessoas;
    }
    public void setQtdPessoas(Integer qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }


    
}
