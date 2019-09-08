/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpvip.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

/**
 *
 * @author Admin
 */

@Entity
public class Ponuda implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IDPonude;
    @Temporal(TemporalType.DATE)
    private Date datum;
    @ManyToOne
    private Klijent klijent;
    @ManyToOne
    private Zaposleni zaposleni;
    @OneToMany( fetch = FetchType.LAZY,  mappedBy = "ponuda", orphanRemoval = true)
    @NotFound(action = NotFoundAction.IGNORE)
    @JsonManagedReference
    private List<StavkaPonude> stavkePonude;

    public Ponuda() {
    }

    public Ponuda(int IDPonude, Date datum, Klijent klijent, Zaposleni zaposleni, List<StavkaPonude> stavkePonude) {
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

    public List<StavkaPonude> getStavkePonude() {
        return stavkePonude;
    }

    public void setStavkePonude(List<StavkaPonude> stavkePonude) {
        this.stavkePonude = stavkePonude;
    }
    
    
    
}
