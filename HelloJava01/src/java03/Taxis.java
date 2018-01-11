package java03;

import java.util.Arrays;

public class Taxis {
	public static void main(String[] args) {
		int arr[] = new int[]{11,21,13,43,15};
		System.out.println("原来是");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		Arrays.sort(arr);
		System.out.println("\n"+"排序之后的数组是：");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}
