import java.util.*;
class binary_search
{
    public static void main(String args[])
    {
        Scanner pro = new Scanner(System.in);
        
        //Variables
        int ele,s,pos = -1;
        int beg,mid,end;
        
        //Taking input
        System.out.println("Enter the number of elements: ");
        ele = pro.nextInt();
        
        //Declaring array
        int a[] = new int[ele];
        
        //Taking values of array
        System.out.println("Enter the values of array: ");
        for(int i = 0;i<ele;i++)
        {
            a[i] = pro.nextInt();
        }
        
        //Taking the search element
        System.out.println("Enter the search element: ");
        s = pro.nextInt();
        
        //Binary search logic
        beg = 0;end = ele-1;
        while(beg<=end)
        {
            mid = (beg+end)/2;
            if(a[mid]==s)
            {
                pos = mid;
                break;
            }
            else if(a[mid]<s)
            {
                beg = mid+1;
            }
            else 
            {
                end = mid-1;
            }
        }
        
        //Final result
        if(pos == -1)
        {
            System.out.println(s+" not found:(");
        }
        else
        {
            System.out.println(s+" found at position "+pos);
        }
    }

}
