package Algorithms.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class reduced_string {

	private static StreamTokenizer inputReader = new StreamTokenizer(
			new BufferedReader(new InputStreamReader(System.in)));

	private static Scanner scaner = new Scanner(System.in);

	static java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

	public static int nextInt() {
		int a = -1;
		try {
			inputReader.nextToken();
			a = (int) inputReader.nval;
		} catch (Exception e) {
		}
		return a;
	}

	public static void main(String[] args) throws IOException {
		String input = reader.readLine();
		System.out.println(reduce(input));
	}

	private static String reduce(String input) {
		String output = "";

		while (true) {
			int start = 0;
			int end = start + 1;

			while (start < input.length()) {
				while (end < input.length() && input.charAt(end) == input.charAt(start)) {
					end++;
				}

				if ((end - start) % 2 == 1) {
					output += (input.charAt(start) + "");
				}

				start = end;
				end = start + 1;
			}

			if (input.equals(output)) {
				if (input.equals("")) {
					return "Empty String";
				} else {
					return output;
				}
			} else {
				input = output;
				output = "";
			}
		}
	}
}
