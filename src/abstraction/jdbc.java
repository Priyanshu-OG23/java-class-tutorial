package abstraction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
    public static void main(String[] args) throws SQLException{
        String url="jdbc:mysql://localhost/3306/javaDatabase";
        String usr="root";
        String pass="Coding@123islife";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(url, usr, pass);
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from Student");
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
            }
            
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
