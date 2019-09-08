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
public class ZaposleniDTO implements Serializable{
    private int IDZaposleni;
    private String imeIPrezime;
    private String korisnickoIme;
    private String korisnickaSifra;

    public ZaposleniDTO() {
    }

    public ZaposleniDTO(int IDZaposleni, String imeIPrezime, String korisnickoIme, String korisnickaSifra) {
        this.IDZaposleni = IDZaposleni;
        this.imeIPrezime = imeIPrezime;
        this.korisnickoIme = korisnickoIme;
        this.korisnickaSifra = korisnickaSifra;
    }

    public int getIDZaposleni() {
        return IDZaposleni;
    }

    public void setIDZaposleni(int IDZaposleni) {
        this.IDZaposleni = IDZaposleni;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getKorisnickaSifra() {
        return korisnickaSifra;
    }

    public void setKorisnickaSifra(String korisnickaSifra) {
        this.korisnickaSifra = korisnickaSifra;
    }
    
    
    
}
