/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fst.produitapi.domain.model.service;

import com.fst.produitapi.domain.bean.Produit;
import java.util.List;

/**
 *
 * @author BlackAngel
 */
public interface ProduitService {
    public Produit findByReference(String reference);
    public List<Produit> findAll();
    public int save(Produit produit);
    

}
