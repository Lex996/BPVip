/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpvip.controller.dto;

import bpvip.entity.Proizvodjac;
import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class UredjajDTO implements Serializable {
    private int IDUredjaj;
    private String naziv;
    private String boja;
    private String model;
    private double cena;
    private ProizvodjacDTO proizvodjac;

    public UredjajDTO() {
        proizvodjac = new ProizvodjacDTO();
    }

    public UredjajDTO(int IDUredjaj, String naziv, String boja, String model, double cena, ProizvodjacDTO proizvodjac) {
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

    public ProizvodjacDTO getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(ProizvodjacDTO proizvodjac) {
        this.proizvodjac = proizvodjac;
    }
    
    
}
