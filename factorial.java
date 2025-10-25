//Day 2

import java.util.*;
class factorial
{
    public static void main(String args[])
    {
        Scanner pro = new Scanner(System.in);
        
        //Variables
        int num;
        
        //Taking input
        do
        {
            System.out.print("Enter a number: ");
            num = pro.nextInt();
        }while(num<0);
        
        
        //Displaying the result
        System.out.println("Factorial = " + factorial(num));
    }
    
    //Method factorial 
    //Recursive function
    static long factorial(int i)
    {
        if(i <= 1)
            return 1;
        return factorial(i-1)*i;
    }
}