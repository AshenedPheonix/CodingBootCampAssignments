package week3CodingAssignment;

public class Week3CodingAssignment {

	//Creating methods to be executed for full program follows.
	
	static void range(int[] arr) {
		// Creating Method for range.
		System.out.println("**Age Array**");
		String concat = "";
		
		for ( int i = 0; i < arr.length; i++ ) {
		    concat += arr[i]+" ";
		}
		System.out.println(" ");
		System.out.println(concat);
		System.out.println(" ");
		System.out.println("Age Range is: ");
		
		// 1a. Taking the range.
		int firstAge = arr[0];
		int lastAge = arr[arr.length - 1];
		
		System.out.println( lastAge-firstAge );
		System.out.println("-------------------------------------------");

		}
	
	static void averageS(String[] arr) {
		// Creating Method for averaging String Arrays
		//using a loop to iterate calculate the average age of arrays.
		
		String concat = "";
		float sum = 0;
		int index = 0;
		

		for ( int i = 0; i < arr.length; i++ ) {
		    sum += (arr[index]).length();
		    concat += arr[index]+" ";
			index++;
		}	
		
		System.out.println("**Name Array**");
		System.out.println(" ");
		System.out.println(concat);
		System.out.println(" ");
		System.out.println("Average Letters:"+sum);
		System.out.println("-------------------------------------------");


		}

	static void average(int[] arr) {
		// Creating Method for averaging.
		//using a loop to iterate calculate the average age of arrays.
		
		float sum = 0;
		int index = 0;
		while (index < arr.length) {
			sum += arr[index];
			index++;
		}
		
		float average = sum/arr.length;
		
		//printing result to console.
		
		System.out.println("Average:"+average);
		System.out.println("-------------------------------------------");

		}
	
	static void nameL(String[] arr) {
		String length = "";
		int sum = 0;
		int index = 0;
		for ( int i = 0; i < arr.length; i++ ) {
		    length += ((arr[index]).length()+" ");
		    sum += (arr[index]).length();
			index++;
		}
		
		
		System.out.println("The length of the strings are: "+length);
		System.out.println("The sum of the string lengths is: "+sum);	
		System.out.println("-------------------------------------------");
	}
	
	static void repeat(String word, int n) {
		String repeat = "";
		for ( int i = 0; i < n; i++ ) {
		    repeat += word;
		}
		
		
		System.out.println("Word:"+word+" n: "+n);
		System.out.println(repeat);	
		System.out.println("-------------------------------------------");
	}
	
	static void fullN(String fName, String lName) {
		String fullName = fName+" "+lName;
		
		System.out.println("First Name:"+fName+" Last Name: "+lName);
		System.out.println("Full Name: "+fullName);	
		System.out.println("-------------------------------------------");
	}

	static void check100(int[] arr) {
		//using a loop to iterate check if total is over 100.
		
		float sum = 0;
		int index = 0;
		while (index < arr.length) {
			sum += arr[index];
			index++;
		}
		System.out.println("The total of the array is:"+sum);
		if (sum < 100) {
			System.out.println("More than 100: false");		
		} {
			System.out.println("More than 100: true");
		}


		System.out.println("-------------------------------------------");

		}
	
	static void doubleAverage(double[] arr) {
		String concat = "";
		int index = 0;
		double sum = 0;
		for ( int i = 0; i < arr.length; i++ ) {
		    concat += (arr[index]+" ");
		    sum += arr[index];
			index++;
		}
		
		double average = sum/(arr.length);
		
		System.out.println(" ");
		System.out.println("**Temperature Array**");
		System.out.println(concat);
		System.out.println("Average temperature is:"+average);
		System.out.println(" ");
		System.out.println("-------------------------------------------");
	}
	
