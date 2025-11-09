//Day 16
import java.util.*;
class matrix_add
{
    public static void main(String args[])
    {
        Scanner pro = new Scanner(System.in);
        
        //Variables
        int row,col;
        
        //Taking input
        System.out.print("Enter the order for the matrices to be added: ");
        row = pro.nextInt();
        col = pro.nextInt();
        int a[][] = new int[row][col];
        int b[][] = new int[row][col];
        int sum[][] = new int[row][col];
        
        System.out.println("Enter the values of first array: ");
        for(int i = 0; i < row;i++)
        {
            for(int j = 0; j < col; j++)
            {
                a[i][j] = pro.nextInt();
            }
            System.out.println();
        }
        
        System.out.println("Enter the values of second array: ");
        for(int i = 0; i < row;i++)
        {
            for(int j = 0; j < col; j++)
            {
                b[i][j] = pro.nextInt();
            }
            System.out.println();
        }
        
        //Addition of matrices
        for(int i = 0; i < row;i++)
        {
            for(int j = 0; j < col; j++)
            {
                sum[i][j] = a[i][j]+b[i][j];
            }
        }
        
        System.out.println();
        System.out.println("Now the sum of the two matrices is: ");
        for(int i = 0; i < row;i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.print(sum[j][i] + " ");
            }
            System.out.println();
        }
    }
}
