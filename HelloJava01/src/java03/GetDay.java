package java03;

public class GetDay {
	public static void main(String[] args) {
		int day[] = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i=0;i<day.length;i++){
			System.out.print((i+1)+"月份有"+day[i]+"天"+"\t");
			if((i+1)%3 ==0){
				System.out.println();
			}
		}
	}
}
