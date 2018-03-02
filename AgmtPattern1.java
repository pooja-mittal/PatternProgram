import java.util.Scanner;
class AgmtPattern1
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter total no of lines");
		int n=scr.nextInt();
		int spaces=0;
		for(int i=n; i>0; i--) {
			for(int j=0; j<spaces; j++) {
				System.out.print(" ");
				}	
				for(int k=0; k<i; k++) {
					System.out.print("*");
				}
			System.out.println();
			spaces++;
		}
	}
}
