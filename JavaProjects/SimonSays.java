import java.util.*;
/**
 * Write a description of class SimonSays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimonSays
{
    public Queue<String> CreatePattern(){
        //Create pattern
        //Start
        Random random = new Random();
        Queue<String> q = new PriorityQueue<String>();
        String[] colours = {"R", "B", "Y", "G"};
        for(int i = 0; i<=20; i++){
            q.add(colours[random.nextInt(4)]);
        }
        return q;
    }
    
    public String GetColour(){
        //Input colour
        //Middle?
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        return str;
    }
    
    public void EndProgram(){
        //End program
        System.out.println("RIP bozo get rekt bodied L + Ratio + you fell off");
    }
    
    /*public static void main(String[]args){
        SimonSays s = new SimonSays();
        //s.EndProgram();
        //Queue<String> pattern = s.CreatePattern();
        //System.out.println(pattern);
        String str = s.GetColour();
        System.out.println(str);
    }*/
}
