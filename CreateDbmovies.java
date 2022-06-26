package com.company;

import java.sql.*;

public class CreateMoviesDB{
    public static void main(String[] args) {

        try {

            Connection conn = null;
            Statement stmt = null;

            conn = DriverManager
                    .getConnection("jdbc:sqlite:/C:\\sqlite\\java\\connect\\net\\sqlitetutorial\\Mulesoft\\MoviesDatabase.db");

            System.out.println("Database Connection Successful !!");

            stmt = conn.createStatement();
            String qry = "CREATE TABLE MyMovies " + "(MovieName TEXT NOT NULL,"
                    + " ActorName TEXT NOT NULL, " + " ActressName TEXT NOT NULL, "
                    + " ReleaseYear INTEGER NOT NULL, " + " DirectorName TEXT NOT NULL )";

            stmt.executeUpdate(qry);


            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Table Created successfully");
    }
}
