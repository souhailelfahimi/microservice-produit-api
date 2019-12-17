/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fst.produitapi.domain.model.service.impl;

import com.fst.produitapi.domain.bean.Produit;
import com.fst.produitapi.domain.model.dao.ProduitDao;
import com.fst.produitapi.domain.model.service.ProduitService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author BlackAngel
 */
@Service
public class ProduitServiceImpl implements ProduitService {

    @Autowired
    private ProduitDao produitDao;

    public Produit findByReference(String reference) {
        return produitDao.findByReference(reference);
    }

    public ProduitDao getProduitDao() {
        return produitDao;
    }

    public void setProduitDao(ProduitDao produitDao) {
        this.produitDao = produitDao;
    }

    @Override
    public List<Produit> findAll() {
        return produitDao.findAll();
    }

    @Override
    public int save(Produit produit) {
        produitDao.save(produit);
        return 1;

    }

}
