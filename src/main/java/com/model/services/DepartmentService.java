package com.model.services;

import com.model.dao.DaoFactory;
import com.model.dao.DepartmentDao;
import com.model.entities.Department;

import java.util.List;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return dao.findAll();
    }

    public void saveOrUpdated(Department obj) {
        if (obj.getId() == null) {
            dao.insert(obj);
        }
        else {
            dao.update(obj);
        }

    }

    public void remove(Department obj) {
        dao.deleteById(obj.getId());
    }

}
