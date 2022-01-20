package com.bridgelabz;

public class EmpWageSwitch {
	public static void main(String[] args) {
		final int isFULL_TIME=1;
		final int isPART_TIME=2;
		final int EMP_RATE_PER_HR=20;
		int empHrs=0;
		int empWage=0;
		double empstatus=(int) Math.floor(Math.random()*10)%3;
		switch ((int)empstatus)
		{
		case isFULL_TIME:
			empHrs=8;
			break;
		case isPART_TIME:
			empHrs=4;
			break;
		default:
			empHrs=0;
		}
		empWage=empHrs*EMP_RATE_PER_HR;
		System.out.print("Employee Wage using Switch is:"+empWage);
	}
}
