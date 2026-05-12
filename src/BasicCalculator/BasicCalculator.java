package BasicCalculator;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		num1=sc.nextDouble();

		num2 =sc.nextDouble();
		
		System.out.println("enter the operator(+,-,*,/):");
		char operator =sc.next().charAt(0);
		
		double result ;
		switch(operator) {
		case '+':
			result=num1+num2;
		case '-':
			result =num1-num2;
		case '*':
			result=num1*num2;
		case'/':
			result=num1/num2;
			break;
			default:
				
				System.out.println("invalid operator");
				return;
		}
		System.out.println("the final result");
		
		System.out.println((num1+""+operator+""+num2+"="+result));
		
	}

}
