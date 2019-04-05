package at.fhj.iit;
//Main class with all the testcalls 
public class Main {

	public static void main(String[] args) {
		//creating the calculator list which we work with
		Calculator calc = new Calculator();
		
		//first added Integers
		calc.addValue(20);	
		calc.addValue(4);	
		calc.addValue(16);

		//Integers we added to the list
		calc.addValue(23);	
		calc.addValue(33);	
		calc.addValue(1); //lowest Integer (should be)
		calc.addValue(23);	
		calc.addValue(100);	//highest Integer (should be)
		calc.addValue(16); // use a Integer twice to show that the Methods still work with multible Integers with the same Value
	
		
		// output lowest number 
		System.out.println(calc.getMinimum());
		// output highest number
		System.out.println(calc.getMaximum());
		// output sum of all numbers
		System.out.println(calc.sum());
	}
}
