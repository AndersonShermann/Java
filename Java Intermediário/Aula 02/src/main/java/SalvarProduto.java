
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SalvarProduto")
public class SalvarProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SalvarProduto() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			String descricao = request.getParameter("descricao");
			float valor = Float.parseFloat(request.getParameter("valor"));
			int estoque = Integer.parseInt(request.getParameter("estoque"));
			String tipo = request.getParameter("tipo");
			
			response.sendRedirect("RelatorioProduto.jsp?descricao=" + descricao + "&valor=" + valor + "&estoque=" + estoque + "&tipo=" + tipo);
	}

}
