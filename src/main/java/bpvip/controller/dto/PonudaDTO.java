/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpvip.controller.dto;

import bpvip.entity.Klijent;
import bpvip.entity.StavkaPonude;
import bpvip.entity.Zaposleni;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 *
 * @author Admin
 */
public class PonudaDTO implements Serializable {
    
    private int IDPonude;
    private Date datum;
    private Klijent klijent;
    private Zaposleni zaposleni;
    private List<StavkaPonudeDTO> stavkePonude;

    public PonudaDTO() {
    }

    public PonudaDTO(int IDPonude, Date datum, Klijent klijent, Zaposleni zaposleni, List<StavkaPonudeDTO> stavkePonude) {
        this.IDPonude = IDPonude;
        this.datum = datum;
        this.klijent = klijent;
        this.zaposleni = zaposleni;
        this.stavkePonude = stavkePonude;
    }

    public int getIDPonude() {
        return IDPonude;
    }

    public void setIDPonude(int IDPonude) {
        this.IDPonude = IDPonude;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    public Zaposleni getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    public List<StavkaPonudeDTO> getStavkePonude() {
        return stavkePonude;
    }

    public void setStavkePonude(List<StavkaPonudeDTO> stavkePonude) {
        this.stavkePonude = stavkePonude;
    }
    
    
}
