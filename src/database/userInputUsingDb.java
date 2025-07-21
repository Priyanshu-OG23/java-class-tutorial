package database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class userInputUsingDb {

    public static void main (String args[]) throws SQLException
    {
        // take url user and password as 
        String url="jdbc:mysql://localhost:3306:javaDatabase";
        String user="root";
        String password="Coding@123islife";

        //  lets take input from the user 

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the student name :");
        String stuName=sc.nextLine();

        System.out.println("enter your roll  no :");
        int rollno=sc.nextInt();


        try{
            // Load  Mysql jbdc driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // create connection 
            Connection conn=DriverManager.getConnection(url, user, password);
            
           



          
            Statement statement=conn.createStatement();
            statement.executeUpdate("insert into Student values('"+stuName+"',"+rollno+")");

             // Create sql query

        }
        catch(Exception e){
            e.printStackTrace();
        }



        }
    }


        




    
    

