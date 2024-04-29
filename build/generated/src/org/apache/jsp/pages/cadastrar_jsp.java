package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastrar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"styles/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/35f5de594d.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <title>Cadastro Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <main class=\"main\">\r\n");
      out.write("        <div class=\"container-cadastrar\">\r\n");
      out.write("            <h1 class=\"Cadastrar-h1\">Cadastrar</h1>\r\n");
      out.write("            <div class=\"input-field\">\r\n");
      out.write("                <i class=\"fa-solid fa-user\" id=\"icone-user\"></i>\r\n");
      out.write("                <input type=\"text\" placeholder=\"Username\" id=\"input-user\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"input-field\">\r\n");
      out.write("                <i class=\"fa-solid fa-lock\" id=\"icone-senha\"></i>\r\n");
      out.write("                <input type=\"password\" placeholder=\"Password\" id=\"input-senha\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"input-field\">\r\n");
      out.write("                <i class=\"fa-solid fa-envelope\"></i>\r\n");
      out.write("                <input type=\"text\" placeholder=\"Email\" id=\"input-email\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"input-field\">\r\n");
      out.write("                <i class=\"fa-solid fa-key\"></i>\r\n");
      out.write("                <input type=\"text\" placeholder=\"Cpf\" id=\"input-cpf\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"input-field\">\r\n");
      out.write("                <i class=\"fa-solid fa-phone\"></i>\r\n");
      out.write("                <input type=\"text\" placeholder=\"Password\" id=\"phone\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <button class=\"btn-cadastrar\">Cadastrar</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container-img\">\r\n");
      out.write("            <img src=\"images/login_img02.png\" alt=\"\"/>\r\n");
      out.write("        </div>\r\n");
      out.write("    </main>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
