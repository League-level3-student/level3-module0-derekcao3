package _03_More_Array_Fun;

import java.util.Random;

import javax.swing.JOptionPane;

public class MoreArrayFun {
	static String w1;
	static String w2;
	static String w3;
	static String w4;
	static String w5;

	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		w1 = JOptionPane.showInputDialog("Type a word");
		w2 = JOptionPane.showInputDialog("Type a second word");
		w3 = JOptionPane.showInputDialog("Type a third word");
		w4 = JOptionPane.showInputDialog("Type a fourth word");
		w5 = JOptionPane.showInputDialog("Type a fifth word");
		printStrings();
		printReverse();
		printOther();
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public static void printStrings() {

		String s[] = { w1, w2, w3, w4, w5 };
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public static void printReverse() {
		String s[] = { w1, w2, w3, w4, w5 };
		for (int i = s.length - 1; i >= 0; i--) {
			System.out.println(s[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public static void printOther() {
		String s[] = { w1, w2, w3, w4, w5 };
		for (int i = 0; i < s.length; i = i + 2) {
			System.out.println(s[i]);
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	public static void printRandom() {
		Random rand = new Random();
		String s[] = { w1, w2, w3, w4, w5 };
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

	}
}
