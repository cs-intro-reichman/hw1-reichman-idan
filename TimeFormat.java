// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        // Replace this comment with the rest of your code
		int newhours = hours%12;

		String newmin = Integer.toString(minutes);
		if (minutes< 10){
			newmin = "0" + Integer.toString(minutes);
		}
		String AP = "PM"; 
		if (hours < 12 && hours >= 0) {
			AP = "AM";}
		if (AP=="AM" && hours != 0) {
			System.out.println(newhours + ":" + newmin + " " + AP); }
		else {
			if (hours != 0 && hours != 12) {
				System.out.println(newhours + ":" + newmin + " " + AP);}
			else {
				if (hours == 0 ) {
					System.out.println(hours + ":" + newmin + " " + AP);}
				else {
					System.out.println(hours + ":" + newmin + " " + AP);}}}

		
	}

}

// Great catching for edge cases!
// Note to use camelCase - for example: newHours instead of newhours
// using the method "Integer.toString" isnt needed here
// the name 'AP' isnt very clear..
// it is very good that use see that 0 and 12 are treated differently from the others. 
// But you gave them the same treatment - 
//  if (hours == 0 ) {
// System.out.println(hours + ":" + newmin + " " + AP);}
// else {
// System.out.println(hours + ":" + newmin + " " + AP);}}}
// which is the same for both 0 and 12... 
// if they are treated the same then no need for separating them. 
// if they are treated differently - then treat them differently :)

