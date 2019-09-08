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
public class KlijentDTO implements Serializable {
    
    private int IDKlijent;
    private String nazivklijenta;

    public KlijentDTO() {
    }

    public KlijentDTO(int IDKlijent, String naziv) {
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
