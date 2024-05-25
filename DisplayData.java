import java.util.*;
import java.sql.*;

class DisplayData {
    public static void main(String args[]) {
        try {
            int numrows = 0;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
            Statement stm = con.createStatement();
            String qry = "select * from employee order by  salary desc";
            ResultSet rs = stm.executeQuery(qry);
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
                        + rs.getString(4) + "\t" + rs.getInt(5) + "\t" + rs.getDouble(6));
                numrows++;
            }
            if (numrows > 0) {
                System.out.println(numrows + "rows retrieved");
            } else {
                System.out.println("Data not found");
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Caught Exception:" + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Caught Exception:" + e);
        }
    }
}