import java.util.Scanner;
class AgmtPattern4
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter total no of lines");
		int n=scr.nextInt();
		int spaces=(n-1);
		for(int i=0; i<n; i++) {
			for(int j=spaces; j>0; j--) {
				System.out.print(" ");
			} for(int k=0; k<=i; k++) {
				System.out.print("*");
				} 
			System.out.println();
			spaces--;
		}
	}
}	
					
		