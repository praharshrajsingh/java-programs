
/**
 * Write a description of class SumRecursion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumRecursion
{
    
    public void main(){
        int n = 5;
        System.out.println(sum(n));
    }
    
    int sum(int n){
        if(n==1)
        return 1;
        else
        return n * sum(n-1);
    }
}