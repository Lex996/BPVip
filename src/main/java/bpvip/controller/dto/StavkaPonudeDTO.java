/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpvip.controller.dto;

import bpvip.entity.Ponuda;
import bpvip.entity.Uredjaj;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 *
 * @author Admin
 */
public class StavkaPonudeDTO implements Serializable {
    
    private int rb;
    private Uredjaj uredjaj;
    @JsonIgnore
    private PonudaDTO ponuda;
    public StavkaPonudeDTO() {
    }

    public StavkaPonudeDTO(int rb, Uredjaj uredjaj,PonudaDTO ponuda) {
        this.rb = rb;
        this.uredjaj = uredjaj;
        this.ponuda = ponuda;
    }

    public int getRb() {
        return rb;
    }

    public void setRb(int rb) {
        this.rb = rb;
    }

    public Uredjaj getUredjaj() {
        return uredjaj;
    }

    public void setUredjaj(Uredjaj uredjaj) {
        this.uredjaj = uredjaj;
    }


    public PonudaDTO getPonuda() {
        return ponuda;
    }

    public void setPonuda(PonudaDTO ponuda) {
        this.ponuda = ponuda;
    }
    
    
}
