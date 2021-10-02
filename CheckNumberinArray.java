//2. Take 10 integer inputs from user and store them in an array. Again ask user to enter
//    a number and Now, tell user to check whether that number is present in an array or not ?


import java.util.*;
class CheckNumberinArray 
{
	public static void main(String[] args) 
	{
		Scanner src = new Scanner(System.in);
			int count=0;
		int size=5, i=0;
        System.out.println("Enter the 5 integer :");
		int array[]=new int[size];
		for(i=0; i<size; i++)
			{
			array[i] = src.nextInt();
			}
			System.out.println("Enter the number and check it is available in the arrray element :");
		    int x=src.nextInt();
		    for(i=0; i<size; i++)
				{
				if(x == array[i])
					{
					count++;
					}
				}
				if(count>0)
					{
					System.out.println("The number "+x+" is present in the array ");
					}else
						{
						System.out.println("The number "+x+" is not present in the array");
						}
	}
}

