package Observer;

/**
 *
 * @author user
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Student s) {
        this.s = s;
        s.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary: "+Integer.toBinaryString(s.getGrade()));
    }
    
}
