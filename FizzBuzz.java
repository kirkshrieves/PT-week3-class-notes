package week03;

public class FizzBuzz {
/**
 * Write a program which iterates the integers from 1 to 50. For multiples of three print "Fizz" instead of the number, and for the multiples of five print "Buzz".
 * For numbers which are multiples of both three and five print "FizzBuzz"
 */
	public static void main(String[] args) {
			for(int i =1 ; i <= 50; i++)
			{
				if(i % 3 == 0 && i % 5 == 0)
				{
					System.out.println(i + "FizzBuzz");
				}
				else if(i % 3 == 0)
				{
					System.out.println(i + "Fizz");
				}
				else if(i % 5 == 0)
				{
					System.out.println(i + "Buzz");
				}
			}
	}

}
