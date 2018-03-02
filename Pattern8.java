import java.util.Scanner;
class Pattern8
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter lines");
		int n=scr.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++){
				if(((j==0) && ((i>0) && (i<n-1))) || (((i==0) || (i==n-1)) && ((j>0) && (j<n/2))))
				System.out.print("*");
				else
				System.out.print(" ");
			}
		System.out.println();
		}
	}
}	