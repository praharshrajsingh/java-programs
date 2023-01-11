import java.util.*;
/**
 * Write a description of class Summenparser here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Summenparser
{
    public void main(){
        Scanner sc = new Scanner(System.in);
        Summenparser sp = new Summenparser();
        System.out.println("Enter the equation:");
        String s = sc.next();        
        boolean isPlus = sp.checkTerm(s.toCharArray());
        System.out.println("Is + present?");
        System.out.println(isPlus);
    }
    
    public boolean checkTerm(char[] art){
        boolean isFound = false;
        int two = 0;
        String no1 = "";
        String no2;
        String equation = new String(art);
        for(int i = 0; i < art.length; i++){
            if(art[i] == '+'){
                isFound = true;
            }
        }
        return isFound;
    }
}
