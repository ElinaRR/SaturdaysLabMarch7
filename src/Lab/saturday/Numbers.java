package Lab.saturday;

/*
Calculates the arithmetic operations
SaturdayLab1: Data types. Variables. Constants.
Problem 3
Save file as Numbers.java 
 -- arithmetic operations with int and double operands (i.e. variables)
 -- mixed addition
 -- integer division. double division. mixed division */

public class Numbers {

	
	public static void main(String[] args) {
		
		// declare variable of type int
		int iNumOne, iNumTwo, iResult, iResult2, iResult3, iResult4;
		
		//declare variables of type double
		double dNumOne, dNumTwo, dResult, dResult2, dResult3, dResult4;
		
		//assign/store
		iNumOne = 5;
		iNumTwo = 2;
		
		dNumOne = 10.0;
		dNumTwo = 11.5;
		
		iResult = iNumOne + (int) dNumOne;
		iResult2 = iNumOne - (int) dNumTwo;
		iResult3 =  (int) dNumOne * (int) dNumOne;
		iResult4 = (int) dNumOne / iNumOne;
		dResult = dNumTwo + iNumTwo;
		dResult2 = dNumTwo - iNumTwo;
		dResult3 = dNumTwo * iNumTwo;
		dResult4 = dNumTwo / iNumTwo;
		
		String res = "Result";
		
		System.out.println("int result: " + iResult);
		System.out.println("int result: " + iResult2);
		System.out.println("int result: " + iResult3);
		System.out.println("int result: " + iResult4);
		System.out.println("double result: " + dResult);
		System.out.println("double result: " + dResult2);
		System.out.println("double result: " + dResult3);
		System.out.println("double result: " + dResult4);
		System.out.println(res + " " + dResult4);
	}

}
