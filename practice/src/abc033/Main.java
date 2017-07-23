package abc033;

import java.util.Scanner;

/**
 * 	http://abc033.contest.atcoder.jp/tasks/abc033_a
 *  A.暗証番号
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int num = str.charAt(0);
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)!=num){
				System.out.println("DIFFERENT");
				break;
			}
			else if(i==str.length()-1){
				System.out.println("SAME");
			}
		}
	}
}
