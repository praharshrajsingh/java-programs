
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
        //1*2*3*4*5 
        System.out.println(fact(n));
    }
    
    static int fact(int x){
        if(x == 1)
        return 1;
        else
        return x * fact(x-1);
        
        //5 * fact(5-1)
        //4* fact(4-1)
        //3* fact(3-1)
        //2* fact(2-1) = 2*1 =2
        //-----------go up-------------
        
        /*
         * 2*1 = 2
         * 3*2 = 6
         * 4*6 = 24
         * 5*24 = 120
         */
    }
}
