// 10.write a program to find the sum and program of all elements of an array ?

import java.util.Scanner;
class ArraySumandProduct 
{
	public static void main(String[] args) 
	{
		int a[],sum=0, prod=1,num;
		Scanner in=new Scanner(System.in);

		System.out.println("Enter the number of array elements :");
		num=in.nextInt();
		a=new int[num];

		System.out.println("Enter the array elements :");
		for(int i=0; i<num; i++)
			{
			System.out.println("Enter the "+(i+1)+" "+"element:");
			a[i]=in.nextInt();
		}
		for(int i=0;i<num;i++)
			{
			sum = sum + a[i];
			prod = prod * a[i];
		}

		System.out.println("Sum of array elements is :"+sum);
		System.out.println("Product of array element is :"+prod);
	

	}
}
