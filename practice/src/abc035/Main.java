package abc035;

import java.util.Scanner;

/**
 * 	http://abc035.contest.atcoder.jp/tasks/abc035_a
 *  ABC035	_A
 *  Scannerのnextは、スペース区切りまでで取得してくれる
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		if(((double)first/second) > 1.4){
			System.out.println("16:9");
		}
		else{
			System.out.println("4:3");
		}
	}
}
