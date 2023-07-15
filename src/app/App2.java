package app;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class App2 {

    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 1: department insert ===");
        Department dep = new Department(null, "Music");
        departmentDao.insert(dep);
        System.out.println("Inserted! New id = " + dep.getId());

        System.out.println("\n=== TEST 2: department update ===");
        Department dep2 = departmentDao.findById(2);
        dep2.setName("Food");
        departmentDao.update(dep2);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 3: department delete ===");
        departmentDao.deleteById(5);

        System.out.println("\n=== TEST 4: department findById ===");
        Department dep3 = departmentDao.findById(2);
        System.out.println(dep3);

        System.out.println("\n=== TEST 5: department findAll ===");
        departmentDao.findAll().forEach(System.out::println);

    }
}
