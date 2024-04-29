/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.BEAN.Usuario;
import model.DAO.UsuarioDAO;

/**
 *
 * @author Senai
 */
public class CadastroController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String url = "/WEB-INF/jsp/cadastrar.jsp";
        RequestDispatcher d = getServletContext().getRequestDispatcher(url);
        d.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String url = request.getServletPath();

        if (url.equals("/cadastrar")) {

            String nextPage = "/WEB-INF/jsp/index.jsp";

            // Verificar se todos os campos estão preenchidos
            String nome = request.getParameter("input-nome");
            String email = request.getParameter("input-email");
            String senha = request.getParameter("input-senha");
            String cpf = request.getParameter("input-cpf");
            String telefone = request.getParameter("input-telefone");

            // Verifica se algum campo está vazio
            if (nome == null || nome.isEmpty()
                    || email == null || email.isEmpty()
                    || senha == null || senha.isEmpty()
                    || cpf == null || cpf.isEmpty()
                    || telefone == null || telefone.isEmpty()) {

                // Se algum campo estiver vazio, redireciona de volta para a página de cadastro com uma mensagem de erro
                nextPage = "/WEB-INF/jsp/cadastrar.jsp";
                request.setAttribute("errorMessage", "Por favor, preencha todos os campos.");
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
                dispatcher.forward(request, response);
                return;
            }

            Usuario u = new Usuario();
            UsuarioDAO ud = new UsuarioDAO();

            u.setNome(nome);
            u.setEmail(email);
            u.setSenha(senha);
            u.setCpf(cpf);
            u.setTelefone(telefone);

            try {
                ud.create(u);
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
                dispatcher.forward(request, response);

            } catch (Exception e) {
                nextPage = "/WEB-INF/jsp/cadastrar.jsp";
                request.setAttribute("errorMessage", "Cadastros não realizados corretamente");
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
                dispatcher.forward(request, response);
                return; // Adicionando retorno após o tratamento de exceção
            }
        }

        // Movendo a chamada de processRequest para fora do bloco if
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
