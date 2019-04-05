package at.fhj.iit;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		
		
		calc.addValue(20);	
		calc.addValue(4);	
		calc.addValue(16);
		System.out.println(calc.getMaximum());
		System.out.println(calc.getMinimum());
		
		
		calc.addValue(23);	
		calc.addValue(33);	
		calc.addValue(1);
		calc.addValue(23);	
		calc.addValue(100);	
		calc.addValue(16);
		
		System.out.println(calc.getMaximum());
		System.out.println(calc.getMinimum());
		
		// output lowest number 
		
		// output highest number
		
		// output sum of all numbers
	}
}
