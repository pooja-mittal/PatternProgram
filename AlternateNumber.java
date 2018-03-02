import java.util.Scanner;
public class AlternateNumber {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the starting range");
		int f=scr.nextInt();
		System.out.println("enter the last range");
		int r=scr.nextInt();
		int a=0;
		int count=0;
		 for(int i=f; i<r; i++) {
			 a=0;
			 for(int j=2; j<=i/2; j++) {
				 if((i%j)==0) {
					 a=1;
					 break;
				 } else {
					 a=0;
				 }
			 } if(a==0) {
				 count++;
				 if((count%2)!=0)
					 System.out.print(i + " ");
			 }
			 
		 }
	}
}