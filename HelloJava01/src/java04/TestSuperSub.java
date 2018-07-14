package java04;

public class TestSuperSub {
	public static void main(String[] args){
		SubClass sc = new SubClass();
		SubClass sc2 = new SubClass(1000);
	}
}

class SuperClass{
	private int n;
	SuperClass(){
		System.out.println("父类的无参数函数");
	}
	SuperClass(int n){
		System.out.println("父类的有参数函数"+n);
		this.n = n;
	}
}
class SubClass extends SuperClass{
	private int n;
	SubClass(){
		super(300);
		System.out.println("子类的无参数函数");
	}
	SubClass(int n){
		System.out.println("子类的又参数函数"+n);
		this.n = n;
	}
	
	
}

