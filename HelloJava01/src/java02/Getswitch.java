package java02;

import java.util.Scanner;

public class Getswitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("周几");
		Scanner scan = new Scanner(System.in);
		int week = scan.nextInt();
//		long name = scan.nextLong();
		switch(week){
		case 1:
			System.out.println("周1");
			break;
		case 2:
			System.out.println("周2");
			break;
		case 3:
			System.out.println("周3");
			break;
		case 4:
			System.out.println("周4");
			break;
		case 5:
			System.out.println("周5");
			break;
		default:
			System.out.println("不知道");
		}
//		switch(name){
//		case "ww":
//			System.out.println("周1");
//			break;
//		case "ee":
//			System.out.println("周2");
//			break;
//		
//		}
	}

}
