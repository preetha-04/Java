import java.util.*;
class Task2 {
	public static void main(String[] args) 
	{

		Scanner s = new Scanner(System.in);
		System.out.print("enter the total amount :");
		int i=s.nextInt();
		int out;
		if(i<1000 && i>0){
			System.out.println("\nYour total purchase is"+i+"and you get 0% discount");
		}
		else if(i>=1000){
			out=i-(i/10);
			System.out.println("\nYour total purchase is"+i+"and you get 10% discount and the total amount to be paid is :"+out);
		}
		else{
			System.out.println("\nEnter a valid amount");
		}
	}
}
