/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author user
 */
public class OctalObserver extends Observer{

    public OctalObserver(Student s) {
       this.s = s;
       s.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal: "+Integer.toOctalString(s.getGrade()));
    }
    
}
