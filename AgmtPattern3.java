import java.util.Scanner;
import java.lang.Math;
class AgmtPattern3
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter total no of lines");
		int n=scr.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				if(((i-j)%2==0) || ((j-i)%2==0))
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}
}
					