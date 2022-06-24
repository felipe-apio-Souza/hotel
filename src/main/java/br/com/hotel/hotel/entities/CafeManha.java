package br.com.hotel.hotel.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CafeManha")
public class CafeManha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String data;
    @Column(nullable = false)
    private String comida;
    @Column(nullable = false)
    private String bebida;

    
    public Long getId() {
        return id;
    }
    public void setId(final Long id) {
        this.id = id;
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
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    
    
    
}
