import java.util.*;

//Challenge: Print "Fizz","Buzz" and "FizzBuzz" for multiples of 3,5 and both(3,5) respectively

public class FizzBuzz{
	
	public static void main(String[] args){
		
		System.out.println("Enter maximum limit:");
		Scanner scanner=new Scanner(System.in);
		int n= scanner.nextInt();
		int[] arr=new int[n];
		String out=new String();
				
		for(int i=1;i<=n;i++){
			
			out+=i;
			if(i%15 == 0)out="FizzBuzz";
			else if(i%3 == 0)out="Fizz";		
			else if(i%5 == 0)out="Buzz";
						
			System.out.println(out);
			out="";
		}
		
	}
}