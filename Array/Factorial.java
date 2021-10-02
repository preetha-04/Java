// 7. Find the factorial of the larger number ?

import java.util.Scanner;
import java.math.BigInteger;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Larger Number :");
		int n=sc.nextInt();

		BigInteger fact=BigInteger.valueOf(1);
		for (int i=1; i<n ; i++ )
		{
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println("Factorial of larger number is :"+fact);

	}
}
