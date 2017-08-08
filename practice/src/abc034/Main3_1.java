package abc034;

import java.util.Scanner;

/**
 * 	http://abc034.contest.atcoder.jp/tasks/abc034_C
 *  ABC034_C
 *
 *  動的計画法版(これだと100点、メモリオーバーで101点にならない)
 */
public class Main3_1 {
	private static long[][] dp;
	private static int maxX,maxY;
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			maxX = sc.nextInt();
			maxY = sc.nextInt();
			dp = new long[maxY+1][maxX+1];
			for(int ny = 1;ny <= maxY;ny++){
				for(int nx = 1;nx <= maxX;nx++){
					if(nx==1||ny==1){
						dp[ny][nx] = (long) 1;
					}
					else{
						dp[ny][nx] = (dp[ny-1][nx] + dp[ny][nx-1])%1000000007;
					}
				}
			}
			System.out.println(dp[maxY][maxX]);
		}
	}
}
