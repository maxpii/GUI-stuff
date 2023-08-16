import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LearningMouseListener extends JFrame implements MouseListener{
    JLabel label; // creating this global so we can use this anywhere
    public LearningMouseListener() {

        // normal frame stuff
        this.setTitle("Learning Mouse Listeners!");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);


        // label stuff
        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.RED);
        label.setOpaque(true); // need this for color to show
        label.addMouseListener(this); // can pass in this because we are implementing mouse listener interface

        this.add(label);
        this.setVisible(true);

    }

    // creating mouse methods
    public void mouseClicked(MouseEvent e) {
        // invoked when a mouse button is pressed and released on a component
        //System.out.println("You clicked the mouse"); // works when we click IN the specified component
    }

    public void mousePressed(MouseEvent e) {
        // invoked when a mouse button is pressed on a componenet
        System.out.println("You pressed the mouse");
        label.setBackground(Color.YELLOW); // changing the color when we press the mouse
    }

    public void mouseReleased(MouseEvent e) {
        // invoked when a mouse button has been released on a componenet
        System.out.println("You released the mouse");
        label.setBackground(Color.GREEN);
    }

    public void mouseEntered(MouseEvent e) {
        // invoked when a mouse enters a component area
        System.out.println("You entered my label");
        label.setBackground(Color.BLUE);
    }

    public void mouseExited(MouseEvent e) {
        // invoked when mouse exits the area of a component
        System.out.println("You exited my label");
        label.setBackground(Color.RED);
    }

    public static void main(String[] args) {
        new LearningMouseListener();
    }
}
