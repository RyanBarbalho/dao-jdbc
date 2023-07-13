package app;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class App {

    public static void main(String[] args) throws Exception {
        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, "Ryan", "ryan@gmail.com", new Date(), 3000.0, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);

    }
}
