package org.demodao.model.dao.impl;

import org.demodao.entities.Seller;
import org.demodao.model.dao.SellerDao;

import java.util.List;

public class SellerDaoJDBC implements SellerDao {
    public SellerDaoJDBC() {
        super();
    }

    @Override
    public void insert(Seller obj) {

    }

    @Override
    public void update(Seller obj) {

    }

    @Override
    public void deleteById(Seller id) {

    }

    @Override
    public Seller findById(Integer id) {
        return null;
    }

    @Override
    public List<Seller> findAll() {
        return List.of();
    }
}
