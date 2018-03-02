import java.util.Scanner;
class HollowDiamond {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter total no of lines");
		int n=scr.nextInt();
		int spaces=n/2;
		if(n%2==0)
			n++;
		for(int i=0; i<n/2+1; i++ ) {
			for(int j=spaces; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<(2*i+1); k++) {
				if(k==0 || k==2*i)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=n/2+1; i<n; i++) {
			for(int j=0; j<i-n/2; j++) {
				System.out.print(" ");
			} for(int k=0; k<n; k++) {
				if(k==0 || k==(2*(n-i-1)))
					System.out.print("*");
				else
					System.out.print(" ");
					
			}
			System.out.println();
		}
	}

}
