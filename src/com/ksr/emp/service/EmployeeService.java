package com.ksr.emp.service;
import com.ksr.emp.entity.Provisional;
import com.ksr.emp.entity.Permanent;
import com.ksr.emp.exception.*;
public class EmployeeService {
	public boolean validate(int employeeId, String employeeName, String qualification,String employeeLevel, int experience, double basicPay, double travellingAllowence) throws InvalidDataException, InvalidLevelException
	{
		if(employeeId<0 || employeeName==null|| experience<0 ||  basicPay<5000 || travellingAllowence<1000 || !(qualification.equals("UG")||qualification.equals("PG")||qualification.equals("Others")))
		{
		    throw new InvalidDataException();
		}
		if( !(employeeLevel.equals("Provisional") || employeeLevel.equals("Permanent")))
		{
			throw new InvalidLevelException();		 
		}
		return true;
	}
	public double calculateSalaryAmt(int employeeId , String employeeName,String qualification, String employeeLevel, int experience, double basicPay, double travellingAllowence)
	{
		boolean b=true;
		double recpit=0;
		try {
			b=validate(employeeId,employeeName,qualification,employeeLevel,experience,basicPay,travellingAllowence);
			if(b==true)
			{
				if(employeeLevel.equals("Provisional"))
				{
					double[] dearnessAllowance=new double[3];
					dearnessAllowance[0]=5000;
					dearnessAllowance[1]=3000;
					dearnessAllowance[2]=1000;
					Provisional pro=new Provisional(employeeId, employeeName, qualification, basicPay, travellingAllowence, dearnessAllowance);
					recpit=pro.computeSalary();
				}
				else if(employeeLevel.equals("Permanent"))
				{
					double[] dearnessAllowance=new double[3];
					dearnessAllowance[0]=10000;
					dearnessAllowance[1]=7000;
					dearnessAllowance[2]=2000;
					Permanent per=new Permanent(employeeId, employeeName, qualification, basicPay, travellingAllowence, dearnessAllowance,experience);
					recpit=per.computeSalary();
				}
			}
		} catch (InvalidDataException e1) {
			return -1;
		} catch (InvalidLevelException e1) {
			return -2;
		}
		return recpit;
	}
	public String generateSalary(int employeeId, String employeeName, String qualification, String employeeLevel, int experience,double basicPay, double travellingAllowence)
	{
		String result="";
		double recpit=calculateSalaryAmt(employeeId,employeeName,qualification,employeeLevel,experience,basicPay,travellingAllowence);
		if(recpit==-1)
		{
			result="Incorrect Data";
		}
		else if(recpit==-2)
		{
			result="Invalid Employee Level";
		}
		else
		{
			result="Net Salary:"+recpit;
		}
		return result;
	}
}
