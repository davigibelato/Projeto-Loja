package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastar_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"../styles/cadastro.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/35f5de594d.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>Cadastro Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <main class=\"main\">\n");
      out.write("        <div class=\"container-login\">\n");
      out.write("            <h1 class=\"login-h1\">Login</h1>\n");
      out.write("\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("                <i class=\"fa-solid fa-user\" id=\"icone-user\"></i>\n");
      out.write("                <input type=\"text\" placeholder=\"Username\" id=\"input-user\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-field\">\n");
      out.write("                <i class=\"fa-solid fa-lock\" id=\"icone-senha\"></i>\n");
      out.write("                <input type=\"password\" placeholder=\"Password\" id=\"input-senha\">\n");
      out.write("            </div>\n");
      out.write("            <button class=\"btn-login\" onclick=\"verificacao()\">Login</button>\n");
      out.write("            <p>Se não possui cadastro <a href=\"pages/cadastro-page.html\">clique aqui</a></p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-img\">\n");
      out.write("            <img src=\"images/login_img02.png\" alt=\"\"/>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
