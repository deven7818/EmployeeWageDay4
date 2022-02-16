package com.empwageday4;

import java.util.Random;

public class EmpWageDay4 {

	public static int Attendence() {
		Random random = new Random();
		int num = random.nextInt(2);
		return num;
	}
	
	public static void main(String[] args) {
		
		int check = Attendence();
		int isPresent = 1 , isAbsent = 2;

		if(check == isPresent) {
			System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is Absent");
		}
	}

}
