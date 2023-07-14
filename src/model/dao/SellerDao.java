package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
    // insere no banco de dados o objeto Seller
    void insert(Seller obj);

    // atualiza no banco de dados o objeto Seller
    void update(Seller obj);

    // deleta no banco de dados o objeto Seller
    void deleteById(Integer id);

    // busca no banco de dados o objeto Seller
    Seller findById(Integer id);

    // retorna todos os objetos Seller
    List<Seller> findAll();

    // retorna todos os objetos Seller que pertencem ao Department
    List<Seller> findByDepartment(Department department);

}
