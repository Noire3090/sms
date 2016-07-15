package sms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
	public static Connection connectDatabase(){
		//Connection localConnection = null;
		Connection serverConnection = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			//localConnection
			//*=データベース名
			//localConnection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/managementdb?useUnicode=true&characterEncoding=WINDOWS-31J","Noire", "Mobius_01");
			//serverConnection
			serverConnection = DriverManager.getConnection("jdbc:mysql://10.10.2.36/testDB?useUnicode=true&characterEncoding=WINDOWS-31J","root","johodai");
		}catch(SQLException SQLException){
			System.out.println("error code:"+SQLException.getErrorCode());
			System.out.println("SQL stats:"+SQLException.getSQLState());
			SQLException.printStackTrace();
		}catch(ClassNotFoundException localClassNotFoundException){
			localClassNotFoundException.printStackTrace();
		}
		return serverConnection;
	}
}
