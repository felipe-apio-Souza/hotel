package br.com.hotel.hotel.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Candidatos")
public class Candidatos {

        private Pessoa pessoa;
        @Column
        private String curriculo;
        @Column(nullable = false)
        private String email;
        @Column(nullable = false)
        private String numero;
        @Column(nullable = false)
        private String endereco;
        @Column(nullable = false)

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getCurriculo() {
            return curriculo;
        }

        public void setCurriculo(String curriculo) {
            this.curriculo = curriculo;
        }

        public String getEmail() {
            return email;
        }
    
        public void setEmail(String email) {
            this.email = email;
        }
    
        public String getNumero() {
            return numero;
        }
    
        public void setNumero(String numero) {
            this.numero = numero;
        }
    
        public String getEndereco() {
            return endereco;
        }
    
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }
    
        public String getNome() {
            return nome;
        }
    
        public void setEndereco(String nome) {
            this.nome = nome;
        }
        public Candidatos() {

        }
        

        

}