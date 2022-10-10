
/**
 * Write a description of class rekursion1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sum_Recursion
{
    public static void main(String[] args){
        int n = 3;
        System.out.println(sum(n));
    }
    
    static int sum(int x){
        if(x==0)
        return 0;
        else
        return x + sum(x-1);
        
        //first iteration: 3+ sum(2)
        //second iteration 2+ sum(1)
        //third iteration 1+ sum(0) = 1 + 0 = 1
        //---------go back up--------------
        //third iteration value = 1 + 0 = 1
        //second iteration value = 2 + 1 = 3
        //first iteration value = 3 + 3 = 6
    }
}
