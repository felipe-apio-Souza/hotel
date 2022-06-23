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
@Table(name = "CafeManha")
public class CafeManha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Date horarioInicio;
    @Column(nullable = false)
    private Date horarioTermino;
    @Column(nullable = false)
    private String comida;
    @Column(nullable = false)
    private String bebida;

    //relacionamento
   
    @OneToOne
    @JoinColumn(name = "funcionario")
    private Funcionario funcionario;
    public Long getId() {
        return id;
    }
    public void setId(final Long id) {
        this.id = id;
    }
    public Date getHorarioInicio() {
        return horarioInicio;
    }
    public void setHorarioInicio(final Date horarioInicio) {
        this.horarioInicio = horarioInicio;
    }
    public Date getHorarioTermino() {
        return horarioTermino;
    }
    public void setHorarioTermino(final Date horarioTermino) {
        this.horarioTermino = horarioTermino;
    }
    public String getComida() {
        return comida;
    }
    public void setComida(final String comida) {
        this.comida = comida;
    }
    public String getBebida() {
        return bebida;
    }
    public void setBebida(final String bebida) {
        this.bebida = bebida;
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(final Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
}
