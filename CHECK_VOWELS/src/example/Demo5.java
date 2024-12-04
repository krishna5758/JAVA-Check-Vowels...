package example;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the String: ");
		 String inputString = sc.nextLine();
		 
		 System.out.print("the vowels in the given String are : ");
		 
		 for(int i=0; i<inputString.length(); i++) {
			 char ch = inputString.charAt(i);
			 
			 if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
				ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				 
				 System.out.print(ch + ", ");
				 
			 }
		 }
	}
}
