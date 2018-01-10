package java03;
import java.util.Arrays;

public class ArrayRowColumnSwap {
	public static void main(String[] args){
		int arr1[][] = new int[][]{{1,2,3},{4,5,6}};
		System.out.println("置换前：");
		System.out.println(Arrays.deepToString(arr1)); 
		int arr2[][] = new int[arr1[0].length][arr1.length];
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				arr2[j][i] = arr1[i][j];
			}
		}
		System.out.println("置换后：");
		System.out.println(Arrays.deepToString(arr2)); 
		System.out.println();
		int arr3[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr3.length;i++){
			for(int j=0;j<arr3[i].length;j++){
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		int tr = 0;
		for(int i=0;i<arr3.length;i++){
			tr += arr3[i][i];
		}
		System.out.println(tr);
	}
}
