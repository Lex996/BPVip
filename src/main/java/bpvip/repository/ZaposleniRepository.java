/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpvip.repository;

import bpvip.entity.Zaposleni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
public interface ZaposleniRepository extends JpaRepository<Zaposleni, Integer>{
    
}
