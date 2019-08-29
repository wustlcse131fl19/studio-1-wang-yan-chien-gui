package studio1;

import support.cse131.ArgsProcessor;

import java.util.function.DoubleToIntFunction;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("Value for x?");
		int y = ap.nextInt("Value for y?");
		int z = ap.nextInt("Value for z?");
		boolean isOrdered = (((z-y)>0)&&((y-x)>0))||(((x-y)>0)&&((y-z)>0));
		System.out.println(isOrdered);
	}

}
