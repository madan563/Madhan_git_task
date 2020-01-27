import java.io.*;
import java.util.*;
public class Solution
{
    public static void main(String...aaa)
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int a[]=new int[n+1];
        for(int i=0;i<n;i++)
        a[i]=ob.nextInt();
        int m=ob.nextInt();
        int b[]=new int[m+1];
        int d[]=new int[n+1];
        for(int i=0;i<m;i++)
        b[i]=ob.nextInt();
        int c[]=new int[n+1];
        int p=1;
        int v=0;
        for(int i=0;i<=m;i++)
        {
            a[n]=b[i];
            v=b[i];
            Arrays.sort(a);
            for(int j=0,k=n+1;j<n+1;j++,k--)
            d[j]=a[k];

        if(d[i]==d[i+1])
        {
            c[i]=p;
            c[i+1]=p;

        }
        else
        {
            p++;
            c[i+1]=p;
            
        }
        p++;
        c[m]=p;
        }
        for(int i=0;i<n;i++)
        {
            if(v==d[i])
        System.out.print(c[i]);
    }
    }
}