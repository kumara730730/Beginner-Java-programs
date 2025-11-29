import java.util.*;
class reverse
{
    public static void main(String args[])
    {
        Scanner pro = new Scanner(System.in);
        
        //Variables
        String str;
        int length;
        
        //Taking input
        System.out.print("Enter the string to be reversed: ");
        str = pro.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();//Using String builder functions
        
        System.out.println("Reversed string: "+reversed);
    }

}
