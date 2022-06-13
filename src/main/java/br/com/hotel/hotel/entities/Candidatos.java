package br.com.hotel.hotel.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Candidatos")
public class Candidatos {

        @Id
        @Column(nullable = false)
        private String cpf;
        @Column
        private String curriculo;

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

        public Candidatos() {

        }
        

        

}