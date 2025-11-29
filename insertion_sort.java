import java.util.*;
class insertion_sort
{
    public static void main(String args[])
    {
        Scanner pro = new Scanner(System.in);
        
        //Variables
        int n;
        
        System.out.print("Enter the nummber of elements in the array: ");
        n = pro.nextInt();
        int arr[] = new int[n];
        
        System.out.print("Enter the values of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = pro.nextInt();
        }
        
        //Insertion sort logic
        for (int i = 1; i < n; i++) 
        {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }

        System.out.println("Sorted array:");
        
        //Displaying sorted array
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
}
