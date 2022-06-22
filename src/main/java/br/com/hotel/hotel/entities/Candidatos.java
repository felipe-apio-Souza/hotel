package br.com.hotel.hotel.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "Candidatos")
public class Candidatos {
        @Id
        private String cpf;
        @Column(nullable = false)
        private String telefone;
        @Column(nullable = false)
        @Lob
        private byte[] curriculo;
        @Column(nullable = false)
        private String email;
        @Column(nullable = false)
        private String endereco;
        @Column(nullable = true)
        private String nome;
        public String getCpf() {
            return cpf;
        }
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
        public String getTelefone() {
            return telefone;
        }
        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }
        public byte[] getCurriculo() {
            return curriculo;
        }
        public void setCurriculo(byte[] curriculo) {
            this.curriculo = curriculo;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
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
        public void setNome(String nome) {
            this.nome = nome;
        }
            

}
