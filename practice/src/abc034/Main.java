package abc034;

import java.util.Scanner;

/**
 * 	http://abc034.contest.atcoder.jp/tasks/abc034_a
 *  ABC034_A
 *  Scanner��next�́A�X�y�[�X��؂�܂łŎ擾���Ă����
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		if(second > first){
			System.out.println("Better");
		}
		else{
			System.out.println("Worse");
		}
	}
}
