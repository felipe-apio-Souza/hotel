package br.com.hotel.hotel.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class LiberarQuartos{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Refencia many to one
    @OneToMany
    @JoinColumn(name = "id")
    private Long idQuarto;
    @OneToOne
    @JoinColumn(name = "id")
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
