import java.util.*;
class selection_sort
{
    public static void main(String args[])
    {
        Scanner pro = new Scanner(System.in);
        
        //Variables
        int ele,temp;
        boolean sorted;
        
        System.out.print("Enter the number of elements in the array: ");
        ele = pro.nextInt();
        int a[] = new int[ele];
        
        //Taking input of variables
        System.out.println("Enter the values of array: ");
        for(int i = 0;i<ele;i++)
        {
            a[i] = pro.nextInt();
        }
        
        //Selection sorting
        for(int i = 0;i<ele-1;i++)
        {
            sorted = false;
            for(int j = 1;j<=ele-1-i;j++)
            {
                if(a[j]<a[j-1])
                {
                    //swap
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                    sorted = true;
                }
            }
            if(!sorted){
                break;
            }
        }
        
        //Printing sorted array
        System.out.println("Sorted array: ");
        for(int i = 0;i<ele;i++)
        {
            System.out.print(a[i]+"  ");
        }
    }

}
