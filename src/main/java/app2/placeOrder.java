package app2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(name="order",urlPatterns="/order.rmk")
public class placeOrder extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String rmk=req.getParameter("button");
		HttpSession session=req.getSession();
		ArrayList<String> arr=(ArrayList<String>) session.getAttribute("arr");
		arr.add(rmk);
		RequestDispatcher rq=req.getRequestDispatcher("sample.jsp");
		rq.forward(req, res);
	}
}
