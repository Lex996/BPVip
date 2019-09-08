/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpvip.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

/**
 *
 * @author Admin
 */

@Entity
public class StavkaPonude implements Serializable{
    @EmbeddedId
    private StavkaPonudeID stavkaPonudeID;
    @ManyToOne
    private Uredjaj uredjaj;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("IDPonude")
    @JoinColumn
    @JsonBackReference
    private Ponuda ponuda;
    

    public StavkaPonude() {
    }

    public StavkaPonude(StavkaPonudeID stavkaPonudeID, Uredjaj uredjaj, Ponuda ponuda) {
        this.stavkaPonudeID = stavkaPonudeID;
        this.uredjaj = uredjaj;
        this.ponuda = ponuda;
    }

    

    
    public Uredjaj getUredjaj() {
        return uredjaj;
    }

    public void setUredjaj(Uredjaj uredjaj) {
        this.uredjaj = uredjaj;
    }


    public Ponuda getPonuda() {
        return ponuda;
    }

    public void setPonuda(Ponuda ponuda) {
        this.ponuda = ponuda;
    }

    public StavkaPonudeID getStavkaPonudeID() {
        return stavkaPonudeID;
    }

    public void setStavkaPonudeID(StavkaPonudeID stavkaPonudeID) {
        this.stavkaPonudeID = stavkaPonudeID;
    }

}
