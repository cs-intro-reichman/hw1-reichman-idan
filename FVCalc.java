// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int invest = Integer.parseInt(args[0]);
		Double rate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		double decRate = rate/100+1;
		
		double sum = invest * Math.pow((decRate), (years));
	      
		System.out.println("After " + years + " years, $" + invest + " saved at " + 
							rate + "% will yield $" + (int)sum );
}
}

