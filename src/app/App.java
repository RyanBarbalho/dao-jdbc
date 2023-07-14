package app;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class App {

    public static void main(String[] args) throws Exception {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== TEST 1: seller findById ===\n");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        System.out.println();
        System.out.println("=== TEST 2: seller findByDepartment ===\n");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }
        System.out.println("\n=== TEST 2: seller findByDepartment ===\n");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }
    }
}
