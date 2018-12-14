// Program to print all primes smaller than or equal to n using Sieve of Eratosthenes 
import java.util.*;
class SieveOfEratosthenes 
{ 
	void sieveOfEratosthenes(int n) 
	{ 
		boolean prime[] = new boolean[n+1]; 
		for(int i=0;i<n;i++) 
			prime[i] = true; 
		
		for(int p = 2; p*p <=n; p++) 
		{ 
			// If prime[p] is not changed, then it is a prime 
			if(prime[p] == true) 
			{ 
				// Update all multiples of p 
				for(int i = p*p; i <= n; i += p) 
					prime[i] = false; 
			} 
		} 
		
		// Print all prime numbers 
		for(int i = 2; i <= n; i++) 
		{ 
			if(prime[i] == true) 
				System.out.print(i + " "); 
		} 
	} 
	
	public static void main(String args[]) 
	{ 
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		System.out.println("Following are the prime numbers less than equal to "+n); 
		SieveOfEratosthenes g = new SieveOfEratosthenes(); 
		g.sieveOfEratosthenes(n); 
	} 
} 