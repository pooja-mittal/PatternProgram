import java.util.Scanner;
class PatternFlag
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter lines");
		int n=scr.nextInt();
			for(int i=0; i<25; i++) {
				for(int j=0; j<=25/2; j++) {
					if(( j==0 && (i>=0 && i<17)) || ((i==0 || i==2 || i==4) && (j>=0 && j<=12)) || ((i==16 ||i==14) && (j>=0 && j<=8)) || (i==12 && j>=0 && j<=4) || (j==12 && i>=0 && i<=4) || (j==8 && i>=14 && i<=16) || (j==5 && i>=12 && i<=14) || (j==1 && (i>=0 && i<=16)))
						System.out.print("*");
					else
						System.out.print(" ");
					}
				System.out.println();
			}
	}
}