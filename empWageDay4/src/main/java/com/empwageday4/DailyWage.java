package com.empwageday4;

public class DailyWage extends EmpAttendence {

	public static int wager() {
		int wagePerHr = 20;
		int fullDayHr = 8;
		int dailyWage = wagePerHr * fullDayHr;
		return dailyWage;
	}
	
	public static void main(String[] args) {
		int attendence = Attendence();
		int isPresent = 1, isAbsent = 0;
		
		if(attendence == isPresent) {
			System.out.println("Employee Daily Wage = " + wager());
		}
		else {
			System.out.println("Employee Daily wage = " +isAbsent);
		}
		

	}

}
