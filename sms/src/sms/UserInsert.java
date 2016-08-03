package sms;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserInsert")
public class UserInsert extends HttpServlet{
	public UserInsert(){
		super();
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String username = null;
		String password = null;
		String eos = null;

		username = request.getParameter("username");
		password = request.getParameter("password");

		eos = DBmanage.usersInsert(username, password);

		if(eos == "OK"){
			request.getRequestDispatcher("/completed.html").forward(request, response);
		}
	}
}
