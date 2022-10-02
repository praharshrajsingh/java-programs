
/**
 * Write a description of class rekursion1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sum_Recursion
{
    public static void main(String[] args){
        int n = 7;
        System.out.println(sum(n));
    }
    
    static int sum(int x){
        if(x==0)
        return 0;
        else
        return x + sum(x-1);
    }
}
