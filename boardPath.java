
package Dyanamic_programming;
import java.util.*;
public class boardPath {
   public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
callme(0,n,m);
System.out.print("\n"+c);
    }
	static ArrayList<Integer> a=new ArrayList<>();
	static int c=0;
	public static void callme(int sum,int k,int m){

if(sum==k){
	c++;
	for(int i=0;i<a.size();i++){
System.out.print(a.get(i));
}
System.out.print(" ");
	a.remove(a.size()-1);
return;}
if(sum>k){
a.remove(a.size()-1);	
return ;}
for(int i=1;i<=m;i++){
a.add(i);
callme(sum+i,k,m);
}
if(a.size()>0)
a.remove(a.size()-1);
return ;
        }
    
}
