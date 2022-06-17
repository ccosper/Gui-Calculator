import java.awt.*;
import javax.swing.*;


public class JavaGuiApplication {
    

public class JavaGUIApplication extends JFrame {
    

    private JPanel panel; 
    public JavaGUIApplication() { 
        super("Button Test"); /* Set Window Title */
        setSize(300, 200); /* Set Window Size */
        panel = new JPanel(); /* Create Panel */
        JButton yellow = new JButton("Yellow"); /* Create Buttons */
        JButton blue = new JButton("Blue");
        JButton red = new JButton("Red"); 
        panel.add(yellow); /* Add Buttons to Panel */
        panel.add(blue);
        panel.add(red); 
        add(panel); /* Add Panel to Window */       
    }
}
}