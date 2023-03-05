package Euclidean;

import java.util.*;

public class gcdandLcm {

	// Main Method
			public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);

		        // Getting user input
		        System.out.print("Input two numbers: ");
		        int firstNUM = scan.nextInt();
		        int secondNUM = scan.nextInt();

		        System.out.println("");
		        
		        int gcd = theGCD(firstNUM, secondNUM);
		        solutionGCD(firstNUM, secondNUM);
		        
		      
		        System.out.println("");

		        //output for GCD
		        System.out.println("The GCD of ("+firstNUM+", "+ secondNUM +") = "+ gcd);
		        
		        //output for LCM
		        solutionLCM(firstNUM, secondNUM, gcd); 
		       
		    }

		    // For the solution of GCD
		    static void solutionGCD(int firstNUM, int secondNUM) {
		        int rem = 1;
		        while (rem != 0) {
		            int quotient = firstNUM / secondNUM;
		            rem = firstNUM % secondNUM;
		            System.out.println(firstNUM + " = " + secondNUM + " (" + quotient + ") + " + rem);
		            firstNUM = secondNUM;
		            secondNUM = rem;
		        }
		    }


		    // For the GCD
		    static int theGCD(int firstNUM, int secondNUM) {
		        if (firstNUM == 0)
		            return secondNUM;

		        return theGCD(secondNUM % firstNUM, firstNUM);
		    }
		    
		    
		 // For the LCM
		    static void solutionLCM(int firstNUM, int secondNUM, int gcd) {
		        int lcm = (firstNUM * secondNUM) / gcd;
		        System.out.println("The LCM of ("+firstNUM+", "+ secondNUM +") = "+ firstNUM + "*" + secondNUM + "/" + gcd + " = " + lcm);
		    }

		}