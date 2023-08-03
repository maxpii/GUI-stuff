import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LearningButtons extends JFrame implements ActionListener {

    JButton button; // declaring it global so that our action listener can use it
    JLabel label; // a label
    public LearningButtons() {
        // we can use "this" because our class extends the JFrame class in our frame stuff

        // label
        label = new JLabel("Clicked");
        label.setBounds(150,250,150,250);
        label.setVisible(false);

        // defining our button
        button = new JButton();
        button.setBounds(100,100,250,100); // size and location of our button
        button.addActionListener(this); // adding an action listener to our button
        button.setText("I'm a button bro"); // putting text in our button
        button.setFocusable(false); // get rid of border around text
        button.setFont(new Font("Comic Sans",Font.BOLD, 25)); // setting font
        button.setForeground(Color.GREEN); // setting foreground color;
        button.setBackground(Color.BLACK); // setting background color
        button.setBorder(BorderFactory.createEtchedBorder()); // adding border
        //button.setEnabled(false); // disable our button

        // lambda expression: a shortcut
        // with this, we wouldn't have to implement the action listener interface or define the method at all
        // this is somewhat advanced
        //button.addActionListener(e -> System.out.println("Hello world!"));
        // usual frame stuff
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) { // is the action is pressing the button, print out something
            //System.out.println("You pressed me");
            label.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new LearningButtons();
    }
}
