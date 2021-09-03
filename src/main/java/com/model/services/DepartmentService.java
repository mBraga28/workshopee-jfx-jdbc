package com.model.services;

import com.model.entities.Department;
//import model.dao.DaoFactory;
//import model.dao.DepartmentDao;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {

    public List<Department> findAll() {
        List<Department> list = new ArrayList<>();
        list.add(new Department(1, "Books"));
        list.add(new Department(2, "Computers"));
        list.add(new Department(3, "Eletronics"));
        return list;
    }

}
