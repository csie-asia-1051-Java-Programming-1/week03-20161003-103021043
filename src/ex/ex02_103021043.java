package ex;
/*
 * Topic: 輸入一個字元，判斷是大寫或小寫或是其他字元。
 * Date: 2016/10/03
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class ex02_103021043 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		char ch1=scn.next().charAt(0);
		int v1=ch1-'a';
		if(v1>=0&&v1<26){
		System.out.print("這是英文小寫");
		}else{
			v1=ch1-'A';
			if(v1>=0&&v1<26){
				System.out.print("這是英文大寫");
			}else{
				System.out.print("出錯！這不是英文大小寫");
			}
		}
      }
	}


