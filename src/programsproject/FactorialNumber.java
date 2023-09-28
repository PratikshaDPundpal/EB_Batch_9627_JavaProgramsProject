package programsproject;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		int n, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}