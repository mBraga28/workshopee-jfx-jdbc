package com.model.services;

import com.model.dao.DaoFactory;
import com.model.dao.SellerDao;
import com.model.entities.Seller;

import java.util.List;

public class SellerService {

    private SellerDao dao = DaoFactory.createSellerDao();

    public List<Seller> findAll() {
        return dao.findAll();
    }

    public void saveOrUpdated(Seller obj) {
        if (obj.getId() == null) {
            dao.insert(obj);
        }
        else {
            dao.update(obj);
        }

    }

    public void remove(Seller obj) {
        dao.deleteById(obj.getId());
    }

}
