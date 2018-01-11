package java03;

public class Tautog {
	public static void main(String[] args) {
		int arr[][] = new int[][]{{1,2,3},{4,5,6}};
		System.out.println("二维数组是：");
		for(int x[] : arr){
			for(int y : x){
				System.out.println(y);
				
			}
			System.out.println();
			System.out.println();
			System.out.println(x[1]);
		}
	}
}
