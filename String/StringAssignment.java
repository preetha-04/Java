import java.util.Scanner;

class StringAssignment 
{
	void CharacterPrint()
	{
		String s1="Java Programming Language";

		for(int i=0;i<s1.length();i++)
		{
			char b=s1.charAt(i);
			System.out.println("Character"+(i+1)+" "+"is : "+b+"\n");

		}
		System.out.println("*****************************************************"+"\n"+"\n");
	}
	void palindrome()
	{
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();

		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		String data = sb.toString();

		if(str.equals(data))
		{
			System.out.println("Given String is palindrome"+"\n");
		}
		else
		{
			System.out.println("Given String is not palindrome"+"\n");
		}
		System.out.println("*****************************************************"+"\n"+"\n");
	}
	void replaceCharacter()
	{
		String string="abcbcdjcfkd";
		for(int i=0;i<string.length();i++)
		{
			char ch=string.charAt(i);
			if(ch=='C')
			{
				continue;
			}
			System.out.println(ch+"\n"+"\n");
		}
	}

	public static void main(String[] args) 
	{
		StringAssignment sa=new StringAssignment();
		sa.CharacterPrint();
		sa.palindrome();
		sa.replaceCharacter();

		
	}
}
