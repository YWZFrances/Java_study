package java01;

import java.util.Scanner;

public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scan = new Scanner(System.in);
		System.out.println("�������");
		long year = scan.nextLong();
		if(year%4 ==0 && year%100 != 0 || year %400 == 0){
			System.out.println("����");
		}else{
			System.out.println("����");
		}
	}

}
