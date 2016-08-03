package sms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBmanage {
	static ArrayList<SmsConstructor> constructor;
	private static String userName, lectureName, classroom;
	private static int lecturept;
	static Connection connect = null;
	static PreparedStatement ps = null;
	static ResultSet result = null;
	public static String  lecture(String userName, String lectureName,
			 int lecturept, String classroom){
		String eos = null;
		connect =  DBConnection.connectDatabase();
		try{
			ps = connect.prepareStatement("insert into lecture(username,"
															  +" lectureName, lecturept, classroom)"
															  +" values(?,?,?,?)");
			ps.setString(1, userName);
			ps.setString(2, lectureName);
			ps.setInt(3, lecturept);
			ps.setString(4, classroom);
			ps.executeUpdate();
		}catch(SQLException ex){
			System.out.println("errorcode:"+ex.getErrorCode());
			System.out.println("SQLStats:"+ex.getSQLState());
			ex.printStackTrace();
			eos = "Error occurred";
		}
		if(eos == null){
			eos = "Success";
		}
		return eos;
	}
	public static String usersInsert(String username, String password) {
		String eos = null;
		connect = DBConnection.connectDatabase();
		try{
				ps = connect.prepareStatement("insert into users values (0, ?, SHA1(?))");
				ps.setString(1, username);
				ps.setString(2, password);
				ps.executeUpdate();
		}catch(SQLException e){
			System.out.println("errorcode:"+e.getErrorCode());
			System.out.println("SQLStats:"+e.getSQLState());
			e.printStackTrace();
			eos = "Error occurred";
		}
		if(eos == null){
			eos = "OK";
		}
		return eos;
	}
	public static ResultSet loginA(String username, String password) {
		connect = DBConnection.connectDatabase();
		try{
			ps = connect.prepareStatement("select * from users where name = ? and password = sha1(?)");
			ps.setString(1, username);
			ps.setString(2, password);
			result = ps.executeQuery();
		}catch(SQLException e){
			System.out.println("errorcode:"+e.getErrorCode());
			System.out.println("SQLStats:"+e.getSQLState());
			e.printStackTrace();
		}
		return result;
	}
}
