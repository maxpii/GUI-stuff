import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
public class LearningLabels {
    public static void main(String[] args) {
        // learning labels today! Basically how to put text on the frame
        // start with my usual frame commands + adding an image icon and border for later use
        ImageIcon image = new ImageIcon("C:\\Users\\Muhammad\\Documents\\java\\GUIs\\src\\logo.jpg");
        JFrame frame = new JFrame("Labels");
        //frame.setTitle("Labels!");
        frame.setVisible(true);
        //frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);
        Border border = BorderFactory.createLineBorder(Color.RED); // making a new border

        JLabel label = new JLabel(); // create label
        label.setText("Look! A spider!"); // set the text (could have also done it while instantiating the label)
        label.setIcon(image); // adding our image icon
        label.setHorizontalTextPosition(JLabel.CENTER); // text will be center of image icon
        label.setVerticalTextPosition(JLabel.TOP); // text will above of image icon
        label.setForeground(Color.RED); // changing color of text
        label.setFont(new Font("MV Boli",Font.BOLD,25)); // changing font style and size
        label.setIconTextGap(25); // sets distance between icon and image
        label.setBackground(Color.BLACK); // sets background color of text
        label.setOpaque(true); // need this to display background color, but changes everything to black
        label.setBorder(border); // setting a border to our label(but the whole frame because everything is our label)
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon and text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon and text within label

        //frame.setLayout(null); // now label won't take up so much stuff
        label.setBounds(100,100,250,250); // how much stuff the label will take up
        frame.add(label); // add our label to the frame
        frame.pack(); //useful method for sizing the frame to include all our components, now we don't need a size and layout manager
        // note: add all componenets before packing
    }
}
