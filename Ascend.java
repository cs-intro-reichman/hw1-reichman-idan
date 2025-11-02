// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);
		int ran1 = (int)(Math.random()*limit)+1;
		int ran2 = (int)(Math.random()*limit)+1;
		int ran3 = (int)(Math.random()*limit)+1;
		int tempMin = Math.min(ran1, ran2);
		int abMin = Math.min(tempMin, ran3);
		int tempMax = Math.max(ran1, ran2);
		int abMax = Math.max(tempMax, ran3);
		int Mid = ran1 +ran2 +ran3 - abMax - abMin;

		System.out.println(ran1 + " , " + ran2 + " , " + ran3);
		System.out.println(abMin + " , " + Mid + " , " + abMax);
	}
}
