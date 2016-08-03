package sms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginPage extends HttpServlet {
  public void doPOST(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{

	  response.setContentType("text/html; charset=UTF-8");
	  PrintWriter out = response.getWriter();

	  out.println("<html>");
	  out.println("<head>");
	  out.println("<title>ログインページ</title>");
	  out.println("</head>");
	  out.println("<body>");
	  out.println("<h1>ログイン画面</h1>");

	  HttpSession session = request.getSession(true);

	  Object status = session.getAttribute("status");

	  if (status != null){
		  out.println("<p>認証に失敗しました</p>");
	      out.println("<p>再度ユーザー名とパスワードを入力して下さい</p>");
	      session.setAttribute("status", null);
	  }
	  out.println("<form method=\"POST\" aciont\"./Sessionandlogin\" name=\"loginform\">");
	  out.println("<tr>");
	  out.println("<td>ユーザー名</td>");
	  out.println("<td><input type=\"text\" name=\"user\" size=\"32\"</td>");
	  out.println("</tr>");
	  out.println("<tr>");
	  out.println("<td>パスワード</td>");
	  out.println("<td><input type=\"passowrd\" name=\"pass\" size=\"32\"</td>");
	  out.println("</tr>");
	  out.println("<tr>");
	  out.println("<td><input type=\"submit\" value=\"login\"></td>");
	  out.println("<td><input type=\"reset\" value=\"reset\"></td>");
	  out.println("</tr>");
	  out.println("</table>");
	  out.println("</form>");
	  out.println("</body>");
	  out.println("</html>");
  }
}