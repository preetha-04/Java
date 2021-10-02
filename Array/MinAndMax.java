// 1. Find the minimum and maximum  element in an array ?
import java.util.Scanner;
class MinAndMax 
{
		public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of an array :");
			int n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter the array :");
			for(int i=0;i<n;i++)
		{
				arr[i]=sc.nextInt();
		}

		//finding maximum array
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
			System.out.println("maximum number is :"+max);
			//finding minimum array
			int min=arr[0];
			for(int i=0; i<arr.length; i++){
				if(min>arr[i])
				{
					min=arr[i];

				}
			}
			System.out.println("minimum number is ;"+min);
			}
}
	
	



