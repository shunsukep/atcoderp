package abc034;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

import javax.naming.spi.DirObjectFactory;

/**
 * 	http://abc034.contest.atcoder.jp/tasks/abc034_C
 *  ABC034_C
 *
 *  数学版
 *  上にH-1回右にW-1回移動する組み合わせの個数を求めれば良い
 *  H+W-2回中移動する中からH-1回移動する組み合わせなので
 *  H+W-2 C H-1 ＝ (H+W-2)!/(H-1)!(W-1)!
 *  →これはオーバーフローする
 *
 *  逆元を求めれば良い
 *  (参考:http://techtipshoge.blogspot.jp/2013/11/blog-post_6097.html)
 *
 *  M=1_000_000_007Lは素数なので、mod Mでの割り算は掛け算に変換できる
 *  フェルマーの小定理より
 *  pが素数なら、a^p−1 ≡ 1 (mod p)
 *  つまり a^p-2 ≡ a^-1 (mod p)
 *  すなわち、Aで割りたいときはAのM^-2でかければよい
 */
public class Main3_2 {
	private static Long[][] dp;
	private static int maxX,maxY;
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			maxX = sc.nextInt();
			maxY = sc.nextInt();
			dp = new Long[maxY+1][maxX+1];
			for(int ny = 1;ny <= maxY;ny++){
				for(int nx = 1;nx <= maxX;nx++){
					if(nx==1||ny==1){
						dp[ny][nx] = (long) 1;
					}
					else{
						dp[ny][nx] = dp[ny-1][nx] + dp[ny][nx-1];
					}
				}
			}
			System.out.println(dp[maxY][maxX]%1000000007);
		}
	}
}
