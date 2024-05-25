import javax.swing.*;
import java.awt.event.*;

class Area extends JFrame implements ActionListener {
    JButton clear, circle, rectangle, triangle;
    JTextField radius, length, breadth, len, bread, height, result;
    JLabel l, b, h, r, l1, b1, heading, res;

    Area() {
        super("Area  Application");
        this.clear = new JButton("CLEAR");
        this.circle = new JButton("CIRCLE");
        this.rectangle = new JButton("RECTANGLE");
        this.triangle = new JButton("TRIANGLE");

        this.l = new JLabel("LENGTH");
        this.b = new JLabel("BREADTH");
        this.h = new JLabel("HEIGHT");
        this.r = new JLabel("RADIUS");
        this.l1 = new JLabel("LENGTH-TRIANGLE");
        this.b1 = new JLabel("BREADTH-TRIANGLE");
        this.heading = new JLabel("Area Calculator");
        this.res = new JLabel("RESULT");

        this.radius = new JTextField(10);
        this.length = new JTextField(10);
        this.breadth = new JTextField(10);
        this.len = new JTextField(10);
        this.bread = new JTextField(10);
        this.height = new JTextField(10);
        this.result = new JTextField(10);

        this.add(this.clear);
        this.add(this.circle);
        this.add(this.rectangle);
        this.add(this.triangle);

        this.add(this.l);
        this.add(this.b);
        this.add(this.h);
        this.add(this.r);
        this.add(this.l1);
        this.add(this.b1);
        this.add(this.heading);
        this.add(this.res);

        this.add(this.radius);
        this.add(this.length);
        this.add(this.breadth);
        this.add(this.len);
        this.add(this.bread);
        this.add(this.height);
        this.add(this.result);
        this.setLayout(null);

        this.heading.setBounds(20, 10, 150, 20);
        this.l.setBounds(20, 30, 150, 20);
        this.length.setBounds(20, 50, 150, 20);
        this.b.setBounds(20, 70, 150, 20);
        this.breadth.setBounds(20, 90, 150, 20);
        this.r.setBounds(20, 110, 150, 20);
        this.radius.setBounds(20, 130, 150, 20);
        this.l1.setBounds(20, 150, 150, 20);
        this.len.setBounds(20, 170, 150, 20);
        this.b1.setBounds(20, 190, 150, 20);
        this.bread.setBounds(20, 210, 150, 20);
        this.h.setBounds(20, 230, 150, 20);
        this.height.setBounds(20, 250, 150, 20);
        this.res.setBounds(20, 270, 150, 20);
        this.result.setBounds(20, 290, 150, 20);

        this.clear.setBounds(200, 150, 150, 100);
        this.circle.setBounds(350, 150, 150, 100);
        this.rectangle.setBounds(500, 150, 150, 100);
        this.triangle.setBounds(650, 150, 150, 100);

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 300);

        this.clear.addActionListener(this);
        this.circle.addActionListener(this);
        this.rectangle.addActionListener(this);
        this.triangle.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        double len1, bread1, area1, h1, rad;
        int len2, bread2, area;
        try {
            if (source == this.circle) {
                rad = Double.parseDouble(this.radius.getText());
                area1 = 3.14 * rad * rad;
                this.result.setText(Double.toString(area1));
            } else if (source == this.rectangle) {
                len2 = Integer.parseInt(this.length.getText());
                bread2 = Integer.parseInt(this.breadth.getText());
                area = len2 * bread2;
                this.result.setText(Integer.toString(area));
            } else if (source == this.triangle) {
                bread1 = Double.parseDouble(this.bread.getText());
                h1 = Double.parseDouble(this.height.getText());
                area1 = 0.5 * bread1 * h1;
                this.result.setText(Double.toString(area1));
            } else if (source == this.clear) {
                this.radius.setText("");
                this.result.setText("");
                this.len.setText("");
                this.bread.setText("");
                this.length.setText("");
                this.breadth.setText("");
                this.height.setText("");
            }
        } catch (Exception e) {
            this.result.setText("Enter valid values");
        }
    }

    public static void main(String args[]) {
        Area a1 = new Area();
    }
}
