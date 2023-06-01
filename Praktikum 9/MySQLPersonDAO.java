/**
 * File : MySQLPersonDAO.java 31/05/2023
 * Penulis : Muhammad Rafasya Putra Ristianto
 * Deskripsi : Implementasi PersonDAO untuk MySQL
*/

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO{
    public void savePerson(Person person) throws Exception{
        String name = person.getName();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo", "root", "");
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        con.close();
    }
}
