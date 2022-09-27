import java.util.*;
/**
 * Write a description of class JavaTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JavaTest
{
    public class Student{
        int id;
        int marks;
        String name;
        char division;
        public Student(int id, String name, char division, int marks){
            this.id = id;
            this.name = name;
            this.division = division;
            this.marks = marks;
        }
        
        public ArrayList getAllValues(){
            ArrayList<Object> lst = new ArrayList<>();
            lst.add(id);
            lst.add(marks);
            lst.add(name);
            lst.add(division);
            return lst;
        }
        
        public int getMarks(){
            return marks;
        }
        
        public String getName(){
            return name;
        }
        
        public char getDivision(){
            return division;
        }
        
        public int getId(){
            return id;
        }
    }
    
    public void main(String[]args){
        
        Student std1 = new Student(1, "praharsh", 'B', 95);
        
        Student std2 = new Student(2, "harsh", 'C', 94);
        
        ArrayList<Student> students = new ArrayList<Student>();
        
        students.add(std1);
        students.add(std2);
        
        for(Student st:students){
            System.out.println(st.getAllValues());
        }
        
        for(int i = 0; i < students.size(); i++){
            for(int j = 0; j<students.size()-1; j++){
                if(students.get(j).getMarks() > students.get(j+1).getMarks()){
                    Collections.swap(students, j, j+1);
                }
            }
        }
        System.out.println("The list is:");
        for(Student st:students){
            System.out.println(st.getAllValues());
        }
        
    }
}
