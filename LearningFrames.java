import javax.swing.*;
import java.awt.*;

public class LearningFrames {
    public static void main(String[] args) {
        // JFrame = a GUI window to add components to
        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("JFrame title goes here"); // sets the title of our frame
        frame.setResizable(false); // prevent from being resized
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exits out of application (can be set to stuff as well)
        frame.setSize(420,420); // sets the x-dimension and the y-dimension of the frame
        frame.setVisible(true); // makes frame visible
        ImageIcon image = new ImageIcon("C:\\Users\\Muhammad\\Documents\\java\\GUIs\\src\\logo.jpg"); // create an image icon
        frame.setIconImage(image.getImage()); // change icon of frame
        //frame.setBackground(Color.BLACK); does not work
        frame.getContentPane().setBackground(new Color(14, 232, 154));
    }
}