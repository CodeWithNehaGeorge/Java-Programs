import java.util.*;
import java.sql.*;

class Delete {
    public static void main(String args[]) {
        try {
            int y, count = 0;
            Scanner scan = new Scanner(System.in);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
            Statement stm = con.createStatement();
            System.out.println("Enter the year:");
            y = scan.nextInt();
            String qry = "delete from employee where year<" + y;
            count = stm.executeUpdate(qry);
            if (count != 0) {
                System.out.println("Data Deleted");
            } else {
                System.out.println("Not deleted");
            }
            con.close();
            stm.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Caught Exception:" + e);
        } catch (SQLException e) {
            System.out.println("Caught Exception:" + e);
        }
    }
}