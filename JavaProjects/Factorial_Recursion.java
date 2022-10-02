
/**
 * Write a description of class rekursion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Factorial_Recursion
{
    public static void main(String[] args){
        int n = 5;
        System.out.println(fact(n));
    }
    
    static int fact(int x){
        if(x == 1)
        return 1;
        else
        return x * fact(x-1);
    }
}
