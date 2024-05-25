import java.awt.event.*;
import java.awt.*;

class Perfect extends Frame implements ActionListener {

    Button result;
    Label number, r, heading;
    TextField num, res;

    Perfect() {
        super("PERFECT NUMBER");

        this.result = new Button("RESULT");

        this.number = new Label("NUMBER");
        this.r = new Label("RESULT");
        this.heading = new Label("PERFECT NUMBER CALCULATOR");

        this.num = new TextField(10);
        this.res = new TextField(10);

        this.add(this.result);
        this.add(this.number);
        this.add(this.r);
        this.add(this.heading);
        this.add(this.num);
        this.add(this.res);
        this.setLayout(null);

        this.heading.setBounds(20, 50, 250, 20);
        this.number.setBounds(20, 70, 150, 20);
        this.num.setBounds(20, 90, 150, 20);
        this.r.setBounds(20, 110, 150, 20);
        this.res.setBounds(20, 130, 150, 20);

        this.result.setBounds(200, 90, 150, 30);

        this.setVisible(true);
        this.setBackground(java.awt.Color.RED);
        this.setSize(500, 300);

        this.result.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        int n, temp, sum = 0, sum1 = 0, r, i;
        n = Integer.parseInt(this.num.getText());
        temp = n;
        for (i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == temp) {
            this.res.setText(Integer.toString(temp) + " is a perfect number");
        } else {
            while (n > 0) {
                r = n % 10;
                sum1 = sum1 + r;
                n = n / 10;
            }
            this.res.setText(Integer.toString(sum1));
        }

    }

    public static void main(String args[]) {
        Perfect p1 = new Perfect();
    }
}
