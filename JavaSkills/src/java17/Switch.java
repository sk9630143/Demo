package java17;

public class Switch {

	public static void main(String[] args) {
		// Switch statement
		
		String day = "SAT";
		String time = "";
		
		//Switch before java 17 
		
		switch(day) {
			case "MON", "TUE":
				time = "6:00 AM";
				break;
			case "WED", "SAT":
				time = "7:00 AM";
				break;
			default:
				time = "8:00 AM";
		}
		System.out.println("Time-1: "+time);//Time-1: 7:00 AM
		
		//After java 17
		switch(day) {
			case "MON", "TUE" -> time = "8:30 AM";//break statement not requiredhere
			case "WED", "SAT" -> time = "9:00 AM";
			default -> time = "9:30 AM";
		}
		System.out.println("Time-2: "+time);//Time-2: 9:00 AM
		
		//switch statement with return
		time = switch(day) {
			case "MON", "TUE" -> "10:00 AM";
			case "WED", "SAT" -> "10:30 AM";
			default -> "11:00 AM";
		};
		System.out.println("Time-3: "+time);//Time-3: 10:30 AM
	}

}
