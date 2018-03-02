import java.util.Scanner;
class AgmtPattern2
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter total no of lines");
		int n=scr.nextInt();
		int count=1;	
		for(int i=0; i<n; i++) {
			for(int j=0; j<(n-i); j++) {
				System.out.print(count + " " );
				count++;
				}
			System.out.println();
		}
	}
}
				
				