
package librarydatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Functionl {
     private static Connection connection=null;
       static Connection getInstance()throws SQLException, ClassNotFoundException{
          if(connection==null){
              Class.forName("com.mysql.jdbc.Driver");
          connection = DriverManager.getConnection("jdbc:mysql://localhost/Library_fun?" +"user=root");
          }
           return connection;
      }
}
