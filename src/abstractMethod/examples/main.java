package abstractMethod.examples;

import java.awt.color.ICC_ColorSpace;

public class main {

	public static void main(String[] args) {
		Bank b= new ICICI();
		System.out.println(b.getcalculate());
		System.out.println(b.getrateOfInterest());
	}

}
