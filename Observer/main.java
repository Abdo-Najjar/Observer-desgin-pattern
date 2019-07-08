package Observer;

/**
 *
 * @author user
 */
public class main {
    public static void main(String[] args) {
       Student s = new Student();
       new OctalObserver(s);
       new BinaryObserver(s);
       s.setGrade(23);
       s.setGrade(10);
    }
}
