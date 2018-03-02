import java.util.Scanner;
class Pattern2
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter no of lines");
		int n=scr.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
	
}


//