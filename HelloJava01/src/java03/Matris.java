package java03;

public class Matris {
	public static void main(String[] args){
		int a[][] = new int[3][4];
		System.out.println("输出三行四列都是0：");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
