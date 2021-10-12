package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MarriageCriteriaThrowsExcep {
	public void checkMarraigeCriteria(int getAgeInput) throws ArithmeticException,InputMismatchException{

			if(getAgeInput>0) {
				
			if(getAgeInput<20) {			
				throw new ArithmeticException();
			}else if (getAgeInput>20 && getAgeInput <30){
				System.out.println("Perfect age to marry");
				
			}else if(getAgeInput>30) {
				System.out.println("No need to marry");
			}
			}else {
				System.out.println("Enter valid Age");
			}
		}
	
		public static void main(String[] args) {
				MarriageCriteriaThrowsExcep obj = new MarriageCriteriaThrowsExcep();
				
				 try {
					 Scanner sc = new Scanner(System.in);
					 System.out.println("Enter Age :");
						int inputAge = sc.nextInt();					
						obj.checkMarraigeCriteria(inputAge);				
				} catch (InputMismatchException e) {
					System.out.println("Enter valid age");
				}
		}
}
