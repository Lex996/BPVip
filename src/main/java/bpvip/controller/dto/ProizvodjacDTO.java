/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpvip.controller.dto;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class ProizvodjacDTO implements Serializable {
    
    private int IDProizvodjac;
    private String nazivproizvodjaca;

    public ProizvodjacDTO() {
    }

    public ProizvodjacDTO(int IDProizvodjac, String naziv) {
        this.IDProizvodjac = IDProizvodjac;
        this.nazivproizvodjaca = naziv;
    }

    public int getIDProizvodjac() {
        return IDProizvodjac;
    }

    public void setIDProizvodjac(int IDProizvodjac) {
        this.IDProizvodjac = IDProizvodjac;
    }

    public String getNazivproizvodjaca() {
        return nazivproizvodjaca;
    }

    public void setNazivproizvodjaca(String nazivProizvodjaca) {
        this.nazivproizvodjaca = nazivProizvodjaca;
    }

  
    
    
}
