package java01;

import java.util.Scanner;

public class VariableExchange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan = new Scanner(System.in);
		System.out.println("输入A");
		int A = scan.nextInt();
		System.out.println("输入B");
		int B = scan.nextInt();
		System.out.println("A等于"+A);
		System.out.println("B等于"+B);
		A = A ^ B;
		System.out.println("A等于"+A);
		System.out.println("B等于"+B);
		B = B ^ A;
		System.out.println("A等于"+A);
		System.out.println("B等于"+B);
		A = A ^ B;
		System.out.println("A等于"+A);
		System.out.println("B等于"+B);
	}

}
