//Day 3

import java.util.*;
class fibonacci
{
    public static void main(String args[])
    {
        Scanner pro = new Scanner(System.in);
        
        //Variables
        int num,num1,num2,next;
        
        //Taking input
        do
        {
            System.out.print("Enter the number of terms of fibonacci series you want: ");
            num = pro.nextInt();
        }while(num<0);
        
        //fibonacci series
        num1 = 0;
        num2 = 1;
        System.out.println("Fibonacci series: ");
        
        do
        {
            System.out.print(num1 + "    ");
            next = num1 + num2;
            num1 = num2;
            num2 = next;
            num--;
        }while(num>0);
    }
}