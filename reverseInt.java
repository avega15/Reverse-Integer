
//The famous Fizz Buzz question!
//Print Fizz if divisible by 3, Buzz if divisible by 5, FizzBuzz if divisible my 3 and 5!
public class reverseInt{
	public static void main(String[] args) {
		int x = 1024634;
		
		System.out.println("Original int is: " + x);
		System.out.println("Reversed number is: " + reverseInt(x));	
	}

	
	
	public static int reverseInt(int x) {
		int reverse = 0;
		
		while(x != 0){
			reverse = reverse * 10 + x % 10;
			x = x / 10;
		}

		return reverse;
	}
}
