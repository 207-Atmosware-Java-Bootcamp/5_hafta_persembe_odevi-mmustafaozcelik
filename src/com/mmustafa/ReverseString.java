package com.mmustafa;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		getData();
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lutfen String giriniz : ");
		String str = sc.nextLine();
		sc.close();
		reverse(str);
	}
	
	public static void reverse(String str) {
		String newString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			String ch1 = "" + str.charAt(i);
			
			newString = newString + ch1;
		}
		System.out.println(newString);
	}
}
