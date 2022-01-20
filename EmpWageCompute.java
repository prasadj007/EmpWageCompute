package com.bridgelabz;

public class EmpWageCompute{
	public static void main(String[] args) {
		int isFULL_TIME=1;
		int EMP_RATE_PER_HR=20;
		int empHrs=0;
		int empWage=0;
		double empstatus=Math.floor(Math.random()*10)%3;
		if(empstatus == isFULL_TIME)
		{
			empHrs=8;
		}
		else
			empHrs=0;
		empWage=empHrs*EMP_RATE_PER_HR;
		System.out.print("Employee Wage is:"+empWage);
	}
}
