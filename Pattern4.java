import java.util.Scanner;
class Pattern4
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter total no of lines");
		int n=scr.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if((i==0) || (i==(n-1)) || (j==0) ||(j==(n-1)))
					System.out.print("*");
					else
						System.out.print(" ");
				}
			System.out.println();
		}
		
	}
}	