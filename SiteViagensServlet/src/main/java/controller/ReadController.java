package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cadastro;
import model.CadastroDAO;


//@WebServlet("/ReadController")
//public class ReadController extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//
//		try {
//			CadastroDAO cDAO = new CadastroDAO();
//
//			List<Cadastro> cadastro = cDAO.lerTodosCadastros();
//			
//			request.setAttribute("cadastros", cadastro);
//			
//			RequestDispatcher rd = request.getRequestDispatcher("listaCadastro.jsp");
//			rd.forward(request, response);
//					
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//
//
//	
//}
//
@WebServlet("/ReadController")
public class ReadController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		try {
			CadastroDAO cDAO = new CadastroDAO();
			List<Cadastro> cadastro2 = cDAO.findCadastros();
			req.setAttribute("cadastros", cadastro2);
			
			RequestDispatcher rd = req.getRequestDispatcher("listaCadastro.jsp");
			rd.forward(req, res);

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}

