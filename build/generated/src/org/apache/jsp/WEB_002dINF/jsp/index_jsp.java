package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/35f5de594d.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/style.css\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\r\n");
      out.write("        <title>Login Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <main class=\"main\">\r\n");
      out.write("        <div class=\"container-login\">\r\n");
      out.write("            <h1 class=\"login-h1\">Login</h1>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"input-field\">\r\n");
      out.write("                <i class=\"fa-solid fa-user\" id=\"icone-user\"></i>\r\n");
      out.write("                <input type=\"text\" placeholder=\"Username\" id=\"input-user\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"input-field\">\r\n");
      out.write("                <i class=\"fa-solid fa-lock\" id=\"icone-senha\"></i>\r\n");
      out.write("                <input type=\"password\" placeholder=\"Password\" id=\"input-senha\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <button class=\"btn-login\" onclick=\"verificacao()\">Login</button>\r\n");
      out.write("            <p>Se não possui cadastro <a href=\"../../pages/cadastar.jsp\">clique aqui</a></p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"container-img\">\r\n");
      out.write("            <img src=\"images/login_img02.png\" alt=\"\"/>\r\n");
      out.write("            <a href=\"../../pages/cadastar.jsp\"></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </main>\r\n");
      out.write("    <script src=\"scripts/script.js\" type=\"text/javascript\"></script>\r\n");
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
