package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
			System.out.println("Insert Department");
			
			DepartmentDao deptDao = DaoFactory.createDepartmentDao();
			
			Department newDept = new Department(null, "Financeiro");
			deptDao.insert(newDept);
			System.out.println("ID = " + newDept);
			
			System.out.println("=== TEST 1: Seller findById =====");
			Department department = deptDao.findById(1);
			System.out.println(department);
			
			System.out.println();
			
			System.out.println("FindAll");
			List<Department> list = deptDao.findAll();
			list = deptDao.findAll();
			for(Department obj : list) {
				System.out.println(obj);
			}
			

			
			System.out.println();
			
			System.out.println("=== Teste 2 Delete FindById ====");
			System.out.print("Digite um ID para Delete");
			int id = scan.nextInt();
			deptDao.deleteById(id);
			System.out.println("Delete completed! ");
			
			
			
			
			
			
			/*
			System.out.println("Update Department");
			deptDao = deptDao.findById(1);
			deptDao.setName("Martha Waine");
			deptDao.update(deptDao);
			System.out.println("Update complected! ");
			*/
	}

}
