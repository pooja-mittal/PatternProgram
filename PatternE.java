import java.util.Scanner;
class PatternE
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter lines");
		int n=scr.nextInt();
		int stars=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j==0 && (i>0 && i<n-1) || ((i==0 || i==n/2 || i==n-1) &&(j>0 && j<n/2-1)))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}