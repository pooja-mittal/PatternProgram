import java.util.Scanner;
class Factorial
{
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter one no");
		long n=scr.nextInt();
		
		getFactorial(n);
		}
	static long getFactorial(long n) {
			long fact=1;
		if(n<0) {
			System.out.println("not possible");
			return -1;
		}
		else if(n==0) {
			System.out.println("1");
			return 1;	
		}
		for(int i=1; i<=n; i++) {
			fact=fact*i;
		}
		System.out.println("factorial of " + n + " is " + fact);
		return fact;
		}
}
