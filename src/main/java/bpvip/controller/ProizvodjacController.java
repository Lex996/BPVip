/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpvip.controller;

import bpvip.controller.dto.KlijentDTO;
import bpvip.controller.dto.ProizvodjacDTO;
import bpvip.controller.dto.ZaposleniDTO;
import bpvip.entity.Klijent;
import bpvip.entity.Proizvodjac;
import bpvip.entity.Zaposleni;
import bpvip.service.ProizvodjacService;
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
@RequestMapping("/proizvodjac")
@CrossOrigin
public class ProizvodjacController {
    @Autowired
    private ModelMapper modelMapper;
    
    @Autowired
    private ProizvodjacService proizvodjacService;
    
    @GetMapping("/all")
    public List<ProizvodjacDTO> getAll() {
        List<Proizvodjac> proizvodjaci = proizvodjacService.getAll();

        return proizvodjaci.stream()
                .map(ob -> modelMapper.map(ob, ProizvodjacDTO.class))
                .collect(Collectors.toList());
    }
    
    @GetMapping("/{IDProizvodjac}")
    public ProizvodjacDTO findProizovdjac(@PathVariable int IDProizvodjac) {
        Proizvodjac proizvodjac = proizvodjacService.findProizvodjac(IDProizvodjac);
        
        return modelMapper.map(proizvodjac, ProizvodjacDTO.class);
    }
}
