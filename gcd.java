import java.util.*;
public class GCD{
	public static int gcd(int a ,int b){
		if(a==0)
		  return b;
		if(b==0)
		  return a;
		if(a==b)
		  return a;
		if(a>b)
		  return gcd(a-b, b);
	        return gcd(a, b-a);
}
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int res;
int m=scan.nextInt();
int n=scan.nextInt();
res=gcd(m,n);
System.out.println("GCD of " + m + " and " + n + " is " + res);
}
}