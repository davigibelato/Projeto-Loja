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
public class LoginController extends HttpServlet {

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

        String url = "/WEB-INF/jsp/index.jsp";
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

        String url = request.getServletPath();

        if (url.equals("/login")) {
            String nextPage = "/WEB-INF/jsp/paginaInicial.jsp";

            String username = request.getParameter("input-user");
            String password = request.getParameter("input-senha");

            // Verificar se os campos estão vazios
            if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
                nextPage = "/WEB-INF/jsp/index.jsp";
                request.setAttribute("errorMessage", "Por favor, preencha todos os campos.");
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
                dispatcher.forward(request, response);
                return;
            }

            // Se o usuário e a senha forem "admin", redirecione para outra página
            if (username.equals("admin") && password.equals("admin")) {
                response.sendRedirect("./homeAdmin"); // Substitua "outraPagina" pelo URL da página desejada
                return;
            }

            Usuario user = new Usuario();
            UsuarioDAO valida = new UsuarioDAO();

            user.setNome(username);
            user.setSenha(password);

            try {
                Usuario userAutenticado = valida.login(user);

                if (userAutenticado != null && !userAutenticado.getNome().isEmpty()) {
                    response.sendRedirect("./home");
                } else {
                    nextPage = "/WEB-INF/jsp/index.jsp";
                    request.setAttribute("errorMessage", "Nome ou senha inválidos");
                    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
                    dispatcher.forward(request, response);
                }
            } catch (Exception e) {
                nextPage = "/WEB-INF/jsp/index.jsp";
                request.setAttribute("errorMessage", "Nome ou senha inválidos");
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextPage);
                dispatcher.forward(request, response);
            }
        } else {
            processRequest(request, response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
