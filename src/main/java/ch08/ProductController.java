package ch08;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ProductService service;
       
    
    @Override
	public void init() throws ServletException {
		super.init(config);//서블릿 초기화
		
		//프로그램 실행시 최초로 request가 왔을 때 객체를 딱 한번만 생성한다.
		//왜냐면 init은 초기화 역할을 하는 메소드 이므로. 
		service = new ProductService();
	}


	public ProductController() {
        super();
        
    }


	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request :화면단에서 전달해준 데이터가 들어있다.
		String action = request.getParameter("action");
		String view = "";
		
		//action이 null이면 주소로 forward
		
		if(action == null ) {
			getServletContext()
			.getRequestDispatcher("/pcontrol?cation=list")
			.forward(request, response);
		}else {
			switch(action) {
			case "list": view = list(request,response); break;
			case "info": view = info(request,response);
			}
			
			getServletContext()
			.getRequestDispatcher("/ch08/"+view)
			.forward(request, response);
		}
	}
	//프로덕트 서비스의 파인드 메소드를 실행. 
	private String info(HttpServletRequest request, HttpServletResponse response) {
	Product p = service.find(request.getParameter("id"));
	//특정 id로 찾은 product 객체를 request 객체에 넣어준다. 
	request.setAttribute("p",p);
	return "productInfo.jsp";
	}
	private String list(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<Product>products = service.findAll();
		request.setAttribute("products", products);
		return "productList.jsp";
	}

}
