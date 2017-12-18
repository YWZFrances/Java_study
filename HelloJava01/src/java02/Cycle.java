package java02;

public class Cycle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a = 100;
		while(a >= 60){
			System.out.println("a = 60");
			a--;
		}
		int b = 100;
		do
		{
			System.out.println("b = 100");
			b--;
		}
		while(b == 60);
	}

}
