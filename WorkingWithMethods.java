package week03;

public class WorkingWithMethods {

	public static void main(String[] args) {
		
		// 1- runs every time you execute main
			System.out.println("Hello Class");
		
		//3- runs only if you call its method	
		sayHello();
		sayHello();
		sayHello();
		
	
	}
	//2- return, no parameter
	 public static void sayHello()
	 {
		 System.out.println("Hello Class");
		 System.out.println(" How are you!");
	 }
	 //4- returns value, no parameters
		 public static int minimumNumber()
		 {
			 int num1 = 6, num2 = 4, min = 0;
			 if(num1 > num2) {
				 min = num2;
			 }else {
				 min = num1;
			 }
			 return min;
		 
	 
	 }
	 

}
