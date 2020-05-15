import java.text.*;
import java.util.*;
  
public class Main
{
 public static void main(String[] args) throws ParseException 
 {
  SimpleDateFormat dateTimeFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
  dateTimeFormat.setTimeZone(TimeZone.getTimeZone("Canada/Central"));
  String estDateTimeString = "05/15/2020 09:30:00"; //(EST)
  Date date = dateTimeFormat.parse(estDateTimeString);
  DateFormat timeFormat = new SimpleDateFormat("HH:mm");
  timeFormat.setTimeZone(TimeZone.getTimeZone("Asia/Calcutta"));
  String istTime = timeFormat.format(date);
  System.out.println("Time IST = " + istTime);
 }
}



\\For different Time Zone visit to below link
\\http://tutorials.jenkov.com/java-date-time/java-util-timezone.html