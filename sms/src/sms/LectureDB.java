package sms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LectureDB {
	static ArrayList<smsConstructor> constructor;
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
}
