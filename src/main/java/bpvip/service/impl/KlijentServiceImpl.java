/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpvip.service.impl;

import bpvip.entity.Klijent;
import bpvip.repository.KlijentRepository;
import bpvip.service.KlijentService;
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
public class KlijentServiceImpl implements KlijentService {
    
    @Autowired
    private KlijentRepository klijentRepository;
    
    @Override
    public Klijent findKlijent(int IDKlijent) {
        Optional<Klijent> klijent = klijentRepository.findById(IDKlijent);
        if(klijent.isPresent()) {
            return klijent.get();
           
        }
        
        return null;
    }

    @Override
    public List<Klijent> getAll() {
        return klijentRepository.findAll();
    }
}
