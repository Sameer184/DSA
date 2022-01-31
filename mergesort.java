import java.util.*;
import java.io.*;

public class Main
{
	public static void mergesort(int a[], int low, int high) {
        if(low<high) {
            int mid=(low+high)/2;
            mergesort(a,low,mid);
            mergesort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }
    public static void merge(int a[],int low, int mid, int high) {
        int p1=low;
        int p2=mid+1;
        int temp[]=new int[high-low+1];
        int k=0;
        while(p1<=mid && p2<=high) {
            if(a[p1]<a[p2])
                temp[k++]=a[p1++];
            else 
                temp[k++]=a[p2++];
        }
        while(p1<=mid) {
            temp[k++]=a[p1++];
        }
        while(p2<=high) {
            temp[k++]=a[p2++];
        }
        for(int i=low;i<=high;i++) {
            a[i]=temp[i-low];
            //System.out.print(a[i]+" ");
        }
    }
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
            mergesort(a,0,n-1);
            for(int i=0;i<n;i++) {
    		    System.out.print(a[i]+" ");
    	    }
            x++;
        }
    }
}
