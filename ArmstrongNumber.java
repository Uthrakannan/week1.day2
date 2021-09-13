package week1.day2.assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input=153;
		int calculated=0,original,remainder;
		
		original=input;
		
		while(input>0)
		{
			
			remainder=input%10;
			input=input/10;
			calculated= calculated+(remainder*remainder*remainder);
			
		
			
		}
		if(original==calculated)
		{
			System.out.print("Given number Armstrong number: " + original);
		}
		else
		{
			System.out.print("Given number is not an Armstrong number: " + original);
		}

	}

}
