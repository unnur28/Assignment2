package pakki;
 
import java.util.Scanner;
 
public class Lexer {
   
    public void nextToken()
    {
        /*
         * Scan the standard input
         * Look for patterns which match one of the tokens in Token.java
         */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        sc.close();
    }
   
    public void main(String[] args)
    {
        nextToken();
    }
 
}