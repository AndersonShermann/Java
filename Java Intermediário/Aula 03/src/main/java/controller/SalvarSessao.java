package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Sessao;

@WebServlet("/SalvarSessao")
public class SalvarSessao extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SalvarSessao() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Sessao sessao = new Sessao();
		
		sessao.setTitulo(request.getParameter("titulo"));
		sessao.setData(request.getParameter("data"));
		sessao.setHoraInicio(request.getParameter("horaInicio"));
		sessao.setHoraTermino(request.getParameter("horaTermino"));
		sessao.setSala(Integer.parseInt(request.getParameter("sala")));
		
		request.setAttribute("Sessao", sessao);
		RequestDispatcher rd = request.getRequestDispatcher("sucessoCinema.jsp");
		rd.forward(request, response);
	}

}
