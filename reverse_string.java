//Day 4

import java.util.*;
class reverse_string
{
    public static void main(String args[])
    {
        Scanner pro = new Scanner(System.in);
        
        //Variables
        String str,reversed = "";
        int length;
        
        //Taking input
        System.out.print("Enter the string to be reversed: ");
        str = pro.nextLine();
        
        for(int i = (str.length()-1); i>=0; i--)//Using logic
        {
            reversed += str.charAt(i); //str.charAt(i) = the character at 'i' position in the string str 
        }
        System.out.println("Reversed string: "+reversed);
    }
}