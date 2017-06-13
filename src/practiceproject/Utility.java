package practiceproject;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Utility {

	public static void main(String[] args) {
		System.out.println(calPercentage("11/19/2015","12/15/2015"));

	}
	public static String calPercentage(String sDate,String eDate){

		DateTimeFormatter formatter = DateTimeFormat.forPattern("MM/dd/yyyy");
		DateTime startDate;
		DateTime endDate;
		startDate = formatter.parseDateTime(sDate);
		endDate = formatter.parseDateTime(eDate);
		DateTime currDate = new DateTime();
		int startEnd=Days.daysBetween(startDate.toLocalDate(), endDate.toLocalDate()).getDays();
		int nowEnd=Days.daysBetween(currDate.toLocalDate(), endDate.toLocalDate()).getDays();
		int startNow=Days.daysBetween(startDate.toLocalDate(), currDate.toLocalDate()).getDays();
		if(startEnd<=0 || nowEnd<=0){
			return "0";
		}
		if(startNow<=0){
			return "100";
		}
		float diff=(float)startEnd/(float)startNow;
		return Integer.toString((int)((diff)*100));
	}
}
