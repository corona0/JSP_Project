package com.corona.main.Controller;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
        System.out.println("/Login");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGet Method ...");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("username : "+username);
		System.out.println("password : "+password);
		
		if (username.equals("test") && password.equals("test")) {
			System.out.println("Success Login");
			//forward : url주소 변경 X
//			RequestDispatcher dispatcher = request.getRequestDispatcher("corona/Main.jsp");
//			dispatcher.forward(request, response);
			//redirect : url주소 변경 o
			response.sendRedirect("/corona/Main.html");
		}else {
			System.out.println("Fail Login");
			RequestDispatcher dispatcher = request.getRequestDispatcher("corona/Login.jsp");
			dispatcher.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost Method ...");
		doGet(request, response);
	}

}
