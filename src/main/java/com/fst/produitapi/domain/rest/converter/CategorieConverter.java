/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fst.produitapi.domain.rest.converter;

import com.fst.produitapi.domain.bean.CategorieProduit;
import com.fst.produitapi.domain.rest.Vo.CategorieProduitVo;

/**
 *
 * @author BlackAngel
 */
public class CategorieConverter extends AbstractConverter<CategorieProduit, CategorieProduitVo> {

    public CategorieConverter() {
    }

    @Override
    public CategorieProduit toItem(CategorieProduitVo vo) {
        if (vo == null) {
            return null;
        } else {
            CategorieProduit item = new CategorieProduit();
            item.setId(vo.getId());
            item.setLibelle(vo.getLibelle());
            return item;
        }

    }

    @Override
    public CategorieProduitVo toVo(CategorieProduit item) {
        if (item == null) {
            return null;
        } else {
            CategorieProduitVo vo = new CategorieProduitVo();
            vo.setId(item.getId());
            vo.setLibelle(item.getLibelle());
            return vo;
        }
    }

}
