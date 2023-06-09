package ch09;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;


@WebServlet("/studentControl")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    StudentDAO dao; 
   
    public StudentController() {
        super();
       
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	//모델 역할을 하는 클래스의 객체를 생성(딱 한번만 객체를 생성한다. )
    	dao = new StudentDAO();
    	
    }

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); //한글깨짐방지
		String action = request.getParameter("action");
		String view = "";
		
		if(action == null) {
			getServletContext().getRequestDispatcher("/studentControl?action=list").forward(request, response);
		} else {
			switch (action) {
			case "list": view = list(request, response);break;
			case "insert": view = insert (request, response);break;

			}
			getServletContext().getRequestDispatcher("/ch09/" + view).forward(request, response);
		}
		
	}
	public String list(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("students",dao.getAll());
		return "studentInfo.jsp";
	}

	public String insert(HttpServletRequest request, HttpServletResponse response) {
		//dao에 있는 insert메소드를 호출해야 함. 
		Student s = new Student();
		
		//객채의 필드명 = Parameter의 name이 같아야 한다. 
		try {
			BeanUtils.populate(s, request.getParameterMap());
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
//		s.setUsername(request.getParameter("username"));
//		s.setEmail(request.getParameter("email"));
//		s.setUniv(request.getParameter("univ"));
//		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
//		Date date = (Date)formatter.parse(request.getParameter("birth"));
//		s.setBirth(date);
		
		
		dao.insert(s);
		
		return "studentInfo.jsp";
		
	}

	
}
