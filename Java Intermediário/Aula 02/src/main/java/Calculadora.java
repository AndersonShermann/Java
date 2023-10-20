

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Calcular")
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Calculadora() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int v1 = Integer.parseInt(request.getParameter("v1"));
		int v2 = Integer.parseInt(request.getParameter("v2"));
		String op = request.getParameter("operacao");
		int r;
		
		if(op=="soma") {
			r = v1 + v2;
		} else if(op=="subtracao") {
			r = v1 - v2;
		} else if(op=="multiplicacao") {
			r = v1 * v2;
		} else {
			r = v1 / v2;
		}
		
		response.sendRedirect("Calculadora.jsp?v1="+v1+"&op="+op+"&v2="+v2+"&r="+r);
	}

}
