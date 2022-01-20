package com.bridgelabz;

public class EmpAttend {
	public static void main(String[] args) {
		int isPresent=1;
		double empstatus=Math.floor(Math.random()*10)%2;
		if(empstatus == isPresent)
		{
			System.out.print("Employee is present");
		}
		else
			System.out.print("Employee is Absent");
	}
}
