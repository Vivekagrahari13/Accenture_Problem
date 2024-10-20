package practice;

import java.util.*;
import java.lang.*;


public class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            String s=sc.next();

            int count=1;
            int k=1;


            for(int i=0;i<n-1;i++)
            {
                char ch=s.charAt(i);
                char c=s.charAt(i+1);
                if((ch==c)&&(i!=n-2))
                {
                    k++;
                    continue;
                }
                else{
                    k=0;
                }
                if(k==0)
                {
                    count++;
                }
                else{
                    int a=(k+1)/2;
                    count+=a;
                }

            }
            System.out.println(count);
        }

    }
}