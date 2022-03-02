import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        int [] A = new int [] {1,3,14,19,7,5,10,8};
        int temp = 0;
        System.out.println("day so trc khi sap xep: ");
        for(int i=0; i<A.length; i++)
        {
            System.out.print(A[i] + " ");
        }
        for(int i = 0; i<A.length; i++)
        {
            for(int j =i+1; j<A.length; j++)
            {
                if(A[i]>A[j])
                {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        System.out.println("\nday so sau khi sap xep: ");
        for (int i=0; i<A.length; i++)
        {
            System.out.print(A[i] + " ");
        }
    }
}
