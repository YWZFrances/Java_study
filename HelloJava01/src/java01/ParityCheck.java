package java01;

import java.util.Scanner;

public class ParityCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan = new Scanner(System.in);
		long number = scan.nextLong();
		String check = (number%2 == 0)?"偶数":"奇数";
		System.out.println(check);
	}

}
