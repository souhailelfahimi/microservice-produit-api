/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fst.produitapi.domain.model.dao;

import com.fst.produitapi.domain.bean.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author BlackAngel
 */
@Repository
public interface ProduitDao extends JpaRepository<Produit, Long>{
    public Produit findByReference(String reference);
    
}
