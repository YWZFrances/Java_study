package java04;

public class RunEncap {
	public static void main(String[] args){
		EncapTest encap = new EncapTest();
		encap.setName("james");
		encap.setAge(22);
		encap.setIdNum("No.01");
		 System.out.print("Name : " + encap.getName()+" Age : "+ encap.getAge());
	}
}
