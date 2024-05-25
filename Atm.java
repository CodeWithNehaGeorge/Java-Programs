import java.io.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

class Atm extends JFrame implements ActionListener {
    JButton withdraw, deposit, balance;
    JLabel with, dep, bal, heading, accno;
    JTextField w, d, b, a;

    Atm() {
        super("ATM APPLICATION");

        this.withdraw = new JButton("WITHDRAW");
        this.deposit = new JButton("DEPOSIT");
        this.balance = new JButton("BALANCE");

        this.with = new JLabel("WITHDRAW AMOUNT");
        this.dep = new JLabel("DEPOSIT AMOUNT");
        this.accno = new JLabel("ACCOUNT NUMBER");
        this.bal = new JLabel("BALANCE");
        this.heading = new JLabel("ATM");

        this.w = new JTextField(10);
        this.d = new JTextField(10);
        this.b = new JTextField(10);
        this.a = new JTextField(10);

        this.add(this.withdraw);
        this.add(this.deposit);
        this.add(this.balance);
        this.add(this.with);
        this.add(this.dep);
        this.add(this.accno);
        this.add(this.bal);
        this.add(this.heading);
        this.add(this.w);
        this.add(this.d);
        this.add(this.b);
        this.add(this.a);
        this.setLayout(null);

        this.heading.setBounds(20, 50, 150, 20);
        this.accno.setBounds(20, 70, 150, 20);
        this.a.setBounds(20, 90, 150, 20);
        this.bal.setBounds(20, 110, 150, 20);
        this.b.setBounds(20, 130, 150, 20);
        this.dep.setBounds(20, 150, 150, 20);
        this.d.setBounds(20, 170, 150, 20);
        this.with.setBounds(20, 190, 150, 20);
        this.w.setBounds(20, 210, 150, 20);
        this.withdraw.setBounds(200, 150, 150, 50);
        this.deposit.setBounds(350, 150, 150, 50);
        this.balance.setBounds(500, 150, 150, 50);

        this.setVisible(true);
        this.setSize(500, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.withdraw.addActionListener(this);
        this.deposit.addActionListener(this);
        this.balance.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        String no;
        double bal = 0, amt;
        String s = ae.getActionCommand();
        try {
            if ((s.equals("DEPOSIT")) == true) {
                no = this.a.getText();
                FileReader fin = new FileReader(no + ".txt");
                amt = Double.parseDouble(this.d.getText());
                Scanner fscan = new Scanner(fin);
                if ((fscan.hasNextDouble()) == true) {
                    bal = fscan.nextDouble();
                }
                bal = bal + amt;
                this.b.setText(Double.toString(bal));
                fin.close();
                FileWriter fout = new FileWriter(no + ".txt");
                fout.write(Double.toString(bal));
                fout.close();
            } else if ((s.equals("WITHDRAW")) == true) {
                no = this.a.getText();
                FileReader fin = new FileReader(no + ".txt");
                amt = Double.parseDouble(this.w.getText());
                Scanner fscan = new Scanner(fin);
                if ((fscan.hasNextDouble()) == true) {
                    bal = fscan.nextDouble();
                }
                if (bal < amt) {
                    throw new Exception("INSUFFICIENT BALANCE");
                }
                bal = bal - amt;

                this.b.setText(Double.toString(bal));
                fin.close();
                FileWriter fout = new FileWriter(no + ".txt");
                fout.write(Double.toString(bal));
                fout.close();
            } else if ((s.equals("BALANCE")) == true) {
                no = this.a.getText();
                FileReader fin = new FileReader(no + ".txt");
                Scanner fscan = new Scanner(fin);
                if ((fscan.hasNextDouble()) == true) {
                    bal = fscan.nextDouble();
                }
                this.b.setText(Double.toString(bal));
                fin.close();
            }
        } catch (FileNotFoundException e) {
            this.accno.setText("INVALID ACCNO");
        } catch (IOException e) {
            System.out.println("Exception:" + e);
        } catch (Exception e) {
            this.b.setText("INSUFFICIENT BALANCE");
        }
    }

    public static void main(String args[]) {
        Atm a1 = new Atm();
    }

}