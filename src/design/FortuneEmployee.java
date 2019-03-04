package design;

import databases.ConnectToSqlDB;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

			EmployeeInfo info = new EmployeeInfo();
			EmployeeInfo.nestedClassEmplyoee.nestedEmplyoeeName();
			info.displayEmplyoeeInfo2();

			EmployeeInfo emp2 = new EmployeeInfo();
			emp2.setName("AMAZON");
			System.out.println(emp2.getName());


			info.assignDepartment();
			info.setEmployeeBankDetails("Wells Fargo");
			info.setEmployeeSSN(1234567);
			info.EmplyoeeVaction();
			info.EmplyoeePerformance();
			info.benefitLayout();


			ConnectToSqlDB Connection = new ConnectToSqlDB();
			Connection.insertProfileToSqlTable("employees", "id", "name", "Dob");

			EmployeeInfo.calculateEmployeeBonus(10000, 7);
			EmployeeInfo.calculateEmployeePension(10000);


		}



	}








