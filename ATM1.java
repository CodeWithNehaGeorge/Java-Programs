import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

class ATM1 extends Frame implements ActionListener {
    Button w, d, t, c;
    Label ac1l, aml, ac2l, b1l, b2l;
    TextField ac1t, ac2t, amt, b1t, b2t;

    ATM1() {
        super("ATM");
        this.w = new Button("withdraw");
        this.d = new Button("deposit");
        this.t = new Button("transfer");
        this.c = new Button("check balance");
        this.ac1l = new Label("Account source ID");
        this.aml = new Label("Amount");
        this.ac2l = new Label("Account destin ID");
        this.b1l = new Label("SOURCE BALANCE");
        this.b2l = new Label("Destin Balance");
        this.ac1t = new TextField(50);
        this.ac2t = new TextField(50);
        this.amt = new TextField(50);
        this.b1t = new TextField(50);
        this.b2t = new TextField(50);
        this.add(this.w);
        this.add(this.d);
        this.add(this.t);
        this.add(this.c);
        this.add(this.ac1l);
        this.add(this.aml);
        this.add(this.ac2l);
        this.add(this.b1l);
        this.add(this.b2l);
        this.add(this.ac1t);
        this.add(this.amt);
        this.add(this.ac2t);
        this.add(this.b1t);
        this.add(this.b2t);
        this.setLayout(null);
        this.ac1l.setBounds(10, 30, 100, 20);
        this.ac1t.setBounds(10, 50, 100, 20);
        this.aml.setBounds(10, 90, 100, 20);
        this.amt.setBounds(10, 110, 100, 20);
        this.ac2l.setBounds(10, 150, 100, 20);
        this.ac2t.setBounds(10, 170, 100, 20);
        this.b1l.setBounds(10, 200, 100, 20);
        this.b1t.setBounds(10, 220, 100, 20);
        this.b2l.setBounds(10, 260, 100, 20);
        this.b2t.setBounds(10, 280, 100, 20);
        this.w.setBounds(200, 50, 100, 20);
        this.d.setBounds(200, 80, 100, 20);
        this.t.setBounds(200, 110, 100, 20);
        this.c.setBounds(200, 140, 100, 20);
        this.setSize(500, 700);
        this.setVisible(true);
        this.w.addActionListener(this);
        this.d.addActionListener(this);
        this.t.addActionListener(this);
        this.c.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            double bal1 = 0, bal2 = 0;
            Object source = ae.getSource();

            if (source == this.w) {
                int an1 = Integer.parseInt(this.ac1t.getText());
                double amo = Double.parseDouble(this.amt.getText());
                String fname1 = an1 + ".txt";
                Scanner fscan1 = new Scanner(fname1);
                FileReader fin1 = new FileReader(fname1);

                if (fscan1.hasNextDouble() == true) {
                    bal1 = fscan1.nextDouble();
                }

                if (bal1 < amo) {
                    throw new Exception("INSUFFICIENT BALANCE");
                }
                fscan1.close();
                fin1.close();
                FileWriter fout1 = new FileWriter(fname1);
                bal1 = bal1 - amo;
                this.b1t.setText("Final Balance " + Double.toString(bal1));
                fout1.write(Double.toString(bal1));

                fout1.close();

            }

            else if (source == this.d) {
                int an1 = Integer.parseInt(this.ac1t.getText());
                double amo = Double.parseDouble(this.amt.getText());
                String fname1 = an1 + ".txt";
                Scanner fscan1 = new Scanner(fname1);
                FileReader fin1 = new FileReader(fname1);

                if (fscan1.hasNextDouble() == true) {
                    bal1 = fscan1.nextDouble();
                }
                bal1 = bal1 + amo;
                this.b1t.setText("Final Balance " + Double.toString(bal1));
                fin1.close();
                fscan1.close();
                FileWriter fout1 = new FileWriter(fname1);
                fout1.write(Double.toString(bal1));

                fout1.close();

            }

            else if (source == this.t) {

                int an1 = Integer.parseInt(this.ac1t.getText());
                double amo = Double.parseDouble(this.amt.getText());
                String fname1 = an1 + ".txt";
                Scanner fscan1 = new Scanner(fname1);
                FileReader fin1 = new FileReader(fname1);

                int an2 = Integer.parseInt(this.ac2t.getText());
                String fname2 = an2 + ".txt";
                Scanner fscan2 = new Scanner(fname2);
                FileReader fin2 = new FileReader(fname2);

                if (bal1 < amo) {

                    throw new Exception("INSUFFICIENT BALANCE");
                }

                bal1 = bal1 - amo;
                if (fscan2.hasNextDouble()) {
                    bal2 = fscan2.nextDouble();
                }
                fin1.close();
                fscan1.close();
                fin2.close();
                fscan2.close();

                FileWriter fout1 = new FileWriter(fname1);
                FileWriter fout2 = new FileWriter(fname2);
                bal2 = bal2 + amo;
                this.b1t.setText("Final Balance " + Double.toString(bal1));
                fout1.write(Double.toString(bal1));
                this.b2t.setText("Final Balance " + Double.toString(bal2));
                fout2.write(Double.toString(bal2));

                fout1.close();
                fout2.close();

            } else {

                int an1 = Integer.parseInt(this.ac1t.getText());
                double amo = Double.parseDouble(this.amt.getText());
                String fname1 = an1 + ".txt";
                Scanner fscan1 = new Scanner(fname1);
                FileReader fin1 = new FileReader(fname1);

                int an2 = Integer.parseInt(this.ac2t.getText());
                String fname2 = an2 + ".txt";
                Scanner fscan2 = new Scanner(fname2);
                FileReader fin2 = new FileReader(fname2);
                if (fscan1.hasNextDouble() == true) {
                    bal1 = fscan1.nextDouble();
                }
                /*
                 * f(fscan2.hasNextDouble()) {
                 * bal2 = fscan2.nextDouble();
                 * }
                 * this.b1t.setText("Final balance " + bal1);
                 * this.b2t.setText("Final balance " + bal2);
                 * fin1.close();
                 * fscan1.close();
                 * fin2.close();
                 * fscan2.close();
                 */

            }

        }

        catch (IOException e) {
            System.out.println("account number INVALID" + e);
        } catch (Exception x) {
            this.b1t.setText("exception" + x);
        }

    }

    public static void main(String args[]) {
        ATM1 obj = new ATM1();
    }
}