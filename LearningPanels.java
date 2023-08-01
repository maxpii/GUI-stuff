import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LearningPanels {
    public static void main(String[] args) {
        // JPanel is a GUI component that is a container to hold other components (like a frame)


        // start with normal frame stuff
        JFrame frame = new JFrame("Labels");
        frame.setVisible(true);
        frame.setLayout(null); // don't need a layout manager for this lesson
        frame.setSize(750,750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // making a label
        JLabel label = new JLabel("Hello!");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(100,100,75,75); // need this if we are not using a layout manager (all values are relative to the panel(container))

        // if are not using a layout manager, we also do not need a set vertical/horizontal alignment

        // making our first panel
        JPanel redPanel = new JPanel(); // instantiate a panel
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0, 250,250); // need to do this manually because we are not using a layout manager
        frame.add(redPanel); // adding our panel to the box
        redPanel.setLayout(null);
        //redPanel.add(label); // adding our label to the red panel
        // blue panel
        JPanel bluePanel = new JPanel(); // instantiate a panel
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250,0, 250,250); // need to do this manually because we are not using a layout manager
        frame.add(bluePanel); // adding our panel to the box
        bluePanel.setLayout(null);
        //bluePanel.add(label); // adding label to panel

        JPanel greenPanel = new JPanel(); // instantiate a panel
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,250, 500,250); // need to do this manually because we are not using a layout manager
        frame.add(greenPanel); // adding our panel to the box
        greenPanel.setLayout(null); // changing the layout
        greenPanel.add(label); // adding label to panel

    }
}
