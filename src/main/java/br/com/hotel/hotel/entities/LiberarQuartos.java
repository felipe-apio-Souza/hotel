package br.com.hotel.hotel.entities;

import java.util.Date;
import java.util.List;

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
@Table(name = "LiberarQuartos")
public class LiberarQuartos{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //relacionemtnos 
    /*
    @OneToMany
    @JoinColumn(name = "id_quarto")
    private List<Quarto> quartos;
    */
    @OneToOne
    @JoinColumn(name = "id_funcionario")
    private Funcionario funcionario;
/* 
    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }
    */

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Column(nullable = false, name = "HoraLiberacaoQuarto")
    private Date horaLiberacao;

    public LiberarQuartos() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getHoraLiberacao() {
        return horaLiberacao;
    }

    public void setHoraLiberacao(Date horaLiberacao) {
        this.horaLiberacao = horaLiberacao;
    }


}
