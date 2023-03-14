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

public class Sample extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String rmk=req.getParameter("program");
		ArrayList<String> names=new ArrayList<>();
		ArrayList<String> arr=new ArrayList<>();
		if(rmk.equals("java")) {
			names.add("jsp");
			names.add("backend");
			names.add("spring");
			names.add("servlet");
		}
		else if(rmk.equals("python")) {
			names.add("python");
			names.add("pyweb ");
			names.add("py");
		}
		else {
			names.add("web");
			names.add("js");
			names.add("css ");
		}
		HttpSession session1=req.getSession();
		session1.setAttribute("arr", arr);
		session1.setAttribute("listes", names);
		PrintWriter out=res.getWriter();
		out.print(session1.getAttribute("listes"));
		RequestDispatcher rq=req.getRequestDispatcher("sample.jsp");
		rq.forward(req, res);
	}
}
