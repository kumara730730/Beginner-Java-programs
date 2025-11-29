import java.util.*;

class d2game 
{
    public static void main(String[] args) 
    {
        Scanner pro = new Scanner(System.in);
        Random king = new Random();

        int i,j,assign;
        String empty = "⬜";     // empty cell
        String player = "🏃";   // player symbol
        String monster = "👾";  // monster symbol
        //String block = "\u25A0 ";//block symbol
        String door = "\uD83D\uDEAA";
        String block = "X";
        
        String a[][] = new String[10][10];
        
        int playerx = 0, playery = 0;
        int monsterx = 5;
        int monstery = 5;
        
        for(i = 0;i<10;i++)
        {
            for(j = 0;j<10;j++)
            {
                assign = king.nextInt(1,6);
                if(assign == 2)
                    a[i][j] = block;
                else
                    a[i][j] = empty;
            }
        }
        a[0][0] = player;
        a[5][5] = monster;
        a[9][9] = door;
        
        while (true) 
        {
            // draw grid
            for (i = 0; i < 10; i++) 
            {
                for (j = 0; j < 10; j++) 
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }

            // check collision
            if (playerx == monsterx && playery == monstery) {
                System.out.println("💀 The monster caught you! Game Over!");
                break;
            }
            
            // move player
            System.out.print("\nMove (w/a/s/d): ");
            char move = pro.next().toLowerCase().charAt(0);
            if(move == '0')
            {
                break;
            }
            a[playerx][playery] = empty;
            a[monsterx][monstery] = empty;
            switch (move) 
            {
                case 'w': if (playerx > 0 && a[playerx-1][playery] != block ) playerx--; break;      // up
                
                case 's': if (playerx < 10 - 1 && a[playerx+1][playery] != block) playerx++; break; // down
                
                case 'a': if (playery > 0 && a[playerx][playery-1] != block) playery--; break;      // left
                
                case 'd': if (playery < 10 - 1 && a[playerx][playery+1] != block) playery++; break; // right
                
                default: System.out.println("❌ Invalid move!");
            }
           

            //making monster move towards player
            if(monsterx < playerx && a[monsterx+1][monstery]!=block)
                monsterx++;
            else if(monsterx >playerx && a[monsterx-1][monstery]!=block)
                monsterx--;
            else if(monstery<playery && a[monsterx][monstery+1]!=block)
                monstery++;
            else if(monstery>playery && a[monsterx][monstery-1]!=block)
                monstery--;
            a[playerx][playery] = player;
            a[monsterx][monstery] = monster;
            System.out.println("\n-----------------------------\n");
            
            if (playerx == 9 && playery == 9) {
                System.out.println("Congratulations! You Won!");
                break;
            }
        }

        
    }

}
