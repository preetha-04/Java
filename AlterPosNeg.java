// 9. How to rearrange array in alternating positive and negative number ?

import java.util.Arrays;
 
class AlterPosNeg
{
    public static int partition(int[] A)
    {
        int j = 0;
        int pivot = 0;   
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] < pivot)
            {
                // swap `A[i]` with `A[j]`
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
 
                j++;
            }
        }
 
        // holds the index of the first positive element
        return j;
    }
 

    public static void rearrange(int[] A)
    {
        
 
        int p = partition(A);
 
 
        for (int n = 0; (p < A.length && n < p); p++, n += 2)
        {
            
            int temp = A[n];
            A[n] = A[p];
            A[p] = temp;
        }
    }
 
    public static void main(String[] args)
    {
        int[] A = { 9, -3, 5, -2, -8, -6, 1, 3 };
 
        rearrange(A);

        System.out.println(Arrays.toString(A));
    }
}










