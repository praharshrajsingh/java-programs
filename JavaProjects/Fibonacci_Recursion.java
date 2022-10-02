
/**
 * Write a description of class rekursion2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fibonacci_Recursion
{
    public static void main(String[]args){
        for(int i = 1; i<5; i++){
            System.out.println(fibonacci(0,1,i));
        }
    }
    
    static int fibonacci(int a, int b, int i){
        if(i == 1)
        return b;
        else
        return fibonacci(b, a+b, --i);
    }
}
