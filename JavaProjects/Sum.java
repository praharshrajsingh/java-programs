
/**
 * Write a description of class Sum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sum
{
    
    public void main(){
        int n = 5;
        System.out.println(sum(n));
    }
    
    int sum(int n){
        if(n==0)
        return 0;
        else
        return n + sum(n-1);
    }
}