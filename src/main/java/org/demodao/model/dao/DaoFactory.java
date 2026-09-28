package org.demodao.model.dao;

import org.demodao.entities.Seller;
import org.demodao.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDaoJDBC createSellerDao(){
        return  new SellerDaoJDBC();
    }
}
