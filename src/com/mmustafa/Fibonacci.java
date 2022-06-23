package com.mmustafa;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		getData();
	}
	
	public static void getData() {
		Scanner sc = new Scanner(System.in);
		int firstNumber = 0, numberCount = 0;
		System.out.print("Lutfen Baslangic sayisini giriniz : ");
		firstNumber = sc.nextInt();
		System.out.print("Lutfen iterasyon adetini giriniz:");
		numberCount = sc.nextInt();
		sc.close();
		fibonacci(firstNumber, numberCount);
		
	}
	
	public static void fibonacci(int firstNumber, int numberCount) {
		int sum = firstNumber, secondNumber = firstNumber, number3 = 0;
		if (firstNumber == 0) {
			System.out.println("hesaplanamaz.");
		} else {
			System.out.print(firstNumber + "," + firstNumber + ",");
			for (int i = 0; i < numberCount - 1; i++) {
				if (i == 0) {
					System.out.print((firstNumber + firstNumber) + ",");
					secondNumber = firstNumber + firstNumber;
				} else {
					number3 = secondNumber + firstNumber;
					System.out.print(number3 + ",");
					firstNumber = secondNumber;
					secondNumber = number3;
					
				}
				
			}
		}
		
	}
}
