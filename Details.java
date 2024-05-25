import java.util.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class Details extends JFrame implements ActionListener {
    JButton display;
    JLabel d, na, nat, e, y, s, e1, heading;
    JTextField designation, nationality, name, empid, year, salary, e2;

    Details() {
        super("EMPLOYEE DETAILS");

        this.display = new JButton("DISPLAY");

        this.d = new JLabel("DESIGNATION");
        this.na = new JLabel("NAME");
        this.nat = new JLabel("NATIONALITY");
        this.e = new JLabel("EMP ID");
        this.y = new JLabel("YEAR");
        this.s = new JLabel("SALARY");
        this.heading = new JLabel("EMPLOYEE DATA");
        this.e1 = new JLabel("ENTER ID");

        this.designation = new JTextField(10);
        this.nationality = new JTextField(10);
        this.name = new JTextField(10);
        this.empid = new JTextField(10);
        this.year = new JTextField(10);
        this.salary = new JTextField(10);
        this.e2 = new JTextField(10);

        this.add(this.display);

        this.add(this.d);
        this.add(this.na);
        this.add(this.nat);
        this.add(this.e);
        this.add(this.y);
        this.add(this.s);
        this.add(this.heading);
        this.add(this.e1);

        this.add(this.designation);
        this.add(this.nationality);
        this.add(this.name);
        this.add(this.empid);
        this.add(this.year);
        this.add(this.salary);
        this.add(this.e2);
        this.setLayout(null);

        this.heading.setBounds(20, 50, 150, 20);
        this.e1.setBounds(20, 70, 150, 20);
        this.e2.setBounds(20, 90, 150, 20);
        this.e.setBounds(20, 110, 150, 20);
        this.empid.setBounds(20, 130, 150, 20);
        this.na.setBounds(20, 150, 150, 20);
        this.name.setBounds(20, 170, 150, 20);
        this.d.setBounds(20, 190, 150, 20);
        this.designation.setBounds(20, 210, 150, 20);
        this.nat.setBounds(20, 230, 150, 20);
        this.nationality.setBounds(20, 250, 150, 20);
        this.y.setBounds(20, 270, 150, 20);
        this.year.setBounds(20, 290, 150, 20);
        this.s.setBounds(20, 310, 150, 20);
        this.salary.setBounds(20, 330, 150, 20);
        this.display.setBounds(200, 150, 150, 50);

        this.setVisible(true);
        this.setSize(500, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.display.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String s = ae.getActionCommand();
            int emp, e3, numrows = 0;
            if ((s.equals("DISPLAY")) == true) {
                emp = Integer.parseInt(this.e2.getText());
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
                Statement stm = con.createStatement();
                String qry = "select * from employee order by salary";
                ResultSet rs = stm.executeQuery(qry);
                while (rs.next()) {
                    numrows++;
                    if (numrows == emp) {
                        this.empid.setText(Integer.toString(rs.getInt(1)));
                        this.name.setText(rs.getString(2));
                        this.designation.setText(rs.getString(3));
                        this.nationality.setText(rs.getString(4));
                        this.year.setText(Integer.toString(rs.getInt(5)));
                        this.salary.setText(Double.toString(rs.getDouble(6)));
                    }
                }

                if (numrows == 0) {
                    this.empid.setText("Data not found");
                    this.name.setText("Data not found");
                    this.designation.setText("Data not found");
                    this.nationality.setText("Data not found");
                    this.year.setText("Data not found");
                    this.salary.setText("Data not found");
                }
                stm.close();
                rs.close();
                con.close();
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Caught Exception:" + e);
        }
    }

    public static void main(String args[]) {
        Details d1 = new Details();
    }
}
