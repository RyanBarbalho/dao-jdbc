package app;

import java.util.List;
import java.util.Locale;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class App {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

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

        System.out.println("\n=== TEST 4: seller insert ===\n");
        Seller newSeller = new Seller(null, "michael phillips", "michaelP@gmail.com",
                new java.util.Date(), 4000.0,
                department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n=== TEST 5: seller update ===\n");
        seller = sellerDao.findById(1);
        // only changed the name
        seller.setName("Sanji Vinsmoke");
        seller.setEmail("chainCook@gmail.com");
        sellerDao.update(seller);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 6: seller delete ===\n");
        sellerDao.deleteById(10);
        System.out.println("Delete completed");
    }
}
