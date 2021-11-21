package co.jp.netwisdom.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.jp.netwisdom.dao.UserinfoAndHobbyDao;
import co.jp.netwisdom.entity.UsernifoAndHobby;

public class RegisterServlet extends HttpServlet  {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=req.getParameter("username");
		//System.out.println(username);
		String password=req.getParameter("password");
		String sex=req.getParameter("sex");
		String major=req.getParameter("major");
		String[] hobby=req.getParameterValues("hobby");
		String intro=req.getParameter("intro");
		
		UsernifoAndHobby userAndEntity = new UsernifoAndHobby(username,password,sex,major,hobby,intro);
		UserinfoAndHobbyDao UserAndHobbydao = new UserinfoAndHobbyDao();
		

	try {
		    if(UserAndHobbydao.save(userAndEntity))
		{
			req.getRequestDispatcher("success.jsp").forward(req, resp);
		}else{
			req.getRequestDispatcher("fail.jsp").forward(req, resp);
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
        
	
}
