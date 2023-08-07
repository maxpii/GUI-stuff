import javax.swing.*;
import java.awt.*;
public class LearningBorderLayouts {
    // Layout Manager: Defines the natural layout for components within a container(frame or panel)
    // 3 common managers
    // 1. BorderLayout
    // A layout that places components in 5 areas: North, South, East, West, Center
    // All extra space is placed in the center area

    public static void main(String[] args) {
        // normal frame stuff
        JFrame frame = new JFrame("My Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout(10,10)); // setting a border layout (default layout). Parameters set margin

        //creating 5 panels to demonstrate borderlayout

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        // setting colors
        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.GREEN);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.MAGENTA);
        panel5.setBackground(Color.BLUE);

        // setting the default size of everything (extra space will be taken by the center after resizing)
        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));


        frame.add(panel1,BorderLayout.NORTH); // adds the panel to the "North" of our container(the JFrame)
        frame.add(panel2,BorderLayout.WEST); // adds the panel to the "West" of our container(the JFrame)
        frame.add(panel3,BorderLayout.EAST); // adds the panel to the "East" of our container(the JFrame)
        frame.add(panel4,BorderLayout.SOUTH); // adds the panel to the "South" of our container(the JFrame)
        frame.add(panel5,BorderLayout.CENTER); // adds the panel to the "Center" of our container(the JFrame)


    }
}
