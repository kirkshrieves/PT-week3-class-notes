package week03;

public class InsertArray {

	public static void main(String[] args) {
		//Declare a fixed integer array of six elements
		//number of elements minus one gives you last index number
		int [] intArray = new int[6];
		// add three elements to the array
		for(int i = 0; i < 3; i++)
		{
			intArray[i] = (i + 1) * 5;
		}
		//Insert a new element at the end of the array
		//is enough space in the array to insert new element
		intArray[3] = 40;
		
		//inserting at the start of an array. First we will have to create a space for the new element
		//new element. We do that by shifting each element on index down. 
		//We need to go backwards to avoid over writing any element
		for(int i = 3; i >= 0; i--)
		{
			intArray[i + 1] = intArray[i];
		}
		intArray[0] = 20;
		
		//print elements
		for(int i = 0; i < intArray.length; i++)
		{
			System.out.println("Index " + i + "contains" + intArray[i]);
		}
		
	}

}
