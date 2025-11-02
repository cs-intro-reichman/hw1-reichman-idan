// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int numOri = Integer.parseInt(args[0]);
		int single = numOri%10;
		int tens = (numOri/10)%10;
		int hundreds = (numOri/100);
		
	      
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + 
							single + " ones. ");
	}
}
