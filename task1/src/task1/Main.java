package task1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//				System.out.println("***Prime numbers***");
//				IsPrime();
//				System.out.println("***Max number***");
//				ReCapDemo();
//				System.out.println("***Bold Vowel***");
//				Vowel();
//				System.out.println("***Perfect Number***");
//				isPerfectNumber();
		System.out.println("***Friend Numbers***");
		isFriendNumbers();
	}

	public static void ReCapDemo() {

		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;

		int max = sayi1;

		if (max < sayi2) {
			max = sayi2;

		}
		if (max < sayi3) {
			max = sayi3;

		}
		System.out.println(max);

	}

	public static void IsPrime() {
		for (int i = 2; i <= 1000; i++) {
			boolean check = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					check = true;
					break;
				}
			}

			if (check == false) {
				System.out.println(i);

			}

		}

	}

	public static void Vowel() {
		boolean isBoldVowel = false;
		System.out.println("enter the character");
		Scanner character = new Scanner(System.in);
		char vowel = character.next().charAt(0);

		switch (vowel) {
		case 'a':
		case 'o':
		case 'ı':
		case 'u':
			isBoldVowel = true;
		}
		if (isBoldVowel) {
			System.out.println(vowel + " kalin sesli harf");
		} else {
			System.out.println(vowel + " kalin sesli harf değil");
		}
	}

	public static boolean isPerfectNumber() {

		System.out.println("enter the number");
		Scanner number = new Scanner(System.in);
		int checkNumber = number.nextInt();
		int total = 0;
		for (int i = 1; i < checkNumber; i++) {
			if (checkNumber % i == 0) {
				total = total + i;
			}
		}
		if (checkNumber == total) {
			System.out.println(checkNumber + " is perfect number");
			return true;
		} else {
			System.out.println(checkNumber + " is not perfect number");
			return false;
		}

	}

	public static boolean isFriendNumbers() {
		int total1 = 0;
		int total2 = 0;
		System.out.println("enter the number");
		Scanner number = new Scanner(System.in);
		int checkNumber1 = number.nextInt();

		System.out.println("enter the number");
		Scanner number2 = new Scanner(System.in);
		int checkNumber2 = number.nextInt();

		for (int i = 1; i < checkNumber1; i++) {
			if (checkNumber1 % i == 0) {
				total1 = total1 + i;
			}
		}
		for (int i = 1; i < checkNumber2; i++) {
			if (checkNumber2 % i == 0) {
				total2 = total2 + i;
			}
		}

		if (checkNumber1 == total2 && checkNumber2 == total1) {
			System.out.println(checkNumber1 + " and " + checkNumber2 + " are friend numbers");
			return true;
		} else {
			System.out.println(checkNumber1 + " and " + checkNumber2 + " are not friend numbers");
			return false;
		}
	}

}
