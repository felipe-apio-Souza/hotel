package br.com.hotel.hotel.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Candidatos")
public class Candidatos {
        @Id
        private String cpf;
        @Column(nullable = false)
        private String telefone;
        @Column(nullable = false)
        private String curriculo;
        @Column(nullable = false)
        private String email;
        @Column(nullable = false)
        private String numero;
        @Column(nullable = false)
        private String endereco;

        //relacionamentos
        @OneToOne
        @JoinColumn(name = "id_contratar")
        private Contratar contratar;
        
        
        
        public Contratar getContratar() {
            return contratar;
        }
        public void setContratar(Contratar contratar) {
            this.contratar = contratar;
        }
        public Candidatos() {

        }
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
        

        

}