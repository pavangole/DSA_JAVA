package Basic;

/* package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
		    int n = sc.nextInt();
		    long sum = 0;
		    long arr[] = new long[n];
		    for (int i = 0; i < n; i++) {
		        long temp = sc.nextInt();
		        arr[i] = temp ;
		        sum = sum + temp;
		    }
		    if (n == 1) {
		        System.out.print(sum / 2 );
		    }
		    else {
		        for (int i = 0; i < n;i++ ) {
		            System.out.print(Math.abs((sum / (n + 1)) - arr[i]) + " ");
		        }
		    }
		    System.out.println();
		}
	}
}

