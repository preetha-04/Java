// 3. write a program to sort the given array ?

class SortedArray 
{
	public static void main(String[] args) 
	{
		//initialize array
		int[] arr = new int[]{6,2,3,4,15};
		int temp = 0;
		//displaying original array
		System.out.print("Original Array is :");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" " );
		}
		//sort the array in ascending order
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]>arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
						
		}
			
	}
	System.out.println();
	System.out.print("Sorted Array is :");
	for(int i=0; i<arr.length; i++){
	   System.out.print(arr[i]+" " );		
		}
	}
	
}



	
