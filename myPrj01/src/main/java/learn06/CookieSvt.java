package learn06;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CookieSvt
 */
@WebServlet("/cookiesvt")
public class CookieSvt extends HttpServlet {
   private static final long serialVersionUID = 1L;

   protected void service(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
//      // 쿠키 생성
//      Cookie cookie = new Cookie("cook", "cData"); // 쿠키생성
//      Cookie cookie2 = new Cookie("msg", URLEncoder.encode("한글","utf-8"));
//
//      // 쿠키를 응답에 추가
//      response.addCookie(cookie);
//      response.addCookie(cookie2);

//      // application : 서블릿들을 모아놓은 공간 ServletContext
//      ServletContext application = request.getServletContext();
//      // session
//      HttpSession session = request.getSession();
      // cookie, 여러 개일 수도 있으므로 배열이다!!
      Cookie[] cookies = request.getCookies();

      response.setCharacterEncoding("UTF-8");
      response.setContentType("text/html; charset=UTF-8");
      request.setCharacterEncoding("UTF-8");

      String data = request.getParameter("data");
//      String[] op = request.getParameterValues("op");
      String op = request.getParameter("operator");

      int v = 0;
      if (data != null && !"".equals(data))
         v = Integer.valueOf(data);

      if (op.equals("=")) {
         // 계산
         // application 저장했으니 꺼내서 써야지
//               int x = (Integer) application.getAttribute("value");
         // session
//               int x = (Integer) session.getAttribute("value");

         // cookie
         int x = 0;
         for (Cookie c : cookies) {
            // 쿠키("key")가 서로 일치하면
            if ("value".equals(c.getName())) {
               x = Integer.valueOf(c.getValue());
               // 찾으면 for문 나가기
               break;
            }
         }

         int y = v;
//         String operator = (String) application.getAttribute("op");
         // session
//         String operator = (String) session.getAttribute("op");

         // cookie
         String operator = "";
         for (Cookie c : cookies) {
            if ("op".equals(c.getName())) {
               operator = c.getValue();
               break;
            }
         }

         int result = 0;

         if ("+".equals(operator))
            result = x + y;
         else if ("-".equals(operator))
            result = x - y;
         else if ("*".equals(operator))
            result = x * y;
         else
            result = x / y;

         PrintWriter out = response.getWriter();
         out.println(result);

      } else {
         // 저장(applicaion에)
//               application.setAttribute("value", v);
//               application.setAttribute("op", op);

         // 저장(session에)
//               session.setAttribute("value", v);
//               session.setAttribute("op", op);

         // 쿠키 심기, 쿠키는 무조건 문자열이므로 형변환
         Cookie valueCookie = new Cookie("value", String.valueOf(v));
         Cookie opCookie = new Cookie("op", op);
         response.addCookie(valueCookie);
         response.addCookie(opCookie);
      }
   }

}