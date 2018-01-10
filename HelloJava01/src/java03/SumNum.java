package java03;

public class SumNum {
	public static void main(String[] args){
		int[] num = {1,2,3,4,5,6,7,8,9};
		int sum = 0;
		System.out.println("ºÍ£º");
		for(int i=0;i<num.length;i++){
			if(i==8){
				System.out.print(num[i]+"=");
			}else{
				System.out.print(num[i]+"+");
			}
			sum=sum+num[i];
		}
		System.out.println(sum);
	}
}
