import java.util.Scanner;
class DesignA
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter total no of lines");
		int n=scr.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n/2; j++) {
				if((i==0) || (i==n/2) || (j==0) || (j==(n/2)-1))
					System.out.print("*");
					else
						System.out.print(" ");
			}
			System.out.println();
		}
	}
}