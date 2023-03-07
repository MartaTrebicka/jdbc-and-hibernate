package pl.sda.orange2.jdbc;

import pl.sda.orange2.jdbc.config.H2Config;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {


    public static void main(String[] args) {
        String className = TestConnection.class.getName();
        System.out.println("Current class name is: " + className);

        String query = """
                SELECT ID, NAME
                FROM TEST
                """;

        ResultSet queryResult = null;
        try {
//            Connection h2Connection = DriverManager.getConnection(H2Config.DB_URL,
//                    H2Config.USER,
//                    H2Config.PASSWORD);
            // we need jdbc driver (h2 dependency at pom)
            // connection gave us access to existing db
            var h2Connection = DriverManager.getConnection(H2Config.DB_URL,
                    H2Config.USER,
                    H2Config.PASSWORD);
            System.out.println("got connection: " + (h2Connection != null));

            // Statement is used to send queries to db with existing connection
            Statement queryStatement = h2Connection.createStatement();

            // ResultSet contains query result data as simple table
            // we need to iterate over result to got data
            queryResult = queryStatement.executeQuery(query);
            while (queryResult.next()) {
                System.out.println("id: " + queryResult.getInt(1));
                System.out.println("name: " + queryResult.getString(2));
            }
        } catch (SQLException exc) {
            System.out.println("got exception: " + exc);
            exc.printStackTrace();
        } finally {
            System.out.println("Finally I know it :)");
            if (queryResult != null) {
                try {
                    queryResult.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println("The end");
    }
}

//    public static void main(String[] args) {
//
//        String className = TestConnection.class.getName();
//        System.out.println("Current class name is " + className);
//
//        String query = """
//                SELECT ID, NAME
//                FROM TEST
//                """;
//
//        ResultSet queryStatement = null; // stworzenie (?)
//        // DriverManager umożliwia stworzenie połaczenia do bazy danych.
//        //Dzięki temu będziemy  mogli wysylac i odbierać zapytania
//        try {
//
//            // We need jdbc driver (h2 depedency at pom)
//            //connection gave us access to existing db
//            //var to skrót na typ.  taka rura do bazy. działa do zmiennych lokalnych
//            var h2Connection = DriverManager.getConnection(H2Config.DB_URL,
//                    H2Config.USER,
//                    H2Config.PASSWORD);
//
//            System.out.println("got connection: " + (h2Connection != null));
//
//            // Statement is used to send queries to db with existing connection
//            //statement to pojedyncze zapytanie wysłane w obrębie połączenia (rury do bazy danych?)
//           Statement queryStatement = h2Connection.createStatement();
//
//            //ResultSet contains query result data as simple table
//            //We need to iterate over result to got data
//            ResultSet queryResult = queryStatement.executeQuery(query);
//            while (queryResult.next()) {
//                System.out.println("id: " + queryResult.getInt(1));
//                System.out.println("name: " + queryResult.getString(2));
//            }
//        } catch (SQLException exc) {
//            System.out.println("got exception: " + exc);
//            exc.printStackTrace();
//        } finally {  // finally zawsze się wykona !!
//            System.out.println("Finally i know it :) ");
//            if (queryResult != null) {
//                try {
//                    queryStatement.close();
//                } catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            System.out.println("The end ");
//        }
//    }
//}