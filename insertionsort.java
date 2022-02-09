import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=0;
        int t=sc.nextInt(); // test cases
        while(x<t) {
            int n=sc.nextInt(); // size of an array
            int a[]=new int[n];
    	    for(int i=0;i<n;i++) {
    		    a[i]=sc.nextInt();
    	    }
            for(int i=1;i<n;i++) {
                int index=a[i];
                int j=i;
                while(j>0 && a[j-1]>index) {
                    a[j]=a[j-1];
                    j=j-1;
                }
                a[j]=index;
            }
            for(int i=0;i<n;i++) {
    		    System.out.print(a[i]+" ");
    	    }
            x++;
        }
    }
}
