package controller;
import model.Cadastro;
import model.CadastroDAO;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreateController")
public class CreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  Cadastro cadastro = new Cadastro();
		  
		  cadastro.setNome(request.getParameter("nome"));
		  cadastro.setEmail(request.getParameter("email"));
		  cadastro.setSenha(request.getParameter("senha"));
		  
		  try {
			CadastroDAO cadastroDAO = new CadastroDAO();
			cadastroDAO.criarCadastro(cadastro);
			response.sendRedirect("ReadController");
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
	}

}
