package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    // definition
    public static final String DB_NAME = "test.db:";

    public static final String TABLE_NAME = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";


    public static void main(String[] args) {
	// write your code here


        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:E:\\JavaPractice\\TestJD\\test.db");
            //conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("DROP TABLE IF EXISTS"+ TABLE_NAME );
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_NAME +"(" + COLUMN_NAME + "TEXT NOT NULL COLUMN_PHONE INTEGER , COLUMN_EMAIL TEXT)); // don't need add ; in the sql string

            statement.execute("INSERT INTO contact VALUES ('A', 4654,'eraa@gmail.com')");
            statement.execute("INSERT INTO contact VALUES ('B', 5454,'B@gmail.com')");
            statement.execute("INSERT INTO contact VALUES ('C', 7554,'C@gmail.com')");
            // close the connection
            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Something Wrong " + e.getMessage());
        }
    }

//    public static void insert_Contact(Statement statement, String name, String )
}
