
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Conversor")
public class Conversor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Conversor() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int valor = Integer.parseInt(request.getParameter("valor"));
		
		Double Dolar = valor / 5.048;
		Double Euro = valor / 5.343;
		Double Peso = valor / 0.013;
		Double Libra = valor / 6.133;
		
		response.sendRedirect("MoedaConvertida.jsp?dolar="+Double.toString(Dolar)+"&euro="+Double.toString(Euro)+"&peso="+Double.toString(Peso)+"&libra="+Double.toString(Libra));
	}

}
