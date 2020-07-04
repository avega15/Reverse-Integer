
//The famous Fizz Buzz question!
//Print Fizz if divisible by 3, Buzz if divisible by 5, FizzBuzz if divisible my 3 and 5!
public class reverseInt{
	public static void main(String[] args) {
		//This can be any int
		int x = 1024634;
		
		System.out.println("Original int is: " + x);
		System.out.println("Reversed number is: " + reverseInt(x));	
	}

	
	
	public static int reverseInt(int x) {
		//Placeholder int
		int reverse = 0;
		
		//Go through each digit and place x's tenth place into reverse
		//and removes the tenth place from x.
		
		//Every loop adds x's tenth place to reverse
		//and reverse multiplies by 10 to keep the order reversed. 
		while(x != 0){
			reverse = reverse * 10 + x % 10;
			x = x / 10;
		}

		return reverse;
	}
}
