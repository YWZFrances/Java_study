package java02;

public class BreakCyc {
	public static void main(String[] args){
		System.out.println("\n-----------中断单层循环例子----------");
		String[] array = new String[]{"蛤蟆1","蛤蟆2","蛤蟆3","蛤蟆4","蛤蟆5","蛤蟆6","蛤蟆7","蛤蟆8","蛤蟆9","蛤蟆10","蛤蟆11"};
		System.out.println("在你发现蛤蟆7之前，告诉我有啥");
		for(String string : array){
			if(string.equals("蛤蟆7")){
				break;
			}
			System.out.println("有"+string);
		}
		System.out.println("\n-----------中断双层循环例子----------");
		int [][] myScores = new int[][]{{61,62,63,64,65},{51,52,53,54,55},{71,72,73,74,75}};
		System.out.println("考试成绩:\n 数学\t 语文\t 英语\t 政治\t 历史");
		No1:for(int[] is :myScores){
			for(int i:is){
				System.out.println(i+"\t");
				if(i<60){
					System.out.println("\n 等等，"+i+"的分是什么，咋不及格");
					break No1;
				}
			}
			
		}
	}
}
