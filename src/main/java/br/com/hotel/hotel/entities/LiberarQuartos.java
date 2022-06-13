package br.com.hotel.hotel.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class LiberarQuartos{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Refencia many to one
    private Long idQuarto;
    private Long idFuncionario;

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

    public Long getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(Long idQuarto) {
        this.idQuarto = idQuarto;
    }

    public Long getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Date getHoraLiberacao() {
        return horaLiberacao;
    }

    public void setHoraLiberacao(Date horaLiberacao) {
        this.horaLiberacao = horaLiberacao;
    }


}
