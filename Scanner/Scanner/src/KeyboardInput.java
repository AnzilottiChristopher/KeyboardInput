/*
 * Scanner Notes
 */


import java.util.Scanner;
import java.util.StringTokenizer;
public class KeyboardInput 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int x = scan.nextInt();
        //nextDouble
        //next()

        System.out.println("Enter a sentence: ");
        String s = scan.nextLine();
        s = scan.nextLine(); //Needs the second .nextLine because it will read the previous line for some reason

        System.out.println(x);
        System.out.println(s);


        //String string = "this is a book";
        StringTokenizer string = new StringTokenizer("This is a book");
        while(string.hasMoreTokens())
        {
            System.out.println(string.nextToken());
        }
        scan.close();
    }
}
