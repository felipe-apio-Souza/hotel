package br.com.hotel.hotel.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private Interger QtdCamaCasal;
    @Column(nullable = false)
    private Interger QtdCamaSolteiro;
    @Column(nullable = false)
    private Boolean limpeza;
    @Column(nullable = false)
    private String foto;
    @Column(nullable = false)
    private String titulo;
    @Column(nullable = false)
    private String descricao;
    @Column(nullable = false)
    private Double precoDiaria;
}