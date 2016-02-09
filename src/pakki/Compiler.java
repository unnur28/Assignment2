package pakki;
 
import java.util.*;
 
public class Compiler {
   
    Stack<String> myStack = new Stack<String>();
   
    public int StringToInt(String x)
    {
        return Integer.parseInt(x);
    }
   
    public String IntToString(int x)
    {
        return String.valueOf(x);
    }
   
    public void Push(String op)
    {
        //Push op on to the stack
        myStack.push(op);
    }
   
    public void Add()
    {
        /*
         * Pop 2 top element from the stack
         * Add their values
         * Push their sum on to the stack
         */
        if(myStack.size() >= 2)
        {
            String x = myStack.pop();
            String y = myStack.pop();
           
            int sum = (StringToInt(x) + StringToInt(y));
            myStack.push(IntToString(sum));
        }
    }
   
    public void Sub()
    {
        /*
         * Pop 2 top element from the stack
         * Subtract the first value from the second value
         * Push their difference on to the stack
         */
        if(myStack.size() >= 2)
        {
            String x = myStack.pop();
            String y = myStack.pop();
           
            int sum = (StringToInt(x) - StringToInt(y));
            myStack.push(IntToString(sum));
        }
    }
   
    public void Mult()
    {
        /*
         * Pop 2 top element from the stack
         * Multiply the two numbers together
         * Push the result of the multiplication on to the stack
         */
        if(myStack.size() >= 2)
        {
            String x = myStack.pop();
            String y = myStack.pop();
           
            int sum = (StringToInt(x) * StringToInt(y));
            myStack.push(IntToString(sum));
        }
    }
   
    public void Assign()
    {
        /*
         * Pops 2 top elements from the stack
         * Assigns the first element (a value) to the second element (a variable)
         */
    }
   
    public void Print()
    {
        //Peak at the top of the stack and print the top value.
        System.out.println(myStack.peek());
    }
}