package com.vnrvjiet.ankitha.calculator;

import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		int m, n, opt;
		Scanner s = new Scanner(System.in);
		try {

			System.out.print("Enter first number:");
			m = s.nextInt();
			System.out.print("Enter second number:");
			n = s.nextInt();

			while (true) {
				System.out.println("Enter 1 for addition");
				System.out.println("Enter 2 for subtraction");
				System.out.println("Enter 3 for multiplication");
				System.out.println("Enter 4 for division");
				System.out.println("Enter 5 to Exit");
				opt = s.nextInt();
				MathOperation obj = new MathOperation();
				switch (opt) {
				case 1:

					int sum = obj.add(m, n);

					System.out.println(sum);
					break;

				case 2:
					int subans = obj.sub(m, n);
					System.out.println("Result:" + subans);
					break;

				case 3:
					int mulans = obj.mul(m, n);
					System.out.println("Result:" + mulans);

					break;

				case 4:
					double divans = obj.div(m, n);
					System.out.println("Result:" + divans);

					break;

				case 5:
					System.exit(0);
				}
			}

		} catch (Exception e) {
			System.out.println("enter only number");
		}
	}
}
