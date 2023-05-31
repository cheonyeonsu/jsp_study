package ch05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello") // 경로
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HelloWorld() {
		super(); // HttpServlet의 생성자 실행
		// TODO Auto-generated constructor stub
	}

	// request 받을 때 get 방식으로 주는 데이터를 받음
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// req : request 정보 (클라이언트로부터 받아온 정보가 있다.)
		System.out.println(req.getRequestURI());
		
		//resp : response 정보 (서버가 클라이언트에게 응답해 주기 위해서 필요)
		System.out.println();
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		out.append("<!doctype html>"
				+ "<html>"
				+ "<head>"
				+ "<title>"
				+ "hello"
				+ "</title>"
				+ "</head>"
				+ "<body>")
		.append("<h2>hello!</h2><hr>")
		.append("현재 날짜와 시간은 : " + java.time.LocalDateTime.now())
		.append("</body></html>");
	}
	
	// request 받을 때 post 방식으로 주는 데이터를 받음
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
	}
	
}
