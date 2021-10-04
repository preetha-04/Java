class Swap{

	public static void main(String[] args){
		int Num1=15;
		int Num2=12;
		System.out.println("Before swapping:");
	
		
		System.out.println("value of Num1:"+Num1);
		System.out.println("value of Num2:"+Num2);

		System.out.println("After swapping:");

		Num1 = Num1 + Num2;
		Num2 = Num1 - Num2;
		Num1 = Num1 - Num2;

		System.out.println("value of Num1:"+Num1);
		System.out.println("value of Num2:"+Num2);
	}

}
