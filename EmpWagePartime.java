package com.bridgelabz;

public class EmpWagePartime {
	public static void main(String[] args) {
		int isFULL_TIME=1;
		int isPart_TIME=2;
		int EMP_RATE_PER_HR=20;
		int empHrs=0;
		int empWage=0;
		double empstatus=Math.floor(Math.random()*10)%3;
		if(empstatus == isFULL_TIME)
		{
			empHrs=8;
		}
		else if(empstatus == isPart_TIME)
			empHrs=4;
		else
			empHrs=0;
		empWage=empHrs*EMP_RATE_PER_HR;
		System.out.print("Employee Wage is:"+empWage);
	}
}
