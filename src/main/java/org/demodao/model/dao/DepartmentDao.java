package org.demodao.model.dao;

import org.demodao.Department;

import java.util.List;

public interface DepartmentDao {
    void insert(Department obj); // insere no banco de dados
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();
}
