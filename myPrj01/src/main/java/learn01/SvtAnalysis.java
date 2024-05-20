package learn01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SvtAnalysis
 */
@WebServlet("/SvtAnalysis")
public class SvtAnalysis extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvtAnalysis() {
        super();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       response.setContentType("text/html; charset=utf-8");
	         PrintWriter out = response.getWriter();
	         out.append("<!doctype html><html><head><title>Hello Servlet</title></head><body>")
	         .append("<h2>Hello World!!</h2><hr>")
	         .append("현재 날짜와 시간: " + java.time.LocalTime.now())
	         .append("</body></html>");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
