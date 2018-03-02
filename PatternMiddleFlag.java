import java.util.Scanner;
class PatternMiddleFlag
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the lines");
		int n=scr.nextInt();
			int p=n/2;
			int q=n/2-1;	
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(((j==q|| j==p)&& (i>=0 && i<(n-5))) || ((i==0 || i==2 || i==4) && (j>=q && j<(n-1))) || ((j==(n-2))&& (i>=0 && i<=4)) || ((i==(n-1) || i==(n-3)) && (j>=0 && j<(n-1))) || ((j==0 || j==(n-2)) && (i>=(n-2) && i<=(n-1))) || (i==(n-5) && (j>=4 && j<(n-7))) || ((j==4 || j==(n-7)) && (i>=(n-5) && i<=(n-4))))
						System.out.print("*");
						else
						System.out.print(" ");
					}
				System.out.println();
		}
	}
}