import java.util.*;
public class Main
{
    public static void main(String argc[])
    {
        int A[] = {1,2,3,4,5,6,7};
        System.out.println("day so ban dau la: " + Arrays.toString(A));
        int key = 6;
        System.out.println("\nkhoa can tim kiem la: " + key);
        int first = 0;
        int last=A.length-1;
        int mid=(first+last)/2;
        while(first<=last)
        {
            if(A[mid]<=key)
            {
                first = mid + 1;
            }
            else if (A[mid] == key)
            {
                System.out.println("Phan tu da dc tim thay: " + key);
                break;
            }
            else
            {
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if(first > last)
        {
            System.out.println("khong tim thay phan tu nay!");
        }
    }
}
