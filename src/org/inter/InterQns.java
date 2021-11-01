package org.inter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InterQns {

	public static void main(String[] args) {

		// Factorial number
		
		// Scanner s =new Scanner(System.in);
		// int it = s.nextInt();
		// int c = 1;
		// for (int i =1 ; i <=it; i++) {
		//
		// c = c*i;
		//
		//
		// }
		// System.out.println(c);

		// Fibonacci Series

		// int n1 = 0, n2 = 1, num;
		// System.out.print(n1 + " " +
		// n2 + " ");
		//
		// for (int i = 0; i < 100; i++) {
		// num = n2 + n1;//2+1=3
		// System.out.print(num + " ");
		//
		// n1 = n2; //0=2--->n1=1
		// n2 = num;//2=3--->n2=3
		//
		//
		// }
		
		// Prime Number
		
		// int a =16;
		//// boolean b = false;
		// if (a%2==0) {
		//// b = true;
		//
		// System.out.println("np");
		// }
		//// if (!b) {
		//// System.out.println(a + "Prime Number");
		//// }
		// else {
		// System.out.println(a + " Prime Number");
		// }

		// Find the number same char present in the string

		// String s = "Selvakumar"; //Method 1------>Using string methods
		// char ser = 'a';
		//
		// int count=0;
		// for (int i = 0; i < s.length(); i++) {
		//
		// if (s.charAt(i)==ser) {
		// count++;
		// }
		// }
		// System.out.println("The count of a :"+count);
		//

		// Method 2------>Using Map
		
		// String s = "Selvakumar";
		// char ser ='a';
		//
		// Map<Character, Integer> m = new HashMap();
		//
		// for (int i = 0; i < s.length(); i++) {
		//
		// if (m.containsKey(s.charAt(i))) {
		// m.put(s.charAt(i), m.get(s.charAt(i))+1);
		// }
		// else {
		// m.put(s.charAt(i), 1);
		// }
		// }
		//
		// Integer result = m.get(ser);
		// System.out.println("The count of a :"+result);

		// Method 3------>Positions of 'a'
		// String s ="Selvakumar";
		// char ser ='a';
		//
		// System.out.println("The Postions of character a");
		// for (int i = 0; i < s.length(); i++) {
		// if (s.charAt(i)==ser) {
		// System.out.println(i);
		// }
		// }

		int number = 987654, reverse = 0;
		
		while (number != 0) {
			
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("The reverse of the given number is: " + reverse);
		
//  remainder= 987654 % 10 =4 (98765.4) only taken the number present after the decimal point
//	reverse = 0 * 10 + 4 =4
//	number = 987654 / 10 =98765 (98765.4) here after decimal not taken
//	reverse number is 4
		
//	remainder= 98765 % 10 =5 (9876.5) only taken the number present after the decimal point
//	reverse = 0 * 10 + 5 =5
//	number = 98765 / 10 =9876 (9876.5) here after decimal not taken
//	reverse number is 45
		
//	remainder= 9876 % 10 =6 (987.6) only taken the number present after the decimal point
//	reverse = 0 * 10 + 6 =6
//	number = 9876 / 10 =987 (987.6) here after decimal not taken
//  reverse number is 456
		
//	remainder= 987 % 10 =7 (98.7) only taken the number present after the decimal point
//	reverse = 0 * 10 + 7 =7
//	number = 987 / 10 =98 (98.7) here after decimal not taken
//	reverse number is 4567
		
//	remainder= 98 % 10 =8 (9.8) only taken the number present after the decimal point
//	reverse = 0 * 10 + 8 =8
//	number = 98 / 10 =9.8 (9.8) here after decimal not taken
//	reverse number is 45678
		
//	remainder= 9 % 10 =0.9 (0.9) only taken the number present after the decimal point
//	reverse = 0 * 10 + 9 =9
//	number = 9 / 10 =0 when number comes to 0 while loop get terminated
//	reverse number is 456789
		
	}
}
