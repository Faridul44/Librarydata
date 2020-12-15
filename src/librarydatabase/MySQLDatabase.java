
package librarydatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class MySQLDatabase {
     Statement statement=null;
    PreparedStatement preparedStatement=null;
    ResultSet result=null;
    Connection connect=null;
    Scanner sc = null;
    void databaseOperation()
    {
               
try {
            connect = Functionl.getInstance();
            sc = new Scanner(System.in);
            // statement=connect.createStatement();
            //result=statement.executeQuery("SELECT * FROM  Library_inform");
            preparedStatement = connect.prepareStatement("SELECT * FROM Library_inform WHERE rack=?");
            while (true) {
                System.out.println("Insert a rack\n");
                preparedStatement.setString(1, sc.nextLine());
                result = preparedStatement.executeQuery();

                while (result.next()) {
                    System.out.println("Function:" + result.getString("function"));
                    System.out.println("Bookname:" + result.getString("bookname"));
                    System.out.println("Author:" + result.getString("author"));
                    System.out.println("Quantity:" + result.getString("quantity"));
                    System.out.println("Rack:" + result.getString("rack")); 
              }
       }
} catch(Exception ex){
           System.out.println(""+ex);
    }
            
    }         
}


