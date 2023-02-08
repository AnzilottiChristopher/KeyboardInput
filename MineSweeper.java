
//Chris Anzilotti
//MineSweeper

import java.util.Scanner;


public class MineSweeper {
    
    public static void main(String[]args)
    {
        //Creating Arrays
        char[][] minefield;
        
        
        //Getting Width length and amount of mines
        Scanner scan = new Scanner(System.in);

            System.out.println("Enter the Width of the minefield");
            int width = scan.nextInt();
            System.out.println("Enter the length of the minefield");
            int height = scan.nextInt();
            System.out.println("Enter the number of mines");
            int num = scan.nextInt();
        

        minefield = new char[height + 2][width + 2];
        //Do/While to generate random locations for mines until a novel one is found
        int i = 0;
        while(i < num)
        {
            int row = 0;
            int col = 0;
            do
            {
                row = (int)(Math.random() * height + 1);
                col = (int)(Math.random() * width + 1);
            } while (minefield[row][col] == '*');
            minefield[row][col] = '*';
            i++;
        }

        //Start row/col at 1 because of buffer
        for(int row = 1; row < height + 1; row++)
        {
            for(int col = 1; col < width + 1; col++)
            {
                if(minefield[row][col] != '*')
                {
                    int n = 0;
                    for(int r = -1; r <= 1; r++)
                    {
                        for(int c = -1; c <= 1; c++)
                        {
                            n += (minefield[row + r][col + c] == '*') ? 1 : 0;
                        }
                    }
                    minefield[row][col] = (char)('0' + n);
                }

                System.out.print(minefield[row][col]);
                System.out.print((col == width) ? '\n' : ' ');
            }
        }
       scan.close();
    }
}
