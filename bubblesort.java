//Day 10
import java.util.*;
class BubbleSort 
{
    // Method to perform bubble sort
    public static void bubbleSort(int[] arr) 
    {
        int n = arr.length;
        boolean swapped;
        
        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) 
        {
            swapped = false;
            
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no elements were swapped, array is sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) 
    {
        Scanner pro = new Scanner(System.in);
        
        //Variables
        int ele;
        
        //Taking input of number of elements
        System.out.println("Enter the number of elements in the array: ");
        ele = pro.nextInt();
        int[] numbers = new int[ele];
        
        //Taking the values of the array
        System.out.println("Enter the values of elements: ");
        for(int i = 0; i<ele; i++)
        {
            numbers[i] = pro.nextInt();
        }
        
        bubbleSort(numbers);

        System.out.println("Sorted array:");
        for(int i = 0;i<ele;i++)
        {
            System.out.print(numbers[i]+ "  ");
        }
    }
}
