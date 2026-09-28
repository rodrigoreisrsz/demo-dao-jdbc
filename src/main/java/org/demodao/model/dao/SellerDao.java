package org.demodao.model.dao;

import org.demodao.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller obj); // insere no banco de dados
    void update(Seller obj);
    void deleteById(Seller id);
    Seller findById(Integer id);
    List<Seller> findAll();
}
