#include<bits/stdc++.h>
using namespace std;

int power(int x, int y)
{
	int res = 1;     // Initialize result 
   
    while (y > 0) 
    { 
        // If y is odd, multiply x with result 
        if (y & 1) 
            res = res*x; 
   
        // y must be even now 
        y = y>>1; // y = y/2 
        x = x*x;  // Change x to x^2 
    } 
    return res; 
}


int main()
{
	int x = 2, y = 10;
	
	cout<<power(x, y);
  
  return 0;
}
