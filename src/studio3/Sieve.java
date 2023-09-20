package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Enter a integer number.");
int n = scan.nextInt();
boolean[] primeArray = new boolean[n];
for(int i = 2; i<=n; i++)
{
	for(int j=2; j<=n; j++ ) {
		if ((i*j)< n)
		{primeArray[i*j] = true;
		}
			
		}
	}
for(int k=0; k< primeArray.length; k++) {
	if (primeArray[k] = false)
	{
		System.out.println(k);
	}
	}



}
}
