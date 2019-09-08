/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpvip.controller;

import bpvip.controller.dto.PonudaDTO;
import bpvip.controller.dto.ProizvodjacDTO;
import bpvip.entity.Ponuda;
import bpvip.entity.Proizvodjac;
import bpvip.entity.StavkaPonudeID;
import bpvip.service.PonudaService;
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
@RequestMapping("/ponuda")
@CrossOrigin
public class PonudaController {
    
    @Autowired
    private PonudaService ponudaService;

    @Autowired
    private ModelMapper modelMapper;
    
    @GetMapping("/all")
    public List<PonudaDTO> getAll() {
        List<Ponuda> ponude = ponudaService.getAll();

        return ponude.stream()
                .map(ob -> modelMapper.map(ob, PonudaDTO.class))
                .collect(Collectors.toList());
    }
    
    @GetMapping("/{IDPonude}")
    public PonudaDTO findOne(@PathVariable int IDPonude) {
        Ponuda p = ponudaService.findOne(IDPonude);
        return modelMapper.map(p, PonudaDTO.class);
    }
    
    @PostMapping("/{save}")
    public Ponuda save(@RequestBody PonudaDTO dto) {
        Ponuda p = modelMapper.map(dto, Ponuda.class);
        for (int i = 0; i < p.getStavkePonude().size(); i++) {
            p.getStavkePonude().get(i).setStavkaPonudeID(new StavkaPonudeID(dto.getIDPonude(), dto.getStavkePonude().get(i).getRb()));
        }
        return ponudaService.savePonuda(p);
    }
    @PutMapping("/update")
    public Ponuda update(@RequestBody PonudaDTO dto) {
       Ponuda ponuda = modelMapper.map(dto, Ponuda.class);
        for (int i = 0; i < ponuda.getStavkePonude().size(); i++) {
            ponuda.getStavkePonude().get(i).setStavkaPonudeID(new StavkaPonudeID(dto.getIDPonude(), dto.getStavkePonude().get(i).getRb()));
        }
        return ponudaService.savePonuda(ponuda); 
    }
    
     @DeleteMapping("/delete/{IDPonude}")
    public void delete(@PathVariable int IDPonude) {
        ponudaService.deletePonuda(IDPonude);
    }
}
