import java.util.*;
class second_largest_smallest
{
    public static void main(String args[])
    {
        Scanner pro = new Scanner(System.in);
        
        //Variables
        int n,large,sl,sm,small;
        
        System.out.print("Enter the number of values: ");
        n = pro.nextInt();
        int a[] = new int[n];
        
        System.out.print("Enter the values of the array: ");
        for(int i = 0;i<n;i++)
        {
            a[i] = pro.nextInt();
        }
        
        large = a[(n-1)/2];
        sl = a[0];
        small = a[(n-1)/2];
        sm = a[0];
        for(int i = 0;i<n;i++)
        {
            if(a[i]>large)
            {
                sl = large;
                large = a[i];
            }
            if(a[i]<small)
            {
                sm = small;
                small = a[i];
            }
        }
        
        //Final result
        System.out.println("Largest value = "+large);
        System.out.println("Smallest value = "+small); 
        System.out.println("Second Largest value = "+sl);
        System.out.println("Second Smallest value = "+sm); 
        
    }
}
