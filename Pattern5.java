import java.util.Scanner;
class Pattern5
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter total no lines");
		int n=scr.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				if((i==0) || (j==0) || (j==(n-2)) ||(i==((n-1)/2)))
					System.out.print("*");
					else 
						System.out.print(" ");
				}
			System.out.println();
		}
	}
}



