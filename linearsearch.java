import java.util.*;
class linear_search
{
    public static void main(String args[])
    {
        Scanner pro = new Scanner(System.in);
        
        //Variables
        int ele,pos = -1,s;
        
        System.out.println("Enter the number of elements in the array: ");
        ele = pro.nextInt();
        
        //Declaring array
        int a[] = new int[ele];
        
        //Input of values of array
        System.out.println("Enter the values of array: ");
        for(int i = 0;i<ele;i++)
        {
            a[i] = pro.nextInt();
        }
        
        //Asking for the search value
        System.out.println("Enter the value to be searched: ");
        s = pro.nextInt();
        
        //Searching
        for(int i = 0;i<ele;i++)
        {
            if(a[i] == s)
            {
                pos = i;
                break;
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
