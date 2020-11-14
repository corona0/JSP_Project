package com.corona.member.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.corona.member.dao.ILoginDAO;
import com.mysql.cj.Session;

/**
 * Servlet implementation class Login
 */
//@WebServlet("/Login")
@WebServlet(urlPatterns= {"/Login","/corona/Login"})
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        System.out.println("[LoginController] /Login");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet Method ...");
		
		String userID = request.getParameter("username");
		String userPW = request.getParameter("password");
		System.out.println("userID : "+userID);
		System.out.println("userPW : "+userPW);
		
		/*SESSION에 로그인 정보 추가*/
		HttpSession session = request.getSession();
		session.setAttribute("userID", userID);
		
		/*DAO 호출 > select Querry 실행*/
		ILoginDAO dao = new ILoginDAO();
		boolean result = dao.select_member(userID, userPW);
		
		/*script를 사용하기 위한 PrintWriter 선언*/
		PrintWriter script = response.getWriter();
		if (result) {
			script.println("<script>");
			script.println("alert('로그인 성공')");
			script.println("location.href ='"+request.getContextPath()+"/corona/Main.html'");
			script.println("</script>");
		}else {
			script.println("<script>");
			script.println("alert('로그인 실패')");
			script.println("history.back()");
			script.println("</script>");
		}
	}// The end of Method

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost Method ...");
		doGet(request, response);
	}// The end of Method

}
