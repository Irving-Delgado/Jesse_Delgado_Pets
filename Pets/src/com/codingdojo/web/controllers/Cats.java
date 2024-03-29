package com.codingdojo.web.controllers;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codingdojo.web.models.Cat;

/**
 * Servlet implementation class Cats
 */
@WebServlet("/Cats")
public class Cats extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cat cat = new Cat(request.getParameter("name"), request.getParameter("breed"), Double.parseDouble(request.getParameter("weight")));
		request.setAttribute("cat", cat);
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/cat.jsp");
	     view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	     doGet(request, response);
	}

}
