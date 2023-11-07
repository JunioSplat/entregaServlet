package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CadastroDAO;


@WebServlet("/DeleteController")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		
		try {
			CadastroDAO cDAO = new CadastroDAO();
			cDAO.deleteCadastro(id);
			
			res.sendRedirect("ReadController");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}

}