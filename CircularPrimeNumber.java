import java.util.Scanner;
class CircularPrimeNumber{

	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number to Check Number is circular prime Or not");
		int inputNum = scn.nextInt();
		int mul = 1;
		int temp = inputNum;
		// finding length of inputNum without using length measure methodes.
		for(int x = inputNum; x>0;x=x/10){
			mul = mul*10;
		}
		mul = mul/10;
		do{
			if(! isPrime(temp)){
				System.out.println(temp+" is not a prime number Hence "+inputNum+" is not a circular prime." );
				return;
			}
			System.out.println(temp+" is a prime number");
			int remainder = temp%10;
			int quotient = temp/10;
			// circulating number from last digit to first.
			temp = (remainder * mul) + quotient;
		}while(temp!=inputNum);
		System.out.println("Hence "+inputNum+" is a circular prime." );
	}
  
	private static Boolean isPrime(int number){
		if(number < 2)
			return false;
		for(int i = 2 ; i< number/2; i++)
			if(number%i == 0)
				return false;
		return true;
	}
	/*
	I/O : Enter number to Check Number is circular prime Or not 
		1193
		1193 is a prime number
		3119 is a prime number
		9311 is a prime number
		1931 is a prime number
		Hence 1193 is a circular prime.
	*/
}
