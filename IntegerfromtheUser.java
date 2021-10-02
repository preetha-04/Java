//1.Take 10 integer inputs from user and store them in an array and print them on screen ?

import java.util.*;
class IntegerfromtheUser 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int[]z = new int[10];
		for(int i=0; i<z.length; i++){
			System.out.println("Print the value of z["+i+"]");
			z[i] = s.nextInt();
		}
		for(int i=0; i<z.length; i++){
			System.out.println("Print the value of z["+i+"] is "+z[i]);
		}
		System.out.println("**************************************************");

	}
}


