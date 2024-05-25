import java.util.*;
import java.sql.*;

class Insert {
    public static void main(String args[]) {
        try {
            int emp, y, count = 0;
            String na, desg, nat;
            double sal;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter empid:");
            emp = scan.nextInt();
            System.out.println("Enter year of joining");
            y = scan.nextInt();
            System.out.println("Enter name:");
            na = scan.nextLine();
            System.out.println("Enter designation:");
            desg = scan.nextLine();
            System.out.println("Enter nationality:");
            nat = scan.nextLine();
            System.out.println("Enter salary:");
            sal = scan.nextInt();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
            Statement stm = con.createStatement();
            String qry = "insert into employee(empid,name,designation,nationality,year,salary)values(" + emp + ",'" + na
                    + "','" + desg + "','" + nat + "'," + y + "," + sal + ")";
            count = stm.executeUpdate(qry);
            if (count == 1) {
                System.out.println("Data Inserted");
            } else {
                System.out.println("Data not inserted");
            }
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Caught Exception:" + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Caught Exception:" + e);
        }
    }
}