package sms;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Sessionandlogin")
public class Sessionandlogin extends HttpServlet{
	public Sessionandlogin(){
		super();
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String username = null;
		String password = null;
		username = request.getParameter("username");
		password = request.getParameter("password");

		HttpSession session = request.getSession(true);

		if(username == null && password == null){
			session.setAttribute("status", "notfounderror");
			request.getRequestDispatcher("/loginpage.jsp").forward(request, response);
		}else if(password == null){
			session.setAttribute("status", "p-error");
			request.getRequestDispatcher("/loginpage.jsp").forward(request, response);
		}else if(username == null){
			session.setAttribute("status", "u-error");
			request.getRequestDispatcher("/loginpage.jsp").forward(request, response);
		}

		boolean check = authUser(username, password);
		if(check){
			session.setAttribute("login", username);
			request.getRequestDispatcher("/ScheduleManagement.jsp").forward(request,response);
		}else{
			session.setAttribute("status", "error");
			request.getRequestDispatcher("/loginpage.jsp").forward(request, response);
		}
	}

	private boolean authUser(String username, String password) {
		if (username == null || username.length() == 0 || password == null || password.length() == 0){
		      return false;
		    }
		ResultSet rs = null;
		rs = DBmanage.loginA(username, password);
		try {
			if(rs.next()){
				return true;
			}else{
				return false;
			}
		} catch (SQLException e) {
			log("SQLException:" +e.getMessage());
			return false;
		}

	}
}
