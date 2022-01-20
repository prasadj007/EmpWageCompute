package com.bridgelabz;

public class EmpWageMonth {

	public static void main(String[] args) {
		int empHrs=0;
		int empWage=0;
		int totalEmpWage=0;
		final int isFULL_TIME=1;
		final int isPART_TIME=2;
		final int EMP_RATE_PER_HR=20;
		int numOfWorkingDays=20;

		for (int day=1; day < numOfWorkingDays; day++)
		{
			int empstatus=(int) Math.floor(Math.random()*10)%3;
			switch (empstatus)
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
			totalEmpWage += empWage;
			System.out.print("EmpWage is\n"+empWage+"\n");
		}
		System.out.print("\nMonthly Employee Wage is:"+totalEmpWage);
	}
}
