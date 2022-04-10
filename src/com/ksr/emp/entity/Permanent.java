package com.ksr.emp.entity;

public class Permanent extends Employee{
	private int experience;
 	public Permanent(int employeeId, String employeeName, String qualification, double basicPay,
			double travellingAllowence, double[] dearnessAllowance, int experience) {
		super(employeeId, employeeName, qualification, basicPay, travellingAllowence, dearnessAllowance);
		this.experience = experience;
	}
	public double computeSalary()
    {
		double totalsalary=0;
		if(getQualification().equals("PG"))
		{
		   totalsalary=getBasicPay()+getTravellingAllowence()+getDearnessAllowance()[0];
		   if(experience<5)
		   {
		   double temp=(totalsalary*2)/100;
		   totalsalary=temp+totalsalary;
		   }
		   else if(5>=experience && experience<=10)
		   {
		
		   double temp=(totalsalary*3)/100;
		   totalsalary=temp+totalsalary;
		   }
		   else if(experience>10)
		   {
			 
			   double temp=(totalsalary*4)/100;
		   totalsalary=temp+totalsalary;
		   }
		}
		else if(getQualification().equals("UG"))
		{
			totalsalary=getBasicPay()+getTravellingAllowence()+getDearnessAllowance()[1];
			if(experience<5)
			   {
				double temp=(totalsalary*2)/100;
			   totalsalary=temp+totalsalary;
			   }
			   else if(5<=experience && experience<=10)
			   {
				   double temp=(totalsalary*3)/100;
			       totalsalary=temp+totalsalary;
			   }
			   else if(experience>10)
			   {
				   double temp=(totalsalary*4)/100;
			   totalsalary=temp+totalsalary;
			   }
		}
		else if(getQualification().equals("Others"))
		{
			totalsalary=getBasicPay()+getTravellingAllowence()+getDearnessAllowance()[2];
			if(experience<5)
			   {
				double temp=(totalsalary*2)/100;
			   totalsalary=temp+totalsalary;
			   }
			   else if(5>=experience && experience<=10)
			   {
				
				   double temp=(totalsalary*3)/100;
			   totalsalary=temp+totalsalary;
			   }
			   else if(experience>10)
			   {
				  
				   double temp=(totalsalary*4)/100;
			   totalsalary=temp+totalsalary;
			   }
		}
   	return totalsalary; 
    }
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
     
}
