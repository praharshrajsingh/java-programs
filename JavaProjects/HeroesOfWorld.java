import java.util.*;
/**
 * Write a description of class HeroesOfWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HeroesOfWorld
{
    public class Hero{
        int id;
        int maxhp;
        int hp;
        int stamina;
        int attack;
        int defense;
        public Hero(int id, int maxhp, int hp, int stamina, int attack, int defense){
            this.id = id;
            this.maxhp = maxhp;
            this.hp = hp;
            this.stamina = stamina;
            this.attack = attack;
            this.defense = defense;
        }
        
        public ArrayList getAllValues(){
            return new ArrayList(Arrays.asList(id, maxhp, hp, stamina, attack, defense));
        }
        
        public int getHp(){
            return hp;
        }
        
        public int getId(){
            return id;
        }
    }
    
    void AddHeroesOnTheBench(ArrayList<Hero> heroes, List<Hero> heroestoadd){
        for(Hero h:heroestoadd){
            heroes.add(h);
        }
    }
    
    void ShowAllHeroes(ArrayList<Hero> heroes){
        for(Hero h:heroes){
            System.out.println(h.getAllValues());
        }
    }
    
    void SortHeroesHP(ArrayList<Hero> heroes){
        for(int i = 0; i<heroes.size(); i++){
            for(int j = 0; j<heroes.size()-1; j++){
                if(heroes.get(j).getHp() > heroes.get(j+1).getHp()){
                    Collections.swap(heroes, j, j+1);
                }
            }
        }
    }
    
    boolean IsHeroOnBench(ArrayList<Hero> heroes, Hero hero){
        boolean found = false;
        for(Hero h: heroes){
            if(h.getId() == hero.getId()){
                found = true;
            }
        }
        return found;
    }
    
    public void main(String[]args){
        ArrayList<Hero> heroes = new ArrayList<Hero>();
        Hero spiderman = new Hero(1, 150, 100, 75, 86, 78);
        Hero batman = new Hero(2, 100, 150, 68, 70, 90);
        
        AddHeroesOnTheBench(heroes, List.of(batman, spiderman));
        
        System.out.println("All Heroes on the Bench:");
        ShowAllHeroes(heroes);
        
        System.out.println("Sorting heroes with respect to HP:");
        SortHeroesHP(heroes);
        ShowAllHeroes(heroes);
        
        System.out.println("Checking if hero is on bench:");
        System.out.println(IsHeroOnBench(heroes, spiderman));
    }
}
