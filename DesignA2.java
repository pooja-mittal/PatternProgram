import java.util.Scanner;
class DesignA1
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter total no of lines");
		int n=scr.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n/2; j++) {
				if((i==0) && ((j>0) || (j<n/2-1)))