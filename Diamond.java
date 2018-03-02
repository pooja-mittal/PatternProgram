import java.util.Scanner;
class Diamond
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter total lines");
		int n=scr.nextInt();
		if(n%2==0)
			n++;
		int stars=1, spaces=n/2;
		for(int i=0; i<n; i++) {
			for(int j=0; j<spaces; j++) {
				System.out.print(" ");
				} for(int k=0; k<stars; k++) {
					System.out.print("* ");
				} if(i<n/2) {
					spaces--;
					stars++;
				} else {
					spaces++;
					stars--;
				}
			System.out.println();
		}
	}
}	