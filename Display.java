import java.util.*;
import java.sql.*;

class Display {
    public static void main(String args[]) {
        try {
            String nation, desg, n, d, nat;
            int sal, y, emp, numrows = 0;
            Scanner scan = new Scanner(System.in);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
            Statement stm = con.createStatement();
            System.out.println("Enter the nationality:");
            nation = scan.nextLine();
            System.out.println("Enter designation:");
            desg = scan.nextLine();
            String qry = "select * from employee";
            ResultSet rs = stm.executeQuery(qry);
            while (rs.next()) {
                emp = rs.getInt(1);
                n = rs.getString(2);
                d = rs.getString(3);
                nat = rs.getString(4);
                y = rs.getInt(5);
                sal = rs.getInt(6);
                if (d.equalsIgnoreCase(desg) == true && nat.equalsIgnoreCase(nation) == true) {
                    numrows++;
                    System.out.println(emp + "\t" + n + "\t" + d + "\t" + nat + "\t" + y + "\t" + sal);
                }
            }
            if (numrows > 0) {
                System.out.println(numrows + "rows retrieved");
            } else {
                System.out.println("Not Found");
            }
            con.close();
            stm.close();
            rs.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Caught exception:" + e);
        } catch (SQLException e) {
            System.out.println("Caught exception:" + e);
        }

    }
}
