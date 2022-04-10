package com.ksr.emp.entity;

abstract public class Employee {
      private int employeeId;
      private String employeeName;
      private String qualification;
      private double basicPay;
      private double travellingAllowence;
      private double[] dearnessAllowance;
      
    public Employee(int employeeId, String employeeName, String qualification, double basicPay,
			double travellingAllowence, double[] dearnessAllowance) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.qualification = qualification;
		this.basicPay = basicPay;
		this.travellingAllowence = travellingAllowence;
		this.dearnessAllowance = dearnessAllowance;
	}
    public abstract double computeSalary();
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getTravellingAllowence() {
		return travellingAllowence;
	}
	public void setTravellingAllowence(double travellingAllowence) {
		this.travellingAllowence = travellingAllowence;
	}
	public double[] getDearnessAllowance() {
		return dearnessAllowance;
	}
	public void setDearnessAllowance(double[] dearnessAllowance) {
		this.dearnessAllowance = dearnessAllowance;
	}
      
      
}
