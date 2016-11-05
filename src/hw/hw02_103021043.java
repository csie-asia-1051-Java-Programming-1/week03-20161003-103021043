package hw;
/*
 * Topic:讓使用者輸入多個數，統計正數、負數及零各有多少個。
 * Date: 2016/10/03
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class hw02_103021043 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x=0;
		int y=0;
		int z=0;
		System.out.println("請輸入第一個數");
		int a=scn.nextInt();
		System.out.println("請輸入第二個數");
		int b=scn.nextInt();
		System.out.println("請輸入第三個數");
		int c=scn.nextInt();
		System.out.println("請輸入第四個數");
	    int d=scn.nextInt();
	    System.out.println("請輸入第五個數");
	    int e=scn.nextInt();
		if(a>0){
           x=x+1;
		}else if(a<0){
		   y=y+1;
		}else if(a==0){
			z=z+1;
		}
		
		if(b>0){
	       x=x+1;
		}else if(b<0){
		   y=y+1;
		}else if(b==0){
		   z=z+1;
			}
		
		if(c>0){
	       x=x+1;
        }else if(c<0){
		   y=y+1;
	    }else if(c==0){
		   z=z+1;
			}
		
		if(d>0){
	       x=x+1;
		}else if(d<0){
		   y=y+1;
		}else if(d==0){
		   z=z+1;
			}
		
		if(e>0){
	       x=x+1;
		}else if(e<0){
		   y=y+1;
		}else if(e==0){
		   z=z+1;
			}
		System.out.print("正數有"+x+"個　"+"負數有"+y+"個　"+"零有"+z+"個　");
	   }  
	}