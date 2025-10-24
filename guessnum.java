import java.util.*;
class guessnum
{
    public static void main(String args[])
    {
        //Functions
        Scanner pro = new Scanner(System.in);
        Random king = new Random();
        
        //Variables
        int guess;
        int n = 0;
        int d1,d2,d3,d4;
        int c1,c2,c3,c4;
        char w1,w2,w3,w4;
        int c = king.nextInt(1000,9999);
        boolean not_guessed = true;
        
        c1 = c/1000;
        c2 = (c/100) - (c1*10);
        c3 = (c/10) - (c1*100) - (c2*10);
        c4 = c%10;
        
        //Intro
        System.out.println("You have to guess a number of 4 digits");
        System.out.println("\u2705 \u274c \u2705 \u274c");
        System.out.println("This means 1st and 3rd digit u have guessed is correct. \n \n");
        
        //LOOP
        while(not_guessed)
        {
            System.out.print("Your predicted value: ");
            guess = pro.nextInt();
            
            //digits
            d1 = guess/1000;
            d2 = (guess/100) - (d1*10);
            d3 = (guess/10) - (d1*100) - (d2*10);
            d4 = guess%10;
            
            if(guess == c || guess == 0)
            {
                not_guessed = false;
                System.out.println("Congratulations, You have guessed the number.");
                break; 
            }
            
            //print that these digits are correct
            if(d1==c1)
            {
                w1 = '\u2705';
            }
            else
            {
                w1 = '\u274c';
            }
            
            if(d2==c2)
            {
                w2 = '\u2705';
            }
            else
            {
                w2 = '\u274c';
            }
            
            if(d3==c3)
            {
                 w3 = '\u2705';  
            }
            else
            {
                w3 = '\u274c';
            }
            
            if(d4==c4)
            {
                w4 = '\u2705';
            }
            else
            {
                w4 = '\u274c';
            }
            System.out.println(w1+" "+w2+" "+w3+" "+w4);
            n++;
        }
        System.out.println("Number of tries: " + n);
        System.out.println("Thank you");
    }
}
