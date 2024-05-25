import java.sql.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class InsertData {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        int empid, year, count = 0;
        double salary;
        String name, nationality, desig;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter empid:");
        empid = scan.nextInt();
        System.out.println("Enter year of joining:");
        year = scan.nextInt();
        System.out.println("Enter Designation:");
        desig = scan.next();
        System.out.println("Enter name:");
        name = scan.next();
        System.out.println("Enter Salary");
        salary = scan.nextDouble();
        System.out.println("Enter Nationality");
        nationality = scan.next();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
        Statement stm = con.createStatement();
        String qry = "insert into employee(empid,name,designation,nationality,year,salary) values                         ("
                + empid + ",'" + name + "','" + desig + "','" + nationality + "','" + year + "'," + salary + ")";
        count = stm.executeUpdate(qry);
        if (count == 1) {
            System.out.println("Data inserted successfully !");
        } else {
            System.out.println("Data insertion failed !");
        }
        stm.close();
        con.close();
    }
}