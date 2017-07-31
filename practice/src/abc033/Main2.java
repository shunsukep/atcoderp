package abc033;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 	http://abc033.contest.atcoder.jp/tasks/abc033_b
 *  ABC033_B
 */
public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		ArrayList<String> townName = new ArrayList<>();
		ArrayList<Integer> townNum = new ArrayList<>();
		for(int i= 0;i<n;i++){
			townName.add(sc.next());
			townNum.add(sc.nextInt());
			sum += townNum.get(i);
		}
		int majority = sum/2;
		int majorityN = -1;
		
		for(int i= 0;i<n;i++){
			if(townNum.get(i) > majority && townNum.get(i) > majorityN){
				majorityN = i;
			}
		}
		if(majorityN!=-1){
			System.out.println(townName.get(majorityN));
		}
		else{
			System.out.println("atcoder");
		}
	}
}
