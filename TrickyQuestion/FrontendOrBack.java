//5. write a program to check if elements of an array are same or not it
//     read from front end or back.


import java.util.*;
class FrontendOrBack 
{
	public static void main(String[] args) 
	{
		int[]a = {2,3,15,15,3,2};	
		int n = a.length;
		int flag = 0;

		for(int i=0; i<=n/2 && n != 0; i++){

			if(a[i] != a[n-i-1]){
				flag=1;
				break;
			}
		}
		if (flag == 1)
		{ 
			System.out.println("Given array elements are not same from front end or back");
		}
		else{
			System.out.println("Given array elements are  same from front end or back");

			System.out.print("Array elements are :");
			for(int i=0; i<a.length; i++){
				System.out.print(a[i]+" ");
			}
			System.out.println();				

		}
	}
}
