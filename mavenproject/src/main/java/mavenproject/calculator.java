package mavenproject;

import java.util.Scanner;

public class calculator {
	public float addition(float a, float b) {
	    float add = a + b;
	    return add;
	  }
	public float subtraction(float a, float b){
		float sub = a - b;
		return sub;
	}
	public float multiply(float a, float b){
		float mul = a * b;
		return mul;
	}
	public float divide(float a, float b){
		float div = a / b;
		return div;
	}

	  public static void main(String[] args) {
	    
	    float num1, num2, result;
	    char operator;

	    Scanner sc = new Scanner(System.in);
	    
	    num1 = sc.nextFloat();
	    num2 = sc.nextFloat();
	    operator = sc.next().charAt(0);
	    
	    calculator obj = new calculator();
	    if(operator == '+'){
	    	 result = obj.addition(num1, num2);
	    }
	    else if(operator == '-'){
	    	result = obj.subtraction(num1, num2);
	    }
	    else if(operator == '*'){
	    	result = obj.multiply(num1, num2);
	    }
	    else{
	    	result = obj.divide(num1, num2);
	    }
	    
	    System.out.println("Result is: " + result);
	    
	  }
}
