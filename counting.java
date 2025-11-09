//Day 15
import java.util.*;
class counting
{
    public static void main(String args[])
    {
        Scanner pro = new Scanner(System.in);
        
        //Variables
        String str;
        char ch;
        int vowels = 0,consonants = 0,digits = 0,special = 0;
        
        //Taking the input
        System.out.print("Enter the string: ");
        str = pro.nextLine();
        str = str.toLowerCase();
        for(int i = 0;i<str.length();i++)
        {
            ch = str.charAt(i);
            
            if(ch>='a' && ch <='z')
            {
                if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' )
                {
                    vowels++;
                }
                else
                {
                    consonants++;
                }
            }
            else if(ch>='1' && ch<='9')
            {
                digits++;
            }
            else
            {
                special++;
            }
        }
        
        System.out.println("Number of vowels= " + vowels);
        System.out.println("Number of consonants= " + consonants);
        System.out.println("Number of digits= " + digits);
        System.out.println("Number of special characters= " + special);
    }
}
