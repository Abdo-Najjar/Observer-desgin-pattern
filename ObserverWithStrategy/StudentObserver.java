package ObserverWithStrategy;

/**
 *
 * @author user
 */
public class StudentObserver extends Observer{
    
    public StudentObserver(Student s) {
        this.s = s;
        s.addObserver(this);
    }

        
    
    @Override
    public void update() {
        System.out.println("Grade"+s.getGrade());
    }
    
}
