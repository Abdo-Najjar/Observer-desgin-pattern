package ObserverWithStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Student {
    List<Observer> observers = new ArrayList<>();
    private int grade;

    public Student() {
       new StudentObserver(this);
    }

    public Student(int g) {
        grade = g;
        new StudentObserver(this);
    }
    
    public void addObserver(Observer o){
        observers.add(o);
    }
    
    public void setGrade(int grade){
        this.grade = grade;
        notifyAllObservers();
    }
    public int getGrade(){
        return this.grade;
    }
    
    private void notifyAllObservers(){
       observers.forEach((Observer s) -> {
           s.update();
       });
    }
    
}
