package labstest;

public class videos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 5, 2, 8, 13, 6}; 
		
		System.out.println(array[0]);
		
		System.out.println(array[array.length - 1]);
		
		//System.out.println(array[6]);
		
		//System.out.println(array[-1]);
	
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	
		for(int number : array) {
			System.out.println(number);
		}
	
		int sum = 0;
		
		for (int number : array) {
			sum += number;
			
		}
		System.out.println(sum);
		
		int average = (sum / array.length);
		System.out.println(average);
		
		for (int number : array) {
			if (number % 2 == 1) {
				System.out.println(number);
			}
		}
	 
		String[] firstNames = {"Sam", "Sally", "Thomas", "Robert"};
		
		int sumOfLetters = 0; 
		
		for (String name : firstNames) {
			sumOfLetters += firstNames.length;
		}
		System.out.println(sumOfLetters);
	
	
	
	
	
	
	
	
	}

}
