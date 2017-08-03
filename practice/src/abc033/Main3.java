package abc033;

import java.util.Scanner;

/**
 * 	http://abc033.contest.atcoder.jp/tasks/abc033_c
 *  ABC033_C
 */
public class Main3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		String[] multipleStr = str.split("\\+");
		int num=0;
		for(int i=0;i<multipleStr.length;i++){
			if(multipleStr[i].indexOf('0') == -1){
				num++;
			}
		}
		System.out.println(num);
		scanner.close();
	}
}
