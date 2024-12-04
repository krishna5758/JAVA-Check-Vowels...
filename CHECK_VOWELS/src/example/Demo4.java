package example;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the String : ");
		 String inputString = sc.nextLine();
		 
		 int vowelCount=0;
		 
		 for(int i=0; i<inputString.length(); i++) {
			 char ch = inputString.charAt(i);
			 
			 if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
				ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				 
				 vowelCount++;
			 }
		 }
		 
		 System.out.println("number of vowels present in the String are : "+vowelCount);
				
	}
}
