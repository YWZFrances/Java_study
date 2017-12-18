package java01;

import java.util.Scanner;

public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan = new Scanner(System.in);
		System.out.println("输入年份");
		long year = scan.nextLong();
		if(year%4 ==0 && year%100 != 0 || year %400 == 0){
			System.out.println("闰年");
		}else{
			System.out.println("不是");
		}
	}

}
