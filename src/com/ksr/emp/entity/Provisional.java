package com.ksr.emp.entity;
public class Provisional extends Employee{
	public Provisional(int employeeId, String employeeName, String qualification, double basicPay,
			double travellingAllowence, double[] dearnessAllowance) {
		super(employeeId, employeeName, qualification, basicPay, travellingAllowence, dearnessAllowance);
	}
	public double computeSalary()
    {
		double totalsalary=0;
		if(getQualification().equals("PG"))
		{
		   totalsalary=getBasicPay()+getTravellingAllowence()+getDearnessAllowance()[0];
		}
		else if(getQualification().equals("UG"))
		{
			totalsalary=getBasicPay()+getTravellingAllowence()+getDearnessAllowance()[1];
		}
		else if(getQualification().equals("Others"))
		{
			totalsalary=getBasicPay()+getTravellingAllowence()+getDearnessAllowance()[2];
		}
   	return totalsalary; 
    }
}
