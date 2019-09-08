/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpvip.service.impl;

import bpvip.entity.Proizvodjac;
import bpvip.repository.ProizvodjacRepository;
import bpvip.service.ProizvodjacService;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */

@Service
@Transactional
public class ProizvodjacServiceImpl implements ProizvodjacService {
    
    @Autowired
    private ProizvodjacRepository proizvodjacRepository;

    @Override
    public Proizvodjac findProizvodjac(int IDProizvodjac) {
        Optional<Proizvodjac> proizvodjac = proizvodjacRepository.findById(IDProizvodjac);
        if(proizvodjac.isPresent()) {
            return proizvodjac.get();
        }
        return null;
    }

    @Override
    public List<Proizvodjac> getAll() {
       return proizvodjacRepository.findAll();
    }
    
    
    
}
