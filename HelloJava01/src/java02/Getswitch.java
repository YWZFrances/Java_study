package java02;

import java.util.Scanner;

public class Getswitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("�ܼ�");
		Scanner scan = new Scanner(System.in);
		int week = scan.nextInt();
//		long name = scan.nextLong();
		switch(week){
		case 1:
			System.out.println("��1");
			break;
		case 2:
			System.out.println("��2");
			break;
		case 3:
			System.out.println("��3");
			break;
		case 4:
			System.out.println("��4");
			break;
		case 5:
			System.out.println("��5");
			break;
		default:
			System.out.println("��֪��");
		}
//		switch(name){
//		case "ww":
//			System.out.println("��1");
//			break;
//		case "ee":
//			System.out.println("��2");
//			break;
//		
//		}
	}

}
