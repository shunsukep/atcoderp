package abc034;

import java.util.Scanner;

/**
 * 	http://abc034.contest.atcoder.jp/tasks/abc034_b
 *  ABC034_B
 */
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n%2 == 0 ? n-1 : n+1);
	}
}
