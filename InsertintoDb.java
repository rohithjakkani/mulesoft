package com.company;

import java.sql.*;

public class InsertIntoDb{
    public static void main(String[] args) {
        try {

            Connection con = null;
            Statement stmt = null;

            con = DriverManager
                    .getConnection("jdbc:sqlite:/C:\\sqlite\\java\\connect\\net\\sqlitetutorial\\Mulesoft\\MoviesDatabase.db");

            System.out.println("Database Connection Successful !!");

            stmt = con.createStatement(); // Create Statement

            String query0 = "INSERT INTO Movies values ('RRR','Ramcharan','Aliabhat', 2022,'Rajamouli');";
            stmt.executeUpdate(query0); // Create Query-1

            String query1 = "INSERT INTO Movies values ('Major','Adivi Shesh','malavika', 2020,'lokesh');";
            stmt.executeUpdate(query1); // Create Query-1

            String query2 = "INSERT INTO Movies values ('Sarkaruvari pata','vijay','pooja',2022,'nelson');";
            stmt.executeUpdate(query2); // Create Query-2

            String query3 = "INSERT INTO Movies values ('Antey Sundaraniki','nani','Shradda',2022,'gowtham');";
            stmt.executeUpdate(query3); // Create Query-3

            String query4 = "INSERT INTO Movies values ('Mahaan','Dhanush','priyanka',2022,'C.B chakravarthi');";
            stmt.executeUpdate(query4); // Create Query-4

            String query5 = "INSERT INTO Movies values ('Drushyam','dhanush','rajishavijayan',2019,'mariselvaraj');";
            stmt.executeUpdate(query5);
            stmt.close();

            con.close();                //Close Connection
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Record  Inserted successfully");
    }
}
