/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpvip.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Admin
 */

@Entity
public class Proizvodjac implements Serializable {
    @Id
    private int IDProizvodjac;
    private String nazivproizvodjaca;

    public Proizvodjac() {
    }

    public Proizvodjac(int IDProizvodjac, String naziv) {
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
