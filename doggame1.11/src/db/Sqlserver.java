package db;

import java.sql.*;

public class Sqlserver {
    Connection con;
    Statement sql;
    public Sqlserver() {


        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            conn = DriverManager.getConnection(dbURL, userName, userPwd);
            this.con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Player;user=sa;password=123456"
            );
            this.sql= con.createStatement();
//            ResultSet rs =sql.executeQuery("SELECT * FROM Class");
//            while (rs.next()) {
//                System.out.print(rs.getString(1));
//                System.out.print(rs.getString(2));
//                System.out.println(rs.getString(3));
//            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean InDb(String name){ //判断是不是在数据库 是就返回true

        try {
            ResultSet rs =sql.executeQuery("SELECT * FROM player");
            while (rs.next()) {

                if (rs.getString(1).replace(" ","").equals(name)){
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public ResultSet TopTen() {

        try {
            ResultSet rs = sql.executeQuery("use Player select TOP 10 * from player order by score  desc ");
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public  void  insertDb(String username,String time, int score){ //插入数据
        try {
            PreparedStatement preparedStatement=con.prepareStatement("insert into player values(?,?,?)");
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,time);
            preparedStatement.setInt(3,score);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

        public static void main(String[] args) {
        Sqlserver sqlserver=new Sqlserver();
            ResultSet rs=sqlserver.TopTen();
            try {
                while (rs.next()){
                    System.out.print(rs.getString(1));
                    System.out.print(rs.getString(2));
                    System.out.println(rs.getString(3));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}
