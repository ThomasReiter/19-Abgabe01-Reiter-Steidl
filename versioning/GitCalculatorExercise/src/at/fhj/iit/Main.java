package at.fhj.iit;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> testingList = Arrays.asList(5,7,3,4,3,0);

		int minimum = getMinimum(testingList);
		System.out.println(minimum);
		int maximum = getMaximum(testingList);
		System.out.println(minimum);
	
	}

		    public static int getMinimum(List<Integer> testingList) {
		    	
		    	int minimum = (int) testingList.get(0);
		    	for (int i =1;i<testingList.size();i++) {
		    		int tested = (int) testingList.get(i);	
		    		if (minimum>tested) {
		    			minimum = tested;
		    		}
		    	}
		    	
		    	return minimum;

		    }
		    public static int getMaximum(List<Integer> testingList) {
		    	
		    	int maximum = (int) testingList.get(0);
		    	for (int i =1;i<testingList.size();i++) {
		    		int tested = (int) testingList.get(i);	
		    		if (maximum<tested) {
		    			maximum = tested;
		    		}

		    }
				return maximum;
		   }
		    public static List<Integer> addValue(List<Integer> testingList,int zugabe) {

		        testingList.add(zugabe);
		        return testingList;
		    }

		
		
		
		
		
		
//		// TODO implement your own Calculator Implementation and create a new CalculatorImpl Class
//		Calculator calc = new Calculator();
//		
//		calc.addValue(20);	// currently highest number
//		calc.addValue(4);	// currently lowester number
//		calc.addValue(16);
//		
//		// add other integers
//		
//		// output lowest number 
//		
//		// output highest number
//		
//		// output sum of all numbers

}
