/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpvip.controller;

import bpvip.controller.dto.UredjajDTO;
import bpvip.entity.Uredjaj;
import bpvip.service.UredjajService;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Admin
 */
@RestController
@RequestMapping("/uredjaj")
@CrossOrigin
public class UredjajController {
    @Autowired
    private UredjajService uredjajService;
    
    @Autowired
    private ModelMapper modelMapper;
    
    @GetMapping("/all")
    public List<UredjajDTO> getAll() {
        List<Uredjaj> uredjaji = uredjajService.getAll();
       
        return uredjaji.stream()
                .map(ob -> modelMapper.map(ob, UredjajDTO.class))
                .collect(Collectors.toList());
    }
    
    @GetMapping("/{IDUredjaj}")
    public UredjajDTO getOne(@PathVariable int IDUredjaj) {
        Uredjaj uredjaj = uredjajService.getOne(IDUredjaj);
        return modelMapper.map(uredjaj, UredjajDTO.class);
    }
    
    @PostMapping("/save")
    public Uredjaj save(@RequestBody UredjajDTO dto) {
        Uredjaj uredjaj = modelMapper.map(dto, Uredjaj.class);
        System.out.println(dto.getNaziv()+ dto.getBoja() + dto.getCena() + dto.getIDUredjaj());
        return uredjajService.saveOrUpdateUredjaj(uredjaj);
    }
    
    @PutMapping("/update")
    public void update(@RequestBody UredjajDTO dto) {
        Uredjaj uredjaj = modelMapper.map(dto, Uredjaj.class);
        uredjajService.saveOrUpdateUredjaj(uredjaj);
    }
    
    @DeleteMapping("/delete/{IDUredjaj}")
    public void delete(@PathVariable int IDUredjaj) {
        uredjajService.deleteUredjaj(IDUredjaj);
    }
    
    
}
