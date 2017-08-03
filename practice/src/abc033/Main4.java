package abc033;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 	http://abc033.contest.atcoder.jp/tasks/abc033_d
 *  ABC033_D
 *
 *  ダメ版→
 *
 *  ヘロンの公式
 *  S = sqrt(s*(s-a)*(s-b)*(s-c))
 *  s = (a+b+c/2)
 *  if a > b,c
 *  h = 2*S/a
 *  θb = arcsin(h/c)
 *  θc = arcsin(h/b)
 *  θa = 180 - θb - θc
 */
public class Main4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> xs = new ArrayList<>();
		ArrayList<Integer> ys = new ArrayList<>();

		for(int i=0;i<n;i++){
			xs.add(i,scanner.nextInt());
			ys.add(i,scanner.nextInt());
		}
		Map<String,Boolean> skip = new HashMap<>();
		ArrayList<Integer> sortList = new ArrayList<>();
		Map<String,Integer> calculateSkip = new HashMap<>();
		ArrayList<Double> calculateSortList = new ArrayList<>();
		String str = "";
		int ei = 0,cho = 0,don = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				for(int k=0;k<n;k++){
					if(i==j || j==k || k== i){
						continue;
					}
					sortList.clear();
					sortList.add(i);
					sortList.add(j);
					sortList.add(k);
					sortList.sort(java.util.Comparator.naturalOrder());
					str = sortList.get(0)+","+sortList.get(1)+","+sortList.get(2);
					if(skip.containsKey(str) == true){
						continue;
					}
					else{
						skip.put(str,true);
						double a = Math.sqrt(Math.pow(ys.get(j)-ys.get(i),2) + Math.pow(xs.get(j)-xs.get(i),2));
						double b = Math.sqrt(Math.pow(ys.get(k)-ys.get(j),2) + Math.pow(xs.get(k)-xs.get(j),2));
						double c = Math.sqrt(Math.pow(ys.get(i)-ys.get(k),2) + Math.pow(xs.get(i)-xs.get(k),2));
						calculateSortList.clear();
						calculateSortList.add(a);
						calculateSortList.add(b);
						calculateSortList.add(c);
						calculateSortList.sort(java.util.Comparator.naturalOrder());
						str = calculateSortList.get(0)+","+calculateSortList.get(1)+","+calculateSortList.get(2);
						if(calculateSkip.containsKey(str) == true){
							int key = calculateSkip.get(str);
							if(key==0){
								ei++;
							}
							else if(key==1){
								cho++;
							}
							else{
								don++;
							}
							continue;
						}
						double s = (a+b+c)/2.0;
						double S = Math.sqrt(s*(s-a)*(s-b)*(s-c));
						double h = 0;
						double thetaB = 0;
						double thetaC = 0;
						double thetaA = 0;
						if(a >= b && a >= c){
							h = 2*S/a;
							thetaB = Math.round(Math.toDegrees(Math.asin(h/c)));
							thetaC = Math.round(Math.toDegrees(Math.asin(h/b)));
							thetaA = 180 - (thetaB+thetaC);
						}
						else if(b >= a && b >= c){
							h = 2*S/b;
							thetaB = Math.round(Math.toDegrees(Math.asin(h/c)));
							thetaC = Math.round(Math.toDegrees(Math.asin(h/a)));
							thetaA = 180 - (thetaB+thetaC);
						}
						else {
							h = 2*S/c;
							thetaB = Math.round(Math.toDegrees(Math.asin(h/b)));
							thetaC = Math.round(Math.toDegrees(Math.asin(h/a)));
							thetaA = 180 - (thetaB+thetaC);
						}
						if(thetaA < 90.0 && thetaB < 90.0  && thetaC < 90.0){
							calculateSkip.put(str, 0);
							ei++;
						}
						else if(thetaA==90.0 || thetaB == 90.0 || thetaC == 90.0){
							calculateSkip.put(str, 1);
							cho++;
						}
						else{
							calculateSkip.put(str, 2);
							don++;
						}
					}
				}
			}
		}
		System.out.println(String.valueOf(ei) + " " + String.valueOf(cho) + " " + String.valueOf(don));
		scanner.close();
	}
}
