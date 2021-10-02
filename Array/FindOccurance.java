// 4. Find the occurance of an integer in the array ?

import java.util.Scanner;
class FindOccurance 
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int freq[] = new int[size];
		System.out.println("Enter the array :");
        for(int i=0; i<size; i++)
			{
			arr[i] = sc.nextInt();
			}
			for(int i=0; i<arr.length; i++)
				{
				int num=arr[i];
				int count=1;
				for(int j=i+1; j<arr.length; j++)
					{
					if(num == arr[j])
						{
						count++;
						freq[j]= -1;
						}
					}
					if(freq[i] != -1)
						{
						freq[i]=count;
						}
				}
				for(int i=0; i<freq.length; i++)
					{
					if(freq[i] != -1)
						{
						System.out.println("Occurance of "+arr[i]+" "+"is : "+freq[i]);
					    }
					}
	}
}
