/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fst.produitapi.domain.rest;

import com.fst.produitapi.domain.bean.Produit;
import com.fst.produitapi.domain.model.service.ProduitService;
import com.fst.produitapi.domain.rest.Vo.ProduitVo;
import com.fst.produitapi.domain.rest.converter.ProduitConverter;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BlackAngel
 */
@RestController
@RequestMapping("/produit-api/produits")
public class ProduitRest {

    @Autowired
    private ProduitService produitService;

    @GetMapping("/reference/{reference}")
    public ProduitVo findByReference(@PathVariable("reference") String reference) {
        return new ProduitConverter().toVo(produitService.findByReference(reference));
    }

    @GetMapping("/all")
    public List<Produit> findAll2() {
        return produitService.findAll();
    }
    @GetMapping("/")
    public List<ProduitVo> findAll() {
        return new ProduitConverter().toVo(produitService.findAll());
    }
    @PostMapping("/")
    public int addProduit(@RequestBody Produit produit) {
       return produitService.save(produit);
    }

    public ProduitService getProduitService() {
        return produitService;
    }

    public void setProduitService(ProduitService produitService) {
        this.produitService = produitService;
    }

}
