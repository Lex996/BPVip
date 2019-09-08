/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpvip.service.impl;

import bpvip.entity.Uredjaj;
import bpvip.repository.UredjajRepository;
import bpvip.service.UredjajService;
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
public class UredjajServiceImpl implements UredjajService {
    @Autowired
    private UredjajRepository uredjajRepository;

   

    @Override
    public void deleteUredjaj(int IDUredjaj) {
        uredjajRepository.deleteById(IDUredjaj);
    }

    @Override
    public Uredjaj getOne(int IDUredjaj) {
         Optional<Uredjaj> uredjaj = uredjajRepository.findById(IDUredjaj);
        if(uredjaj.isPresent()) {
            return uredjaj.get();
        }
        return null;
    }

    @Override
    public Uredjaj saveOrUpdateUredjaj(Uredjaj u) {
        return uredjajRepository.save(u);
    }

    @Override
    public List<Uredjaj> getAll() {
        return uredjajRepository.findAll();
    }
    
    
}
