package java02;

public class CycFilter {
	public static void main(String[] args){
		String[] array = new String[]{"��ӥ","С��","��ӥ","С��","��ӥ","С��","��ӥ","С��","��ӥ","С��","��ӥ","С��"};
		System.out.println("�ҵĻ�԰��������񣬵������˺ܶ���ӥ�������ץ��");
		int laoying = 0;
		for(String string:array){
			if(string.equals("��ӥ")){
				System.out.println("����һֻ��ӥ��ץ����");
				laoying++;
				continue;
			}
			System.out.println("�������࣬������"+string);
		}
		System.out.println("һ��ץ����"+laoying+"ֻ��ӥ");
	}
}
