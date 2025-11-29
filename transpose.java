import java.util.*;
class transpose
{
    public static void main(String args[])
    {
        Scanner pro = new Scanner(System.in);
        
        //Variables
        int row,col;
        
        //Taking input
        System.out.print("Enter the order of matrix: ");
        row = pro.nextInt();
        col = pro.nextInt();
        int a[][] = new int[row][col];
        
        System.out.println("Enter the values of the array: ");
        for(int i = 0; i < row;i++)
        {
            for(int j = 0; j < col; j++)
            {
                a[i][j] = pro.nextInt();
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Now the transpose of the given matrix is: ");
        for(int i = 0; i < row;i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }

}
