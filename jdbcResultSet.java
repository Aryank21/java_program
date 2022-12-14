
package JavaApplication_;
import java.sql.*;


public class jdbcResultSet {
   public static void main(String[] args) {
      try {
         Class.forName("org.apache.derby.jdbc.ClientDriver");
      } catch(ClassNotFoundException e) {
         System.out.println("Class not found "+ e);
      }
      try {
         Connection con = DriverManager.getConnection(
            "jdbc:oracle:thin:@localhost:1521:XE","system", "Aryank");
         
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEE");
         System.out.println("id  name    job");
         
         while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String job = rs.getString("job");
            System.out.println(id+"   "+name+"    "+job);
         }
      } catch(SQLException e) {
         System.out.println("SQL exception occured" + e);
      }
   }
}

