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
public class Klijent implements Serializable {
    @Id
    private int IDKlijent;
    private String nazivklijenta;

    public Klijent() {
    }

    public Klijent(int IDKlijent, String naziv) {
        this.IDKlijent = IDKlijent;
        this.nazivklijenta = naziv;
    }

    public int getIDKlijent() {
        return IDKlijent;
    }

    public void setIDKlijent(int IDKlijent) {
        this.IDKlijent = IDKlijent;
    }

    public String getNazivklijenta() {
        return nazivklijenta;
    }

    public void setNazivklijenta(String nazivklijenta) {
        this.nazivklijenta = nazivklijenta;
    }


    
    
}
