import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Olamundo")
public class Olamundo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Olamundo() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//Informa o tipo de conteúdo que será retornado
		response.setContentType("text/html"); 
		
		PrintWriter out = response.getWriter();
		
		out.print("<h1>Anderson Shermann 2023</h1>");
		
		
		
		
	}

}
