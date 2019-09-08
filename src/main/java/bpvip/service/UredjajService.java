/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpvip.service;

import bpvip.entity.Uredjaj;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface UredjajService {
    
    public Uredjaj saveOrUpdateUredjaj(Uredjaj u);
    public void deleteUredjaj(int IDUredjaj);
    public Uredjaj getOne(int IDUredjaj);
     public List<Uredjaj> getAll();
    
}
