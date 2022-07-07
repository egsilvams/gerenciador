package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.AlterarEmpresa;
import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.acao.MostrarEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresa;
import br.com.alura.gerenciador.acao.RemoverEmpresa;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramAcao = request.getParameter("acao");
		
		if(paramAcao.equals("ListarEmpresas")){
			ListaEmpresas acao = new ListaEmpresas();
			acao.executa(request, response);
		} else if(paramAcao.equals("RemoverEmpresa")){
			RemoverEmpresa acao = new RemoverEmpresa();
			acao.executa(request, response);
		} else if(paramAcao.equals("MostrarEmpresa")){
			MostrarEmpresa acao = new MostrarEmpresa();
			acao.executa(request, response);
		} else if (paramAcao.equals("AlterarEmpresa")) {
			AlterarEmpresa acao = new AlterarEmpresa();
			acao.executa(request, response);
		} else if (paramAcao.equals("NovaEmpresa")) {
			NovaEmpresa acao = new NovaEmpresa();
			acao.executa(request, response);
		}
	}
}
