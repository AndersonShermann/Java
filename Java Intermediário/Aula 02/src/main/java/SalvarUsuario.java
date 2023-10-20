
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SalvarUsuario")
public class SalvarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SalvarUsuario() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome = request.getParameter("nome");
		int tel = Integer.parseInt(request.getParameter("tel"));
		String email = request.getParameter("email");
		int cpf = Integer.parseInt(request.getParameter("cpf"));
		String senha = request.getParameter("senha");

		response.sendRedirect("CadastroUsuarios.jsp?nome=" + nome + "&tel=" + tel + "&email=" + email + "&cpf=" + cpf
				+ "&senha=" + senha);
	}

}
