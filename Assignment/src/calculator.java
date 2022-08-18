package calculator;

import java.util.Scanner;

public class calculator {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    char op;
	    Double number1, number2, result;

	    
	    Scanner input = new Scanner(System.in);

	    // ask user to enter operator
	    System.out.println("Choose an operator: +, -, *, or /");
	    op = input.next().charAt(0);

	    // ask user to enter numbers
	    System.out.println("Enter first number");
	    number1 = input.nextDouble();
    
	    System.out.println("Enter second number");
	    number2 = input.nextDouble();

	    switch (op) {

	      // performs addition between numbers
	      case '+':
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      // performs subtraction between numbers
	      case '-':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      // performs multiplication between numbers
	      case '*':
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      // performs division between numbers
	      case '/':
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;
          // default case if operator entered is wrong
	      default:
	        System.out.println("Invalid operator!");
	        break;
		}
	}

}