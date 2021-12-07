
package Dyanamic_programming;
import java.util.*;
public class climbing_stairs {
    public static void main (String args[]) {
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
int dp[]=new int[n+1];
Arrays.fill(dp,-1);
System.out.println(callme(n,dp));
    }
	public static int callme(int n,int dp[]){
if(n==0|| n==1)
    return 1;
if(n<0)
    return 0;
if(dp[n]!=-1)
  {
    return dp[n];
   }
int c1=callme(n-1,dp);
int c2=callme(n-2,dp);

return dp[n]=c1+c2;

	}
    
}
