enum WeekDays {
   SUNDAY("Sunday Funday", "I will relax"), 
   MONDAY("Marketing Monday","I will work"),
   TUESDAY("Trendy Tuesday","I will work"), 
   WEDNESDAY("Wellness Wednesday","I will work"),
   THURSDAY("Thankful Thursday","I will work"),
   FRIDAY("Foodie Friday","I will work"),
   SATURDAY("Social Saturday", "I will relax");
  private String daysGreeting;
  private String updatedMessage;
  public String getUpdatedMessage() {
	return updatedMessage;
}
  WeekDays(final String daysGreeting, final String updatedMessage) {
	this.daysGreeting = daysGreeting;
    this.updatedMessage = updatedMessage;
  }
  public String getDaysGreeting() {
  return daysGreeting;
  }
public boolean isWeekend() {
	if(this.daysGreeting==WeekDays.SUNDAY.daysGreeting)
		return true;
	else 
		return false;
		
}
}
public class EnumWithValues {
  public static void main(String[] args) {
	
    WeekDays weekdays = WeekDays.THURSDAY;
   
    System.out.println(weekdays.getDaysGreeting());
    if (weekdays.isWeekend()) {
      doYourTaskForWeekEnds();
    } else {
      doYourTaskForWeekDays(weekdays);
    }
  }
  private static void doYourTaskForWeekEnds() {
      System.out.println("Relax and Enjoy! It's Weekend :)");
  }
  private static void doYourTaskForWeekDays(WeekDays weekdays) {
      System.out.println("Ohh! It's a weekday. Have to work!");
  }
}
