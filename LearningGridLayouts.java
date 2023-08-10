import javax.swing.*;
import java.awt.*;
public class LearningGridLayouts {
    public static void main(String[] args) {
        // GridLayout = places components in a grid of cells, great for things like tic-tac-toe


        // normal frame stuff
        JFrame frame = new JFrame("A frame");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,3,10,10)); // first number rows, second number columns
        // 3rd and 4th arguments are horizontal and vertical spacing respectively


        // adding buttons using a shortcut
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        //frame.add(new JButton("10")); adding new button will unbalance the  whole thing

        frame.setVisible(true);



    }
}
