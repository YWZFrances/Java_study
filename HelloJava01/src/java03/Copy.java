package java03;

import java.util.Arrays;

public class Copy {
	public static void main(String[] args) {
		int arr[] = new int[]{11,21,13,43,15};
		System.out.println("原来是");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		int arrnew[] = Arrays.copyOf(arr,3); 
		System.out.println("现在是");	
		for(int i=0;i<arrnew.length;i++){
			System.out.print(arrnew[i]+"\t");
		}
	}
}
