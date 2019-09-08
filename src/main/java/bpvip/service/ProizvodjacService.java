/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpvip.service;

import bpvip.entity.Klijent;
import bpvip.entity.Proizvodjac;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface ProizvodjacService {
    
    public Proizvodjac findProizvodjac(int IDProizvodjac);
    public List<Proizvodjac> getAll();
}
