package java02;

public class CycFilter {
	public static void main(String[] args){
		String[] array = new String[]{"老鹰","小鸟","老鹰","小鸟","老鹰","小鸟","老鹰","小鸟","老鹰","小鸟","老鹰","小鸟"};
		System.out.println("我的花园里有许多鸟，但是来了很多老鹰，请帮我抓走");
		int laoying = 0;
		for(String string:array){
			if(string.equals("老鹰")){
				System.out.println("发现一只老鹰，抓起来");
				laoying++;
				continue;
			}
			System.out.println("搜索鸟类，发现了"+string);
		}
		System.out.println("一共抓到了"+laoying+"只老鹰");
	}
}
