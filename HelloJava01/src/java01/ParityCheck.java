package java01;

import java.util.Scanner;

public class ParityCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scan = new Scanner(System.in);
		long number = scan.nextLong();
		String check = (number%2 == 0)?"ż��":"����";
		System.out.println(check);
	}

}
