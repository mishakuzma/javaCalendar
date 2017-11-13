package timeUnit;

public class Doomsday {

	/**
	 * @param args
	 * @purpose To predict the day of the week from the date given, using the Doomsday algorithm.
	 */
	
	
	// Lists ordered to show which day corresponds to which number
	String[] daysOfTheWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	int[] daysAsInt = {0, 1, 2, 3, 4, 5, 6};
	
	public Doomsday() {
		
	}
	
	public int anchorDays(int year, boolean Gregorian) {
		// Purpose: Takes an integer called year and a boolean value called Gregorian and returns the
		// 	  integer value for the day of the week corresponding to the anchor day of that century
		//    represented in year. Different values are produced for the Gregorian calendar (boolean = true),
		//    and the Julian calendar (boolean = false).
		// Contract:
		//    Int Bool -> Int
		// Requires:
		//    - Gregorian indicate whether the Gregorian calendar is used for the expression.
		if (Gregorian == true){
			// Gregorian calendar is being used
			
		} else {
			// Julian calendar is being used
			
		}
		
		int leaveMeAlone = 0;
		return leaveMeAlone;
		
	}
	
	public boolean leapYearCheck() {
		// Use modulo rules to check if a year has 366 days
		if (year%4==0 && year%100==0 && year%400==0){
			// Year is divisible by 400, 100, and 4, it is leap
			// (Exception to next rule regarding centuries)
			return true;
		} else if (year%4==0 && year%100==0) {
			// Year is divisible by 4 and 100, it is not leap
			// (Exception to next rule regarding 4 years)
			return false;
		} else if (year%4==0) {
			// Year is divisible by 4, it is leap
			// (General rule regarding lead years)
			return true;
		} else {
			// Year is not divisible by 4, not leap
			// (General rule regarding common years)
			return false;
		}
	}
	
	public int doomsdayFinder(boolean isLeapYear) {
		// Find the doomsday of a year, true bool means leap year
		/* Dates that share a weekday
		 *    January 3 (Jan. 4 in leap year)
		 *    February 28 (Feb. 29 in leap year)
		 *    March 7
		 *    April 4 (4/4)
		 *    May 9 (5/9)
		 *    June 6 (6/6)
		 *    July 11 (7/11)
		 *    August 8 (8/8)
		 *    September 5 (9/5)
		 *    October 10 (10/10)
		 *    November 7 (11/7)
		 *    December 12 (12/12)
		 *    July 4
		 *    October 31 
		 */
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
