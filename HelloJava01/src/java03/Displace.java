package java03;

import java.util.Arrays;

public class Displace {
	public static void main(String[] args) {
		int arr[] = new int[]{1,2,3,4,5};
		Arrays.fill(arr, 1,3,8);
		for(int i=0;i<arr.length;i++){
			System.out.println("第"+(i+1)+"个元素是"+arr[i]);
		}
	}
}
