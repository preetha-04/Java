package Exception;
import java.util.*;

public class MarriageCriteriaThrowExcep {
	public void checkMarriageCriteria(int getAgeInput) {
	try {
		if(getAgeInput>0) {
			
		if(getAgeInput<20) {			
			throw new ArithmeticException();
		}else if (getAgeInput>20 && getAgeInput <30){
			System.out.println("Perfect age to marry");
			
		}else if(getAgeInput>30) {
			System.out.println("No need to marry");
		}
		}else {
			System.out.println("Enter valid number");
		}
	}
	catch(ArithmeticException e) {
	
			System.out.println("At this age, you are eligible to marry");
	}catch(InputMismatchException e) {
		System.out.println("Enter valid input");
	}
	
	}
	public static void main(String[] args) {
			MarriageCriteriaThrowExcep obj = new MarriageCriteriaThrowExcep();
			Scanner sc=new Scanner(System.in);
			 try {
				 System.out.println("Enter Age :");
					int inputAge=sc.nextInt();					
					obj.checkMarriageCriteria(inputAge);				
			} catch (InputMismatchException e) {
				System.out.println("Enter number only");
			}
	}
}

