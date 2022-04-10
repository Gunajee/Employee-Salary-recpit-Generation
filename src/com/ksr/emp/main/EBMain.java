package com.ksr.emp.main;
import java.util.Scanner;
import com.ksr.emp.service.EmployeeService;
public class EBMain {
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int employeeId=sc.nextInt();
		String employeeName=sc.next();
		String qualification=sc.next();
		String employeeLevel=sc.next();
		int experience=sc.nextInt();
		double basicPay=sc.nextDouble();
		double travellingAllowence=sc.nextDouble();
		EmployeeService es=new EmployeeService();
		String ss=es.generateSalary(employeeId,employeeName,qualification,employeeLevel,experience,basicPay,travellingAllowence);
		System.out.println(ss);
	}
}
