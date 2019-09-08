/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpvip.service;

import bpvip.entity.Klijent;
import bpvip.entity.Ponuda;
import bpvip.entity.Uredjaj;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface PonudaService {
    
    public Ponuda savePonuda(Ponuda p);
    public Ponuda updatePonuda(Ponuda p);
    public void deletePonuda(int IDPonude);
    public Ponuda findOne(int IDPonude);
    public List<Ponuda> getAll();
    
    
}
