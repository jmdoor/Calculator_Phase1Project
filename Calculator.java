package calculator;

import java.util.Scanner;
public class calculator {
	
public static void main (String[] args) {
	
		System.out.println ("Hello. Welcome to a Basic Arithmetic Calculator");
		System.out.println ("Please enter two numbers followed by the operation desired: ");
		System.out.println ("('+' for 'Add', '- 'for 'Subtract', '*' for 'Multiply', or '/' for 'Divide')");
						
		
		Scanner input = new Scanner (System.in);
		
				double firstNum = input.nextDouble();
				double secondNum = input.nextDouble();
				double result;
				
	    char operation = input.next().charAt(0);
	   		   
		switch (operation) {
		
			case '+':
	        result = firstNum + secondNum;
	        break;

			case '-':
	        result = firstNum - secondNum;
	        break;

			case '*':
	        result = firstNum * secondNum;
	        break;

			case '/':
	        result = firstNum / secondNum;
	        break;
		
			default: 
		        System.out.println("That operation is invalid.");
		        return;
		}
		System.out.println ("The result of your request is: " + result);
	}

}