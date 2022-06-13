package br.com.hotel.hotel.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Funcionario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, name = "NomeFuncionario")
    private String nome;
    @Column(nullable = false, unique = true, name = "PisFuncionario")
    private String pis;
    @Column(nullable = false, unique = true, name = "CpfFuncionario")
    private String cpf;
    @Column(nullable = false, unique = true, name = "EmailFuncionario")
    private String email;
    @Column(nullable = false, unique = true, name = "TelefoneFuncionario")
    private String telefone;
    @Column(nullable = false, name = "EnderecoFuncionario")
    private String Endereco;
    @Column(nullable = false, name = "SalarioFuncionario")
    private String salario;
    @Column(nullable = false, name = "SenhaFuncionario")
    private String senha;

    public Funcionario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    

}