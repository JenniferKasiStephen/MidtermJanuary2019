package design;

import java.util.Scanner;

public class EmployeeInfo extends EmployeeAbstract implements Employee {
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	private int employeeId;
	private String name;
	private String emplyoeeEmailId;
	private String employeeBankDetails;
	private int employeeSSN;



	public String getName() {
		return name;
	}
	public String setName(String name) {
		this.name = name;
		return name;
	}


	public String getEmployeeBankDetails() {
		return employeeBankDetails;
	}

	public void setEmployeeBankDetails(String employeeBankDetails) {
		this.employeeBankDetails = employeeBankDetails;
		System.out.println("Employee Bank Details:" + employeeBankDetails);
	}

	public int getEmployeeSSN() {
		return employeeSSN;
	}

	public void setEmployeeSSN(int employeeSSN) {
		this.employeeSSN = employeeSSN;
		System.out.println("Employee SSN N0:" + employeeSSN);
	}


	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 *
	 */

	public EmployeeInfo() {}

	public EmployeeInfo(int employeeId){
		this.employeeId = employeeId;
	}

	public void setEmployeeInfo1(int employeeId) {
		this.employeeId = employeeId;
		System.out.println(employeeId);

	}
	public EmployeeInfo(String name, int employeeId){
		this.name = name;
		this.employeeId= employeeId;

	}

	public void setEmployeeInfo2(String name,int employeeId) {
		System.out.println(name + employeeId);

	}
	public void displayEmplyoeeInfo2() {
		System.out.println("Name of the Employee:"+" " + "jacob" + " " + "EmplyoeeId:" +" " + 902);
	}


	public EmployeeInfo(String name, int emplyoeeId, String emplyoeeEmailId) {
		this.name = name;
		this.employeeId = emplyoeeId;
		this.emplyoeeEmailId = emplyoeeEmailId;
	}

	public void setEmployeeInfo3(String name,int employeeId,String emplyoeeEmailId) {
		System.out.println(name + employeeId + emplyoeeEmailId );

	}


	public void EmplyoeePantry() {
		System.out.println("Emplyoees can relax in the pantry");
	}

	public void assignDepartment() {
		System.out.println("Software Architect");
	}

	public int calculateSalary() {
		return 0;
	}
	public void benefitLayout() {
		System.out.println("Employee Benifts include:Medical,life,disability isurance and retirement plans");
	}

	public int employeeId() {
		return 0;
	}

	public String employeeName() {
		return null;
	}

//nested

	public static class nestedClassEmplyoee{


		public static void nestedEmplyoeeName() {
			System.out.println("Name");

		}

	}


	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */
	public static double calculateEmployeeBonus(int salary, int performance){


		double total=0;

		if(performance >=8) {

			total = salary* .1;
		}else {
			total = salary*.08;
		}

		System.out.println("EmployeeBonus = $ " + total);
		return total;
	}



	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 *
	 */
	public static double calculateEmployeePension(int salary){
		double total=0;

		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
		String convertedJoiningDate = DateConversion.convertDate(joiningDate);
		String convertedTodaysDate = DateConversion.convertDate(todaysDate);

		//implement numbers of year from above two dates
		//Calculate pension

		String startYear = convertedJoiningDate.substring(convertedJoiningDate.length()-4);
		String currentYear = convertedTodaysDate.substring(convertedTodaysDate.length()-4);
		int start = Integer.parseInt(startYear);
		int current = Integer.parseInt(currentYear);

		if((current-start)==1){
			total = salary*.05;

		}
		else if((current-start)>=2) {
			total = salary*.1;
		}
		else if((current-start)<=1) {
			total=0;
		}
		System.out.println("Employee pension = $ " + total);

		return total;
	}
	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}



