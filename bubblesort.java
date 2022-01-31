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
            for(int i=0;i<n-1;i++) {
                for(int j=0;j<n-i-1;j++) {
                    if(a[j]>a[j+1]) {
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }
            for(int i=0;i<n;i++) {
    		    System.out.print(a[i]+" ");
    	    }
            x++;
        }
    }
}
