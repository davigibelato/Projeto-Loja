package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.BEAN.Produto;
import model.BEAN.Produto;

public final class homeAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/35f5de594d.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./styles/header.css\">\r\n");
      out.write("        <link href=\"./styles/paginaInicial.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/35f5de594d.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"./images/favicon.png\" type=\"image/x-icon\">\r\n");
      out.write("        <title>Gibelato Store</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container-1\">\r\n");
      out.write("            <nav id=\"nav\" class=\"navbar bg-body-tertiary\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"./homeAdmin\">Gibelato Store</a>\r\n");
      out.write("                    <form class=\"d-flex\" role=\"search\">\r\n");
      out.write("                        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("                        <button id=\"btn-search\" class=\"btn btn-outline-success\" type=\"submit\"><i class=\"fa-solid fa-magnifying-glass\"></i></button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <header class=\"header\">\r\n");
      out.write("            <div class=\"categorias\">\r\n");
      out.write("                <div class=\"dropdown\">\r\n");
      out.write("                    <button class=\"btn btn-secondary dropdown-toggle\" type=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                        <i class=\"fa-solid fa-list\"></i>Categorias\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"./masculino\"><i class=\"fa-solid fa-person\"></i>Masculino</a></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"./feminino\"><i class=\"fa-solid fa-person-dress\"></i>Feminino</a></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"./calcados\"><i class=\"fa-solid fa-shoe-prints\"></i>Calçados</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-light\"><i class=\"fa-solid fa-star\"></i> Destaques</button>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"dropdown\">\r\n");
      out.write("                    <button class=\"btn btn-secondary dropdown-toggle\" type=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                        <i class=\"fa-solid fa-cart-shopping\"></i>Carrinho\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"./masculino\"><i class=\"fa-solid fa-person\"></i>Masculino</a></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"./feminino\"><i class=\"fa-solid fa-person-dress\"></i>Feminino</a></li>\r\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"#\"><i class=\"fa-solid fa-shoe-prints\"></i>Calçados</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-light\"><i class=\"fa-solid fa-user\"></i> Minha conta</button>\r\n");
      out.write("                <a href=\"./cadastrarProduto\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-light\"><i class=\"fa-solid fa-star\"></i> Cadastrar Produto</button>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>    \r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <main class=\"main\">\r\n");
      out.write("            <div id=\"carouselExampleAutoplaying\" class=\"carousel slide\" data-bs-ride=\"carousel\">\r\n");
      out.write("                <div class=\"carousel-inner\">\r\n");
      out.write("                    <div class=\"carousel-item active\">\r\n");
      out.write("                        <img src=\"./images/slides.jpg\" alt=\"\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"carousel-item\">\r\n");
      out.write("                        <img src=\"./images/slide2.jpg\" alt=\"\"/>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"carousel-item\">\r\n");
      out.write("                        <img src=\"./images/slide3.jpg\" class=\"d-block w-100\" alt=\"...\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleAutoplaying\" data-bs-slide=\"prev\">\r\n");
      out.write("                    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("                    <span class=\"visually-hidden\">Previous</span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleAutoplaying\" data-bs-slide=\"next\">\r\n");
      out.write("                    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\r\n");
      out.write("                    <span class=\"visually-hidden\">Next</span>\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"title-novidades\">\r\n");
      out.write("                <h1>Novidades em Breve</h1>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"card-group\" id=\"group-card\">\r\n");
      out.write("                <div class=\"card\" id=\"cartoes\">\r\n");
      out.write("                    <img src=\"./images/Novidades/novidade-1.jpg\" alt=\"\"/>\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <h5 class=\"card-title\">BONÉ ABA CURVA STRUCTURED JOCKEY</h5>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <img src=\"./images/Novidades/novidade-2.jpg\" alt=\"\"/>\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <h5 class=\"card-title\">ÓCULOS MAG LOGO THRASHER PRETO BRANCO</h5>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <img src=\"./images/Novidades/novidade-3.jpg\" alt=\"\"/>\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <h5 class=\"card-title\">POCHETE RETRO BAW SPORT VINGATE</h5>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"h2-title\">\r\n");
      out.write("                <h2>Destaques</h2>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"destaques\">\r\n");
      out.write("                <div class=\"card-group-des\">\r\n");
      out.write("                    <!-- Iterar sobre a lista de produtos e exibir cada produto -->\r\n");
      out.write("                    ");
 for (Produto produto : (List<Produto>) request.getAttribute("produtos")) {
      out.write("\r\n");
      out.write("                    <div class=\"card\" style=\"width: 18rem;\" id=\"card-des\">\r\n");
      out.write("                        <div class=\"card-img\">\r\n");
      out.write("                            <img src=\"./images/Vans/vans-1.jpg\" class=\"card-img-top\" alt=\"...\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <h5 class=\"card-title\">");
      out.print( produto.getNome());
      out.write("</h5>\r\n");
      out.write("                            <p class=\"card-text\">Preço = $");
      out.print( produto.getValor());
      out.write("</p>\r\n");
      out.write("                            <a href=\"./produto?id=");
      out.print( produto.getIdProduto());
      out.write("\" class=\"btn btn-primary\">Comprar</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");
 }
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>  \r\n");
      out.write("        </main>\r\n");
      out.write("\r\n");
      out.write("        <footer class=\"footer\">\r\n");
      out.write("            <h3 class=\"h3-t\">Gibelato Store</h3>\r\n");
      out.write("            <p>Somos apaixonados por estilo urbano e autenticidade. Aqui, oferecemos uma seleção cuidadosamente curada das últimas tendências em streetwear, garantindo que você esteja sempre à frente no jogo da moda urbana. Explore nossa coleção e faça parte da nossa comunidade de indivíduos que definem seu próprio estilo. Junte-se a nós enquanto transformamos ruas em passarelas.</p>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"links\">\r\n");
      out.write("                <p><i class=\"fa-brands fa-instagram\"></i></p>\r\n");
      out.write("                <p><i class=\"fa-brands fa-twitter\"></i></p>\r\n");
      out.write("                <p><i class=\"fa-brands fa-tiktok\"></i></p>\r\n");
      out.write("                <p><i class=\"fa-brands fa-youtube\"></i></p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
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
