package java01;

import java.util.Scanner;

public class VariableExchange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scan = new Scanner(System.in);
		System.out.println("����A");
		int A = scan.nextInt();
		System.out.println("����B");
		int B = scan.nextInt();
		System.out.println("A����"+A);
		System.out.println("B����"+B);
		A = A ^ B;
		System.out.println("A����"+A);
		System.out.println("B����"+B);
		B = B ^ A;
		System.out.println("A����"+A);
		System.out.println("B����"+B);
		A = A ^ B;
		System.out.println("A����"+A);
		System.out.println("B����"+B);
	}

}
