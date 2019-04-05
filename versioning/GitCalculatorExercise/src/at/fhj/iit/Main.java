package at.fhj.iit;

public class Main {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		
		
		calc.addValue(20);	
		calc.addValue(4);	
		calc.addValue(16);


		calc.addValue(23);	
		calc.addValue(33);	
		calc.addValue(1);
		calc.addValue(23);	
		calc.addValue(100);	
		calc.addValue(16);
	
		
		// output lowest number 
		System.out.println(calc.getMinimum());
		// output highest number
		System.out.println(calc.getMaximum());
		// output sum of all numbers
		System.out.println(calc.sum());
	}
}