	static void doubleCompare(double[] arrA, double[] arrB) {
		String concatA = "";
		int indexA = 0;
		double sumA = 0;
		for ( int i = 0; i < arrA.length; i++ ) {
		    concatA += (arrA[indexA]+" ");
		    sumA += arrA[indexA];
			indexA++;
		}
		
		double averageA = sumA/(arrA.length);
		
		String concatB = "";
		int indexB = 0;
		double sumB = 0;
		for ( int i = 0; i < arrB.length; i++ ) {
		    concatB += (arrB[indexB]+" ");
		    sumB += arrB[indexB];
			indexB++;
		}
		
		double averageB = sumB/(arrB.length);
		
		System.out.println(" ");
		System.out.println("**Temperature Arrays compared**");
		System.out.println(" ");
		System.out.println(concatA);
		System.out.println("Average temperature A is:"+averageA);
		System.out.println(" ");
		System.out.println(concatB);
		System.out.println("Average temperature B is:"+averageB);
		System.out.println(" ");
		
		if (averageA > averageB); {
			System.out.println("Temperature A is greater than temperature B: true");
		}	{
			System.out.println("Temperature A is greater than temperature B: flase");
		}
		System.out.println(" ");
		
		
		
		
		System.out.println("-------------------------------------------");
	}

	static void willBuyDrink(boolean hotOutside, double money) {
		System.out.println("It is hot outside: "+hotOutside);
		System.out.println("I have "+money+" dollars.");
		System.out.println(" ");
		if ((hotOutside = true) & (money > 10.50)) {
			System.out.println("I will buy a drink: true");
		} else { 
			System.out.println("I will buy a drink: false");
		}
		System.out.println(" ");	
		System.out.println("-------------------------------------------");
	}
	
	static void willIPass(boolean everythingCompleted, boolean late, int daysLate) {
		System.out.println("");
		System.out.println("Will I pass this assignment?");
		System.out.println("Completed the assignment:"+everythingCompleted);
		System.out.println("Assignment late:"+late);
		System.out.println("Number of days late:"+daysLate);
		System.out.println("");
		
		if(everythingCompleted = true);{
			if(late = true)
			{
				System.out.println("You'll pass with a grade of "+(100-(daysLate*10))+".");
			}
			else
			{
				System.out.println("You'll pass with a perfect score of 100!!");
			}
		}
		// Interestingly, I don't know why this prints???
		{
		System.out.println(".");
		}
	}
		
	// Execution of program follows.
	
	
	public static void main(String[] args) {
		
		//1. creating an array for int data types. Naming age to keep track.
		
		int[] ageArray = {3, 9, 23, 64, 2, 8, 28, 93};
		//1.a
		range(ageArray);
		
		//1.b creating array with new info, using same method.
		int[] newAgeArray = {3, 9, 23, 64, 2, 8, 28, 93, 106};		
		range(newAgeArray);
		
		//1.c using created average method
		average(ageArray);
		
		//2. creating a string array of names.
		String[] nameArray = new String[6];
		nameArray[0] = "Sam";
		nameArray[1] = "Tommy";
		nameArray[2] = "Tim";
		nameArray[3] = "Sally";
		nameArray[4] = "Buck";
		nameArray[5] = "Bob";
		
		//2.a/b Finding average AND concatenating
		
		averageS(nameArray);
		
		//5. & 6. String length shown.
		nameL(nameArray);
		
		//7. Word repeater
		repeat("Hello", 3);
		
		//8. Full Name
		fullN("Alexandra", "Hamilton");
		
		//9. Checking if over 100 with ageArray
		check100(ageArray);
		
		//10. Creating a double array then averaging the double array.
		double[] tempArray1 = {76.5, 52.3, 32.7, 62.0, 101.1};
		doubleAverage(tempArray1);
		
		//11. Creating another double array then comparing averages.
		double[] tempArray2 = {76.5, 52.3, 32.7, 62.0, 101.1};
		doubleCompare(tempArray1,tempArray2);
		
		//12. Creating variables for hot outside + money. Then returning true.
		boolean isHotOutside = true;
		double moneyInPocket = 15.00;
		
		willBuyDrink(isHotOutside,moneyInPocket);
		
		//13. Creating a method for seeing what my point total is on this assignment.
		boolean everythingCompleted = true;
		boolean late = true;
		int daysLate = 2;
		
		willIPass(everythingCompleted, late, daysLate);

	}
}