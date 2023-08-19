import javax.swing.*;
import java.awt.*;
public class Learning2DGraphics extends JPanel{

    // using the paint method to draw simple 2D graphics on the screen
    public Learning2DGraphics() {

        //normal frame stuff, as well as creating and adding a panel
        // drawing on panel fixes the issue of things not drawing properly
        JFrame frame = new JFrame("A Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500,500);
        this.setVisible(true);

        this.setPreferredSize(new Dimension(500,500));

        frame.add(this);

    }

    // this is where the magic happens, this method is called behind the scenes
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g; // since the Graphics class is outdated, we are converting it to Graphics2D
        g2.setStroke(new BasicStroke(5)); // changing the stroke width
        //g2.setColor(Color.BLUE); // changing the color
        //g2.drawLine(0,0,500,500); // draws line from top left to bottom right
        //g2.setColor(Color.PINK);
        //g2.drawRect(100,100,100,200); // drawing a rectangle
        //g2.fillRect(100,100,100,200); // drawing an opaque rectangle
        // note: Things drawn most recently will appear first

        //g2.setColor(Color.ORANGE);
        //g2.fillOval(0,0,100,100); drawing oval

        // drawing pokemon ball and setting gradient background
        GradientPaint gp = new GradientPaint(0,0,Color.BLACK,500,500,Color.ORANGE);
        g2.setPaint(gp);
        g2.fillRect(0,0,500,500); // adding a black rectangle for the background
        g2.setColor(Color.RED);
        g2.fillArc(0,0,100,100,0,180); // very complicated to draw an arc
        g2.setColor(Color.WHITE);
        g2.fillArc(0,0,100,100,180,180);


        int[] xPoints = {150,250,350};
        int[] yPoints = {300,150,300};
        g2.setColor(Color.YELLOW);
        g2.fillPolygon(xPoints,yPoints,3); // drawing triangle, have to pass in points as an array

        // drawing string
        g2.setColor(Color.RED);
        g2.setFont(new Font("Ink Free",Font.BOLD,20));
        g2.drawString("SIUUUU", 200, 250);
    }

    public static void main(String[] args) {
        new Learning2DGraphics();
    }
}
