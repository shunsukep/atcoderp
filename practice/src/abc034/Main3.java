package abc034;

import java.util.Scanner;

/**
 * 	http://abc034.contest.atcoder.jp/tasks/abc034_C
 *  ABC034_C
 *  
 *  愚直版_これだと終わらない
 */
public class Main3 {
	private static long cnt = 0;
	private static int maxX,maxY;
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			maxX = sc.nextInt();
			maxY = sc.nextInt();
			count(1,1);
			System.out.println(cnt%1000000007);
		}
	}

	private static void count(int nx, int ny){
		if(nx+1<=maxX){
			count(nx+1, ny);
		}
		if(ny+1<=maxY){
			count(nx, ny+1);
		}
		if(nx==maxX && ny==maxY){
			cnt++;
		}
	}
}
