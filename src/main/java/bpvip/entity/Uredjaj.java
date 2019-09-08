/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpvip.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

/**
 *
 * @author Admin
 */

@Entity
public class Uredjaj implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDUredjaj;
    private String naziv;
    private String boja;
    private String model;
    private double cena;
    @ManyToOne
    private Proizvodjac proizvodjac;

    public Uredjaj() {
        proizvodjac = new Proizvodjac();
    }

    public Uredjaj(int IDUredjaj, String naziv, String boja, String model, double cena, Proizvodjac proizvodjac) {
        this.IDUredjaj = IDUredjaj;
        this.naziv = naziv;
        this.boja = boja;
        this.model = model;
        this.cena = cena;
        this.proizvodjac = proizvodjac;
    }

    public int getIDUredjaj() {
        return IDUredjaj;
    }

    public void setIDUredjaj(int IDUredjaj) {
        this.IDUredjaj = IDUredjaj;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Proizvodjac getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(Proizvodjac proizvodjac) {
        this.proizvodjac = proizvodjac;
    }
    
    
    
}
