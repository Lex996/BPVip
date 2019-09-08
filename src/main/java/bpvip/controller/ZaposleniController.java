/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpvip.controller;

import bpvip.controller.dto.KlijentDTO;
import bpvip.controller.dto.ZaposleniDTO;
import bpvip.entity.Klijent;
import bpvip.entity.Zaposleni;
import bpvip.service.ZaposleniService;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Admin
 */
@RestController
@RequestMapping("/zaposleni")
@CrossOrigin
public class ZaposleniController {
    @Autowired
    private ModelMapper modelMapper;
    
    @Autowired
    private ZaposleniService zaposleniService;
    
    @GetMapping("/all")
    public List<ZaposleniDTO> getAll() {
        List<Zaposleni> klijenti = zaposleniService.getAll();

        return klijenti.stream()
                .map(ob -> modelMapper.map(ob, ZaposleniDTO.class))
                .collect(Collectors.toList());
    }
    
    @GetMapping("/{IDZaposleni}")
    public ZaposleniDTO findZaposleni(@PathVariable int IDZaposleni) {
        Zaposleni zaposleni = zaposleniService.findZaposleni(IDZaposleni);
        
        return modelMapper.map(zaposleni, ZaposleniDTO.class);
    }
}
