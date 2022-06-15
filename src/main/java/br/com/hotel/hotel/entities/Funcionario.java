package br.com.hotel.hotel.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.List;

@Entity 
@Table(name = "Funcionario")
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

    //relacionamentos
    @OneToMany
    @JoinColumn(name = "id_liberaQuarto")
    private List<LiberarQuartos> LiberarQuartos;
    @OneToOne
    @JoinColumn(name = "cnpj_administrador")
    private Administrador administrador;
    @OneToMany
    @JoinColumn(name = "id_cafeManha")
    private List<CafeManha> cafeManhas;

    

    public List<LiberarQuartos> getLiberarQuartos() {
        return LiberarQuartos;
    }

    public void setLiberarQuartos(List<LiberarQuartos> liberarQuartos) {
        LiberarQuartos = liberarQuartos;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public List<CafeManha> getCafeManhas() {
        return cafeManhas;
    }

    public void setCafeManhas(List<CafeManha> cafeManhas) {
        this.cafeManhas = cafeManhas;
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