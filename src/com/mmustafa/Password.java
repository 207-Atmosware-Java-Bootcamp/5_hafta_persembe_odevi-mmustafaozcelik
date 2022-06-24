package com.mmustafa;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getData();
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lutfen Password giriniz : ");
		String str = sc.nextLine();
		sc.close();
		passwordHide(str);
	}
	
	public static void passwordHide(String str) {
		String newString = "";
		for (int i = 0; i < str.length(); i++) {
			
			if (i == 0) {
				newString += str.charAt(i);
			} else if (str.length() - 1 == i) {
				newString += str.charAt(i);
			} else {
				newString += "*";
			}
		}
		System.out.println(newString);
	}
}
