package com.corona.member.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinController
 */
//@WebServlet(urlPatterns={"/Join","/corona/Join"})
@WebServlet("/corona/Join")
public class JoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoinController() {
    	System.out.println("[JoinController]");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String memberType = request.getParameter("memberType");
		String memberName = request.getParameter("memberName");
		String memberID = request.getParameter("memberID");
		String memberPW = request.getParameter("memberPW");
		String memberPWcheck = request.getParameter("memberPWcheck");
		String memberMainAdress = request.getParameter("memberMainAdress");
		String memberSubAdress = request.getParameter("memberSubAdress");
		String memberPhone1 = request.getParameter("memberPhone1");
		String memberPhone2 = request.getParameter("memberPhone2");
		String memberPhone3 = request.getParameter("memberPhone3");
		
		System.out.println("memberType :" +memberType);
		System.out.println("memberName :" +memberName);
		System.out.println("memberID :" +memberID);
		System.out.println("memberPW :" +memberPW);
		System.out.println("memberPWcheck :" +memberPWcheck);
		System.out.println("memberMainAdress :" +memberMainAdress);
		System.out.println("memberSubAdress :" +memberSubAdress);
		System.out.println("memberPhone1 :" +memberPhone1);
		System.out.println("memberPhone2 :" +memberPhone2);
		System.out.println("memberPhone3 :" +memberPhone3);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
