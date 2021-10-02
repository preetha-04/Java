// 5. Move all the negative elements to one side of an array ?

import java.util.Arrays;
 
class ReArrangeNegative {
     
  
    static void segregateElements(int arr[], int n)
    {
         
        int temp[] = new int[n];
         int j = 0; 
         
        for (int i = 0; i < n; i++){
            if (arr[i] >= 0){
                temp[j++] = arr[i];
			}
		}
 
        // If array contains all positive or all
        // negative.
        if (j == n || j == 0)
            return;
 
        // Store -ve element in temp array
        for (int i = 0; i < n; i++){
            if (arr[i] < 0){
                temp[j++] = arr[i];
			}
		}
		for (int i = 0; i < n; i++){
            arr[i] = temp[i];
		}
    }
     
		 public static void main(String arg[])
    {
        int arr[] = { 1, -1, -3, -2, 7, 5, 11, 6 };
        int n = arr.length;
 
        segregateElements(arr, n);
 
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
