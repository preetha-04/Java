import java.util.Scanner;
class Task4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character :");
		char c = sc.next().charAt(0);
		int n = c;

		if(c >= 65 && c <= 90){
			System.out.println(" It is Uppercase");
		}
		else if(c >= 97 && c<=122){
			System.out.println("It is Lowercase");
			}
	}
}
