import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LearningKeyListeners extends JFrame implements KeyListener{

    JLabel label; // creating label
    public LearningKeyListeners() {
        // key listeners are a way that our program can listen to our keyboard

        // normal frame stuff
        this.setTitle("Hello");
        this.setSize(500,500);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(this);

        // making our label
        label  = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.RED);
        label.setOpaque(true); // need this for background color to display
        //label.setFont(new Font("Arial",Font.BOLD,30));


        // adding label to the frame and setting the frame visible
        this.add(label);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new LearningKeyListeners();

    }


    public void keyTyped(KeyEvent e) {
        // invoked when a key is typed

        // writing a switch statement that changes the position of the label everytime a key is pressed
        switch(e.getKeyChar()) {
            case 'a': label.setLocation(label.getX()-10, label.getY()); break;
            case 'w': label.setLocation(label.getX(), label.getY() - 10); break;
            case 's': label.setLocation(label.getX(), label.getY() + 10); break;
            case 'd': label.setLocation(label.getX() + 10, label.getY()); break;

        }

    }
    public void keyPressed(KeyEvent e) {
        // invoked when a key is pressed down
        switch(e.getKeyCode()) { // using arrow keys
            case 37: label.setLocation(label.getX()-10, label.getY()); break;
            case 38: label.setLocation(label.getX(), label.getY() - 10); break;
            case 39: label.setLocation(label.getX()+10, label.getY()); break;
            case 40: label.setLocation(label.getX(), label.getY()+10); break;
        }
    }
    public void keyReleased(KeyEvent e) {
    // invoked when a button is released
        // note: keycode does not change with shift. Shift has its own keycode
        //System.out.println("You released the key character " + e.getKeyChar()); // will print the key we pressed
        //System.out.println("You released the key code " + e.getKeyCode()); // will get the code of the key we released


    }




}
