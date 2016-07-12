package sms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
	public static Connection connectDatabase(){
		Connection localConnection = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			//localConnection
			//*=データベース名
			localConnection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/managementdb?useUnicode=true&characterEncoding=WINDOWS-31J","Noire", "Mobius_01");
			//serverConnection
			//serverConnecton = DriverManager.getConnection("jdbc:mysql://10.10.2.36/*?useUnicode=true&characterEncoding=WINDOWS-31J","","");
		}catch(SQLException localSQLException){
			System.out.println("error code:"+localSQLException.getErrorCode());
			System.out.println("SQL stats:"+localSQLException.getSQLState());
			localSQLException.printStackTrace();
		}catch(ClassNotFoundException localClassNotFoundException){
			localClassNotFoundException.printStackTrace();
		}
		return localConnection;
	}
}
