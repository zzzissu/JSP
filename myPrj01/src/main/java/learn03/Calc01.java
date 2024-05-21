package learn03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calc01
 */
@WebServlet("/calc01")
public class Calc01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int front = Integer.parseInt(request.getParameter("front"));
		int back = Integer.parseInt(request.getParameter("back"));
		String calc = request.getParameter("calc");
		int result = 0;
		double res = 0;
		
		switch(calc) {
		
		 case "+" : result = front + back;
		 break;
		 
		 case "-" : result = front - back;
		 break;
		 
		 case "*" : result = front * back;
		 break;
		 
		 case "/" : res = front / back;
		 break;
		 
		 default:
			 
		}
		
		response.setContentType("text/html;charset=utf-8");
	    PrintWriter out = response.getWriter();
//        out.append("<h2>Calculater Servlet</h2><hr>")
//        .append("계산 결과: " + result)		// ()안에 무조건 string type이 와야함. 변수만 입력 X
//        .append("</body></html>");
        if(calc.equals("+")||calc.equals("-")||calc.equals("*")) {
        	out.println("계산 결과: " + result);
        }else if(calc.equals("/")) {
        	out.println("계산 결과: " + res);
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
