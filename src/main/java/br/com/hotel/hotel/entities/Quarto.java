package br.com.hotel.hotel.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "Quarto")
public class Quarto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Boolean disponibilidade;
    @Column(nullable = false)
    private Integer qtdCamaCasal;
    @Column(nullable = false)
    private Integer qtdCamaSolteiro;
    @Column(nullable = false)
    private Boolean limpeza;
    @Column(nullable = false)
    @Lob
    private byte[] imagem;
    @Column(nullable = false)
    private String titulo;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private Double precoDiaria;

    //relacionamentos
    /* 
    @OneToOne
    @JoinColumn(name = "id_hospede")
    private Hospede hospede;
    
    @OneToOne
    @JoinColumn(name = "id_liberaQuartos")
    private LiberarQuartos liberarQuartos;

    public Hospede getHospede() {
        return hospede;
    }
    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }
    
    public LiberarQuartos getLiberarQuartos() {
        return liberarQuartos;
    }
    public void setLiberarQuartos(LiberarQuartos liberarQuartos) {
        this.liberarQuartos = liberarQuartos;
    }
    */
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Boolean getDisponibilidade() {
        return disponibilidade;
    }
    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    public Integer getQtdCamaCasal() {
        return qtdCamaCasal;
    }
    public void setQtdCamaCasal(Integer qtdCamaCasal) {
        this.qtdCamaCasal = qtdCamaCasal;
    }
    public Integer getQtdCamaSolteiro() {
        return qtdCamaSolteiro;
    }
    public void setQtdCamaSolteiro(Integer qtdCamaSolteiro) {
        this.qtdCamaSolteiro = qtdCamaSolteiro;
    }
    public Boolean getLimpeza() {
        return limpeza;
    }
    public void setLimpeza(Boolean limpeza) {
        this.limpeza = limpeza;
    }
    
    public byte[] getImagem() {
        return imagem;
    }
    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getPrecoDiaria() {
        return precoDiaria;
    }
    public void setPrecoDiaria(Double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }
}