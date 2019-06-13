
import javax.swing.JFrame;

public class MMFrame{
    public static void main(String[] args){
        JFrame frame = new JFrame("MMFrame");  //
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //
        frame.setSize(400, 400); //
        
        MMouse head = new MMouse();
        
        frame.add(head);
        
        frame.setVisible(true); //
    }
}

