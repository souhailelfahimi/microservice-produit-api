 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fst.produitapi.domain.rest.converter;

import com.fst.produitapi.domain.bean.CategorieProduit;
import com.fst.produitapi.domain.bean.Produit;
import com.fst.produitapi.domain.rest.Vo.ProduitVo;

/**
 *
 * @author BlackAngel
 */
public class ProduitConverter extends AbstractConverter<Produit, ProduitVo> {

    @Override
    public Produit toItem(ProduitVo vo) {
        if (vo == null) {
            return null;
        } else {
            Produit p=new Produit();
            p.setId(vo.getId());
            p.setReference(vo.getReference());
            p.setCategorieProduit(new CategorieConverter().toItem(vo.getCategorieProduitVo()));
        return p;
        }
    }

    @Override
    public ProduitVo toVo(Produit item) {
  if (item == null) {
            return null;
        } else {
            ProduitVo p=new ProduitVo();
            p.setId(item.getId());
            p.setReference(item.getReference());
            p.setCategorieProduitVo(new CategorieConverter().toVo(item.getCategorieProduit()));
        return p;
        }    }

}
