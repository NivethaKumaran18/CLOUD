import java.util.*;
public class stringg{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int i=0,t;
		t=scan.nextInt();
		while(t>0){
		String s=scan.next();
		String str[]=s.split("\\.");
		for(i=str.length-1;i>=0;i--){
		    if(i==0)
			System.out.print(str[i]);
		    else
			System.out.print(str[i]+".");
		
		}
		System.out.println();
		t--;
		}
	}
}
