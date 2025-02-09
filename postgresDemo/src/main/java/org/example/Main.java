package org.example;
import java.sql.*;
public class Main {
    public static void main(String[] args) throws Exception {


        /*
        * import package
        * load and register
        * create connection
        * create statement
        * execute statement
        * process the result
        * close
        * */


        String url= "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "000";
        String sql1 = "select * from student";
        String sql2 ="insert into student values(2,'ahmed',50)";
        String sql3 ="update student set sname='khaled' where sid=1";
        String sql4 ="delete from student where sid=1";
        String preparedsql="insert into student values(?,?,?)"; // these question marks are going to be replaced by the real values after including the prepared statement method


        int sid=2;
        String sname="khaled";
        int marks=55;

        // update and delete queries works the same as insert in execute method

        Connection conn = DriverManager.getConnection(url,user,password);
        System.out.println("Connected to PostgreSQL database");
//        Statement stmt = conn.createStatement();
//        boolean status =stmt.execute(sql1); //executing an insertion

        PreparedStatement ps = conn.prepareStatement(preparedsql);
        ps.setInt(1,sid);
        ps.setString(2,sname);
        ps.setInt(3,marks);
        ps.execute();
//        System.out.println(status); // true if returned a resultSet ; it might be false thought the data is there
//        fetching all the rows in the DB :
//        ResultSet rs = stmt.executeQuery(sql);  retrieving a query result

//        while (rs.next()) {
//            System.out.println(rs.getString("sid")); // I mentioned the col name again to make sure it is going to return the col I need only.
//
//        }





        conn.close();
        System.out.printf("Connection closed");


    }
}