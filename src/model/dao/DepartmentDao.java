package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
    // insere no banco de dados o objeto Department
    void insert(Department obj);

    // atualiza no banco de dados o objeto Department
    void update(Department obj);

    // deleta no banco de dados o objeto Department
    void deleteById(Integer id);

    // busca no banco de dados o objeto Department
    Department findById(Integer id);

    // retorna todos os objetos Department
    List<Department> findAll();

}
