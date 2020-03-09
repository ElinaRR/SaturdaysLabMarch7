package Lab.saturday;
import java.util.*;

/**
Calculate the cost of carpeting a room taking the values from the user
SaturdayLab1: Data types. Variables. Constants. 
Problem 6
Follow the Carpet class to create an interactive application. Instead of assigning
values to the length, width and price variables accept them from the user as
input. Save the revised class as InteractiveCarpet.java.
*/

public class InteractiveCarpet {

	public static void main(String[] args) {
		
		double length, width, price;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length:  ");
		length = sc.nextDouble();
		System.out.println("Enter width:  ");
		width = sc.nextDouble();
		System.out.println("Enter price:  ");
		price = sc.nextDouble();
		double area = length * width;
		double cost = area * price;
		System.out.println("Area of carpet is  " + area + " and cost is " + cost + "EUR");
		
	}

}
