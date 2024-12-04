package example;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		System.out.print("Enter The String :  ");
		Scanner sc = new Scanner(System.in);
		 String inputString = sc.nextLine();
		 
		 int vowelCount = 0;
		 
		for(int i=0; i<inputString.length(); i++) {
			char ch = inputString.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
			   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				
				vowelCount++;
			}
		}
		
		System.out.println("The Number Of Vowels In The Given String Is : "+vowelCount);
	}
}
