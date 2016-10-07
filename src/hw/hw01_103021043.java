package hw;
/*
 * Topic: 輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。
 * Date: 2016/10/03
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class hw01_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		for(;;){
		System.out.println("輸入一個正整數值(不含 0)");
		int c =scn.nextInt();
		if(c<=0){
			System.out.println("出錯重來");
				}
		else {
		String a =c+"";
		int b=a.length();
		System.out.println("是"+b+"位數");
		break;	
		   }	
		}
	}
}
