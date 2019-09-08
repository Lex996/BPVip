/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpvip.controller;

import bpvip.controller.dto.KlijentDTO;
import bpvip.controller.dto.UredjajDTO;
import bpvip.entity.Klijent;
import bpvip.entity.Uredjaj;
import bpvip.service.KlijentService;
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
@RequestMapping("/klijent")
@CrossOrigin
public class KlijentController {
    @Autowired
    private ModelMapper modelMapper;
    
    @Autowired
    private KlijentService klijentService;
    
     @GetMapping("/all")
    public List<KlijentDTO> getAll() {
        List<Klijent> klijenti = klijentService.getAll();

        return klijenti.stream()
                .map(ob -> modelMapper.map(ob, KlijentDTO.class))
                .collect(Collectors.toList());
    }
    @GetMapping("/{IDKlijent}")
    public KlijentDTO findKlijent(@PathVariable int IDKlijent) {
        Klijent klijent = klijentService.findKlijent(IDKlijent);
        
        return modelMapper.map(klijent, KlijentDTO.class);
    }
}
