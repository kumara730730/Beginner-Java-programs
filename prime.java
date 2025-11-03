//Day 6

import java.util.*;
class prime
{
    public static void main(String args[])
    {
        Scanner pro = new Scanner(System.in);
        
        //Variables
        int num,i;
        boolean prime = true;
        
        //Taking input
        do
        {
            System.out.print("Enter the number: ");
            num = pro.nextInt();
        }while(num<1);
        
        
        i = num-1;
        while(i>1)
        {
            if(num%i==0)//Checking, if remainder is zero then num is divisible
            {
                prime = false;
                break;
            }
            i--;
        }
        if(num==1)
        {
            System.out.println("1 is neither prime nor composite number.");
        }
        else if(prime)
        {
            System.out.println(num + " is a Prime number.");
        }
        else
        {
            System.out.println(num + " is not a Prime number.");
        }
    }
}