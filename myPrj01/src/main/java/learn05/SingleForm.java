package learn05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SingleForm
 */
@WebServlet("/singleform")
public class SingleForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		ServletContext application = request.getServletContext();
		HttpSession session = request.getSession();
		
		String num = request.getParameter("num");
		String oper = request.getParameter("oper");
		
		int result = 0;
		
		if(!num.equals("")) result = Integer.parseInt(num);
		
		if(oper.equals("=")) {
//			int x = (int)application.getAttribute("result");
			int x = (Integer)session.getAttribute("result");
			int y = result;
//			String op = (String)application.getAttribute("oper");
			String op = (String)session.getAttribute("oper");
			
			int value = 0;
			double val = 0;
			
			if(op.equals("+")) {
				value = x + y;
			} else if(op.equals("-")) {
				value = x - y;
			} else if(op.equals("*")) {
				value = x * y;
			} else if(op.equals("/")) {
				val = x / y;
			}
			
			if(op.equals("+")||op.equals("-")||op.equals("*")) {
	        	response.getWriter().printf("결과 값 : %d\n", value);
	        }else if(op.equals("/")) {
	        	response.getWriter().printf("결과 값 : %.2f\n", val);
	        }
			
		} else { // 값 저장
//			application.setAttribute("result", result);
//			application.setAttribute("oper", oper);		
			
			session.setAttribute("result", result);
			session.setAttribute("oper", oper);	
			
//			response.sendRedirect("/singleForm.html");
		}
		
		
		
//		if(!oper.equals("=")) {
//			application.setAttribute("num", num);
//			application.setAttribute("oper", oper);
//		} else {
//			int n1 = (int) application.getAttribute("num");
//			int n2 = Integer.parseInt(num);
//			String str = (String)application.getAttribute("oper");
		
//			long res = 0;
//			switch(str) {
//			case "+":
//				res = n1 + n2;
//				break;
//			}
//		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
