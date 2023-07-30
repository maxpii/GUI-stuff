import javax.swing.*;
import java.awt.*;

public class LearningFrames2 extends JFrame{
    // when we extend JFrame, we can use this instead
    public LearningFrames2() {
        // JFrame = a GUI window to add components to
        this.setTitle("JFrame title goes here"); // sets the title of our frame
        this.setResizable(false); // prevent from being resized
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits out of application (can be set to stuff as well)
        this.setSize(420,420); // sets the x-dimension and the y-dimension of the frame
        this.setVisible(true); // makes this visible
        ImageIcon image = new ImageIcon("C:\\Users\\Muhammad\\Documents\\java\\GUIs\\src\\logo.jpg"); // create an image icon
        this.setIconImage(image.getImage()); // change icon of frame
        //this.setBackground(Color.BLACK); does not work
        this.getContentPane().setBackground(new Color(14, 232, 154));
    }
}
