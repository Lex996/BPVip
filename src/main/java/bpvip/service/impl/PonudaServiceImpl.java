/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpvip.service.impl;

import bpvip.entity.Ponuda;
import bpvip.entity.StavkaPonude;
import bpvip.repository.PonudaRepository;
import bpvip.repository.StavkaPonudeRepository;
import bpvip.service.PonudaService;
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
public class PonudaServiceImpl implements PonudaService{
    @Autowired
    private PonudaRepository ponudaRepository;
    @Autowired
    private StavkaPonudeRepository stavkaPonudeRepository;

    @Override
    public Ponuda savePonuda(Ponuda p) {
        Optional<Ponuda> optionalP = ponudaRepository.findById(p.getIDPonude());

        if (optionalP.isPresent()) {
            stavkaPonudeRepository.deleteByPonudaIDPonude(p.getIDPonude());
        }

        Ponuda savedP = ponudaRepository.save(p);

        if (p.getStavkePonude()!= null) {
            for (StavkaPonude spd : p.getStavkePonude()) {
                spd.setPonuda(savedP);
            }
            stavkaPonudeRepository.saveAll(p.getStavkePonude());
        }
        return savedP;
    }

    @Override
    public Ponuda updatePonuda(Ponuda p) {
        stavkaPonudeRepository.deleteByPonudaIDPonude(p.getIDPonude());
        return savePonuda(p);
    }

    @Override
    public void deletePonuda(int IDPonude) {
         ponudaRepository.deleteById(IDPonude);
    }

    @Override
    public Ponuda findOne(int IDPonude) {
        Optional<Ponuda> p = ponudaRepository.findById(IDPonude);
        if (p.isPresent()) {
            return p.get();
        }
        return null;
    }

    @Override
    public List<Ponuda> getAll() {
        return ponudaRepository.findAll();
    }
    
    
    
}
