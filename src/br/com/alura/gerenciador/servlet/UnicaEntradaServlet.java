package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramAcao = request.getParameter("acao");
		/*String nomeDaClasse = "br.com.alura.gerenciador.acao." + paramAcao;
		
		String nome;
		try {
			Class classe = Class.forName(nomeDaClasse);
			Acao acao = (Acao) classe.newInstance();
			nome = acao.executa(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}
				
		String[] tipo_e_endereco = nome.split(":");
		if(tipo_e_endereco[0].equals("forward")){
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipo_e_endereco[1]);
			rd.forward(request, response);
		}else {
			response.sendRedirect(tipo_e_endereco[1]);
		}*/
		
		/*if(paramAcao.equals("ListarEmpresas")){
			ListaEmpresas acao = new ListaEmpresas();
			nome = acao.executa(request, response);
		} else if(paramAcao.equals("RemoverEmpresa")){
			RemoverEmpresa acao = new RemoverEmpresa();
			nome = acao.executa(request, response);
		} else if(paramAcao.equals("MostrarEmpresa")){
			MostrarEmpresa acao = new MostrarEmpresa();
			nome = acao.executa(request, response);
		} else if (paramAcao.equals("AlterarEmpresa")) {
			AlterarEmpresa acao = new AlterarEmpresa();
			nome = acao.executa(request, response);
		} else if (paramAcao.equals("NovaEmpresa")) {
			NovaEmpresa acao = new NovaEmpresa();
			nome = acao.executa(request, response);
		} else if (paramAcao.equals("NovaEmpresaForm")) {
			NovaEmpresaForm acao = new NovaEmpresaForm();
			nome = acao.executa(request, response);
		}*/
	}
}
