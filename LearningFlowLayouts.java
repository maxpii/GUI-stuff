import java.awt.*;
import javax.swing.*;
public class LearningFlowLayouts {
    public static void main(String[] args) {
        // FlowLayout: A layout that places components into rows. If the horizontal space in a container is small,
        //             the FlowLayout classes uses the next available row

        // regular frame stuff
        JFrame frame = new JFrame("Flow Layout!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 0,0)); // leading makes elements move to left, the default is CENTER
        // trailing is the opposite of leading
        // the numbers are the amount of spacing

        // making panel
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,250)); // decreasing the size will make the rows smaller and add more rows
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new FlowLayout()); // default layout for panels

        // adding buttons
        JButton button1 = new JButton();
        // shortcut for adding buttons
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));







        frame.add(panel);
        frame.setVisible(true);
    }
}
