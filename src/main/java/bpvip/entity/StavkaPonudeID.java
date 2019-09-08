/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpvip.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Admin
 */
@Embeddable
public class StavkaPonudeID implements Serializable {
    
    private int IDPonude;
    private int rb;

    public StavkaPonudeID() {
    }

    public StavkaPonudeID(int IDPonude, int rb) {
        this.IDPonude = IDPonude;
        this.rb = rb;
    }

    public int getIDPonude() {
        return IDPonude;
    }

    public void setIDPonude(int IDPonude) {
        this.IDPonude = IDPonude;
    }

    public int getRb() {
        return rb;
    }

    public void setRb(int rb) {
        this.rb = rb;
    }

  
    
    
    
}
