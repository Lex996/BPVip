/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpvip.service.impl;

import bpvip.entity.Zaposleni;
import bpvip.repository.ZaposleniRepository;
import bpvip.service.ZaposleniService;
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
public class ZaposleniServiceImpl implements ZaposleniService {
    @Autowired
    private ZaposleniRepository zaposleniRepository;

    @Override
    public Zaposleni findZaposleni(int IDZaposleni) {
         Optional<Zaposleni> zaposleni = zaposleniRepository.findById(IDZaposleni);
        if (zaposleni.isPresent()) {
            return zaposleni.get();
        }
        return null;
    }

    @Override
    public List<Zaposleni> getAll() {
        return zaposleniRepository.findAll();
    }
    
    
           
}
