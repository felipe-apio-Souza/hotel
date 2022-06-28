package br.com.hotel.hotel.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "Hospedagem")
public class Hospedagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String cpfHospede;
    @Column(nullable = false)
    private Long idQuarto;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCpfHospede() {
        return cpfHospede;
    }
    public void setCpfHospede(String cpfHospede) {
        this.cpfHospede = cpfHospede;
    }
    public Long getIdQuarto() {
        return idQuarto;
    }
    public void setIdQuarto(Long idQuarto) {
        this.idQuarto = idQuarto;
    }
}
