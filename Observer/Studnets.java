/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author userS
 */
class Student {

    private List<Observer> observers = new ArrayList<>();
    private int grade;

    public void setGrade(int grade) {
        this.grade = grade;
        notifyAllObservers();
    }

    public int getGrade() {
        return this.grade;
    }
    
    public void attach(Observer observer){
        observers.add(observer);
    }
    
    public void notifyAllObservers(){
        observers.forEach((Observer obs) -> {
            obs.update();
        });
    }
}

