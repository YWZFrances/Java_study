package java02;

public class BreakCyc {
	public static void main(String[] args){
		System.out.println("\n-----------�жϵ���ѭ������----------");
		String[] array = new String[]{"���1","���2","���3","���4","���5","���6","���7","���8","���9","���10","���11"};
		System.out.println("���㷢�ָ��7֮ǰ����������ɶ");
		for(String string : array){
			if(string.equals("���7")){
				break;
			}
			System.out.println("��"+string);
		}
		System.out.println("\n-----------�ж�˫��ѭ������----------");
		int [][] myScores = new int[][]{{61,62,63,64,65},{51,52,53,54,55},{71,72,73,74,75}};
		System.out.println("���Գɼ�:\n ��ѧ\t ����\t Ӣ��\t ����\t ��ʷ");
		No1:for(int[] is :myScores){
			for(int i:is){
				System.out.println(i+"\t");
				if(i<60){
					System.out.println("\n �ȵȣ�"+i+"�ķ���ʲô��զ������");
					break No1;
				}
			}
			
		}
	}
}
