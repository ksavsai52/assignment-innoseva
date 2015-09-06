package com.test.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.dao.UserDao;
import com.test.entity.User;

/**
 * Servlet implementation class SubmitServlet
 */
@WebServlet("/submit")
public class SubmitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SubmitServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			User user = new User();
			user.setFirstName(request.getParameter("firstName"));
			user.setLastName(request.getParameter("lastName"));
			user.setPhoneNumber(request.getParameter("phoneNumber"));
			user.setAddress(request.getParameter("address"));

			String path = getServletContext().getRealPath("/csv/test.csv");
			UserDao userDao = new UserDao(path);

			if (userDao.isPresent(user)) {
				response.sendRedirect("#recognized");
			} else {
				response.sendRedirect("#not-recognized");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
