package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cadastro;
import model.CadastroDAO;

@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));

		try {
			CadastroDAO cDAO = new CadastroDAO();
			Cadastro cadastro = cDAO.findCadastro(id);

			req.setAttribute("cadastro", cadastro);

			RequestDispatcher rd = req.getRequestDispatcher("atualizar.jsp");
			rd.forward(req, res);
			System.out.println(id);
			
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		try {
			Cadastro cadastro = new Cadastro();
			cadastro.setId(Integer.parseInt(req.getParameter("id")));
			cadastro.setNome(req.getParameter("nome"));
			cadastro.setEmail(req.getParameter("email"));
			cadastro.setSenha(req.getParameter("senha"));

			CadastroDAO cDAO = new CadastroDAO();
			cDAO.updateCadastro(cadastro);

			res.sendRedirect("ReadController");
		} catch (Exception e) {

		}

	}

}
