package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import connection.Config;
import java.sql.*;
import connection.Config;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/header1.jsp");
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>CodeShare</title>\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/favicon1.ico\"/>\n");
      out.write("<link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"assets/css/bootstrap-responsive.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"assets/js/jquery.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"assets/js/jquery-1.7.1.min.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"assets/js/bootstrap-button.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"assets/js/jquery.validate.min.js\"></script>\n");
      out.write("                <script type=\"text/javascript\" src=\"assets/js/bootstrap-tab.js\"></script>\n");
      out.write("                <script type=\"text/javascript\" src=\"assets/js/bootstrap-carousel.js\"></script>\n");
      out.write("                <script type=\"text/javascript\" src=\"assets/js/bootstrap-dropdown.js\"></script>\n");
      out.write("                <script src=\"assets/js/bootstrap-collapse.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("                <script src=\"assets/js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("                <script type=\"text/javascript\" src=\"script1.js\"></script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("         .navbar-inner{\n");
      out.write("\t\t\t background:#000;\n");
      out.write("\t\t\t border-bottom:5px solid #007AF4;\n");
      out.write("\t\t\t height:70px;\n");
      out.write("\n");
      out.write("\t\t\t }\n");
      out.write("\t\t\t.navbar-inner .brand{color:#FFF}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  ");

    String User =(String) session.getAttribute("username");
//    out.print(User);
    if(User != null)
               {
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

           String uname = (String)session.getAttribute("username");
            
      out.write("\n");
      out.write("<link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"assets/css/bootstrap-responsive.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<style type=\"text/css\">\n");
      out.write("         .navbar-inner{\n");
      out.write("\t\t\t background:#000;\n");
      out.write("\t\t\t border-bottom:5px solid #007AF4;\n");
      out.write("\t\t\t height:70px;\n");
      out.write("\n");
      out.write("\t\t\t }\n");
      out.write("\t\t\t.navbar-inner .brand{color:#FFF}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("<div class=\"navbar\">\n");
      out.write("<div class=\"navbar-inner\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"span5\">\n");
      out.write("<a href=\"index.jsp\" class=\"brand\"> <img src=\"./assets/img/logo.png\" alt=\"CodeShare\" width=\"100px\" height=\"70px\"/></a>\n");
      out.write("<br/>\n");
      out.write("<h1 class=\"brand\" style=\"font-weight:bold;\">CodeShare</h1>\n");
      out.write("        </div>\n");
      out.write("        <br/>\n");
      out.write("       <form action=\"logout\" method=\"post\" class=\"pull-right\">\n");
      out.write("<button class=\"btn btn-primary \" > logout </button>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("        <br/>\n");
      out.write("\n");
      out.write("        <div class=\"pull-right\" style=\"color:white;\">\n");
      out.write("            <b> Welcome</b>\n");
      out.write("            <a href=\"profile.jsp\" style=\"color:white;\">\n");
      out.write("            ");

             if(uname!=null)
           
            {
                   out.println("<b>"+uname+"</b>");
            }
           


      out.write("\n");
      out.write("</a>\n");
      out.write("\n");
      out.write("&nbsp;&nbsp;\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("        ");
  }
                else
                {
      out.write("\n");
      out.write("                 ");
      out.write("<html>\n");
      out.write("<link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"assets/css/bootstrap-responsive.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("         .navbar-inner{\n");
      out.write("\t\t\t background:#000;\n");
      out.write("\t\t\t border-bottom:5px solid #007AF4;\n");
      out.write("\t\t\t height:70px;\n");
      out.write("\n");
      out.write("\t\t\t }\n");
      out.write("\t\t\t.navbar-inner .brand{color:#FFF}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("<div class=\"navbar\">\n");
      out.write("<div class=\"navbar-inner\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"span5\">\n");
      out.write("<a href=\"index.jsp\" class=\"brand\"> <img src=\"./assets/img/logo.png\" alt=\"CodeShare\" width=\"100px\" height=\"70px\"/></a>\n");
      out.write("<br/>\n");
      out.write("<h1 class=\"brand\" style=\"font-weight:bold;\">CodeShare</h1>\n");
      out.write("        </div>\n");
      out.write("        <br/>\n");
      out.write("        <div class=\"pull-right\">\n");
      out.write("             <a class=\"btn btn-primary btn-block btn-lg \" href=\"./login.jsp\" style=\"color:white;font-weight: bold;text-decoration: none;\">Login</a>\n");
      out.write("  <a class=\"btn btn-primary btn-block btn-lg \" href=\"./register.jsp\" style=\"color:white;font-weight: bold;text-decoration: none;\">Register</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("                 ");
 }
   
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container well\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("<form action=\"search.jsp\" class=\"form-search pull-right\">\n");
      out.write("\n");
      out.write("                                <select  class=\"input-append\" name=\"resources\">\n");
      out.write("                                    <option value=\"own\">OWN</option>\n");
      out.write("                                    <option value=\"spoj\">SPOJ</option>\n");
      out.write("                                    <option value=\"codechef\">CODECHEF</option>\n");
      out.write("                                    <option value=\"codeforces\">CODEFORCES</option>\n");
      out.write("                                    <option value=\"topcoder\">TOPCODER</option>\n");
      out.write("                                    <option value=\"timus\">TIMUS</option>\n");
      out.write("                                    <option value=\"acmicpc\">ACMICPC</option>\n");
      out.write("                                    <option value=\"uva\">UVA</option>\n");
      out.write("                                    <option value=\"codejam\">CODEJAM</option>\n");
      out.write("                                    <option value=\"livearchive\">LIVEARCHIVE</option>\n");
      out.write("                                    <option value=\"other\">OTHER</option>\n");
      out.write("                            </select>\n");
      out.write("\t<input type=\"text\" name=\"searchbox\" class=\"span3 search\" placeholder=\"Search...\"/>\n");
      out.write("\t<button class=\"btn\">Search</button>\n");
      out.write("</form><br/>\n");
      out.write("        <div class=\"span3\">\n");
      out.write("            <ul class=\"nav nav-tabs nav-stacked nav-justified\"  style='background-color:white;font-weight:bold;'>\n");
      out.write("                    <li>\n");
      out.write("                    <a href=\"index.jsp\">HOME</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                    <a href=\"#tutorials\" data-toggle=\"tab\">TUTORIALS</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                    <a href=\"#spoj\" data-toggle=\"tab\">SPOJ</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                    <a href=\"#codechef\" data-toggle=\"tab\">CODECHEF</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                    <a href=\"#topcoder\" data-toggle=\"tab\">TOPCODER</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                    <a href=\"#codeforces\" data-toggle=\"tab\">CODEFORCES</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                    <a href=\"#uva\" data-toggle=\"tab\">UVA</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                    <a href=\"#livearchive\" data-toggle=\"tab\">LIVE ARCHIVE</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                    <a href=\"#timus\" data-toggle=\"tab\">TIMUS</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                    <a href=\"#projecteuler\" data-toggle=\"tab\">PROJECT EULER</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                    <a href=\"#codejam\" data-toggle=\"tab\">CODEJAM</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                    <a href=\"#acmicpc\" data-toggle=\"tab\">ACM-ICPC</a>\n");
      out.write("                    </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("   <div id=\"maincontent\" class=\"span9\">\n");
      out.write("            <div id=\"myTabContent\" class=\"tab-content\" style=\"border:2px solid #a1a1a1;border-radius:10px;\">\n");
      out.write(" <div id=\"home\" class=\"tab-pane fade in active\">\n");
      out.write("<div class=\"span8\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <center>    <img src=\"./assets/img/frontback3.png\" alt=\"CodeShare\" height=\"500px\" width=\"600px\"/>  </center>\n");
      out.write("            <p style=\"text-align: justify;font-weight: bold;font-size:20px;color:#808080;line-height: 25px;\"  >\n");
      out.write("            Welcome to the CodeShare   \n");
      out.write("            </p>\n");
      out.write("            <p style=\"text-align: justify;font-weight: bold;font-size:20px;color:#808080;line-height: 25px;\">\n");
      out.write("            <bold style=\"color:black;\">CodeShare</bold> is a type of web application where anyone can share codes in any programming language and add any programming question for discussion . This type of website is mainly used by programmers to store pieces of source code or configuration information. The idea behind CodeShare is to make it more convenient for people to share large amounts of codes online.\n");
      out.write("            </p>\n");
      out.write("            <p style=\"text-align: justify;font-weight: bold;font-size:20px;color:#808080;line-height: 25px;\"  >\n");
      out.write("            For Viewing the solutions and Comment/Discuss , a user must Register on CodeShare.\n");
      out.write("            </p>\n");
      out.write("            </div>\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("<div id=\"spoj\" class=\"tab-pane\"  style=\"padding:20px 10px;\">\n");
      out.write("\n");
      out.write("    ");

        Config c = new Config();
        Connection con = c.getcon();
        Statement st = con.createStatement();
        String qry = "SELECT * FROM spoj";
        ResultSet rs = st.executeQuery(qry);
        int i = 0;
     
      out.write("\n");
      out.write("        <table class='table'>\n");
      out.write("            <tr style=\"font-weight: bold;\">\n");
      out.write("                    <td>S No.</td>\n");
      out.write("                    <td>Problem Code</td>\n");
      out.write("                    <td>Problem Name</td>\n");
      out.write("                    <td>Category</td>\n");
      out.write("\n");
      out.write("           </tr>\n");
      out.write("     ");

        while(rs.next() && i<=19)
        {
            i++;
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                     ");
      out.print(i);
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(rs.getString("problemcode"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       <a href=\"previewproblem.jsp?id=");
      out.print(rs.getString("problemcode"));
      out.write("&res=spoj\"  > ");
      out.print(rs.getString("problemname"));
      out.write(" </a>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       ");
      out.print(rs.getString("category"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("           \n");
      out.write("\n");
      out.write("\n");

        }
       

      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("          <a class=\"btn btn-default btn-block btn-lg pull-right\" href=\"./viewmore.jsp?id=1&res=spoj\" style=\"color:#808080;font-weight: bold;text-decoration: none;\">View more...</a>\n");
      out.write("          <br/>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"codechef\" class=\"tab-pane\"  style=\"padding:20px 10px;\">\n");
      out.write("\n");
      out.write("    ");


        st = con.createStatement();
        qry = "SELECT * FROM codechef";
        rs = st.executeQuery(qry);
        i = 0;
     
      out.write("\n");
      out.write("        <table class='table'>\n");
      out.write("            <tr style=\"font-weight: bold;\">\n");
      out.write("                    <td>S No.</td>\n");
      out.write("                    <td>Problem Code</td>\n");
      out.write("                    <td>Problem Name</td>\n");
      out.write("                    <td>Category</td>\n");
      out.write("\n");
      out.write("           </tr>\n");
      out.write("     ");

        while(rs.next() && i<=19)
        {
            i++;
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                     ");
      out.print(i);
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(rs.getString("problemcode"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       <a href=\"previewproblem.jsp?id=");
      out.print(rs.getString("problemcode"));
      out.write("&res=codechef\"  > ");
      out.print(rs.getString("problemname"));
      out.write(" </a>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       ");
      out.print(rs.getString("category"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

        }


      out.write("\n");
      out.write("        </table>\n");
      out.write("  <a class=\"btn btn-default btn-block btn-lg pull-right\" href=\"./viewmore.jsp?id=1&res=codechef\" style=\"color:#808080;font-weight: bold;text-decoration: none;\">View more...</a>\n");
      out.write("  <br/>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"codeforces\" class=\"tab-pane \" style=\"padding:20px 10px;\">\n");
      out.write("\n");
      out.write("    ");


        st = con.createStatement();
        qry = "SELECT * FROM codeforces";
        rs = st.executeQuery(qry);
        i = 0;
     
      out.write("\n");
      out.write("        <table class='table'>\n");
      out.write("            <tr style=\"font-weight: bold;\">\n");
      out.write("                    <td>S No.</td>\n");
      out.write("                    <td>Problem Code</td>\n");
      out.write("                    <td>Problem Name</td>\n");
      out.write("                    <td>Category</td>\n");
      out.write("\n");
      out.write("           </tr>\n");
      out.write("     ");

        while(rs.next() && i<=19)
        {
            i++;
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                     ");
      out.print(i);
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(rs.getString("problemcode"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       <a href=\"previewproblem.jsp?id=");
      out.print(rs.getString("problemcode"));
      out.write("&res=codeforces\"  > ");
      out.print(rs.getString("problemname"));
      out.write(" </a>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       ");
      out.print(rs.getString("category"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

        }


      out.write("\n");
      out.write("        </table>\n");
      out.write("  <a class=\"btn btn-default btn-block btn-lg pull-right\" href=\"./viewmore.jsp?id=1&res=codeforces\" style=\"color:#808080;font-weight: bold;text-decoration: none;\">View more...</a>\n");
      out.write("  <br/>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"topcoder\" class=\"tab-pane\"  style=\"padding:20px 10px;\">\n");
      out.write("\n");
      out.write("    ");


        st = con.createStatement();
        qry = "SELECT * FROM topcoder";
        rs = st.executeQuery(qry);
        i = 0;
     
      out.write("\n");
      out.write("        <table class='table'>\n");
      out.write("            <tr style=\"font-weight: bold;\">\n");
      out.write("                    <td>S No.</td>\n");
      out.write("                    <td>Problem Code</td>\n");
      out.write("                    <td>Problem Name</td>\n");
      out.write("                    <td>Category</td>\n");
      out.write("\n");
      out.write("           </tr>\n");
      out.write("     ");

        while(rs.next() && i<=19)
        {
            i++;
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                     ");
      out.print(i);
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(rs.getString("problemcode"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       <a href=\"previewproblem.jsp?id=");
      out.print(rs.getString("problemcode"));
      out.write("&res=topcoder\"  > ");
      out.print(rs.getString("problemname"));
      out.write(" </a>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       ");
      out.print(rs.getString("category"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

        }


      out.write("\n");
      out.write("        </table>\n");
      out.write("  <a class=\"btn btn-default btn-block btn-lg pull-right\" href=\"./viewmore.jsp?id=1&res=topcoder\" style=\"color:#808080;font-weight: bold;text-decoration: none;\">View more...</a>\n");
      out.write("  <br/>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"projecteuler\" class=\"tab-pane\"  style=\"padding:20px 10px;\">\n");
      out.write("\n");
      out.write("    ");


        st = con.createStatement();
        qry = "SELECT * FROM projecteuler";
        rs = st.executeQuery(qry);
        i = 0;
     
      out.write("\n");
      out.write("        <table class='table'>\n");
      out.write("            <tr style=\"font-weight: bold;\">\n");
      out.write("                    <td>S No.</td>\n");
      out.write("                    <td>Problem Code</td>\n");
      out.write("                    <td>Problem Name</td>\n");
      out.write("                    <td>Category</td>\n");
      out.write("\n");
      out.write("           </tr>\n");
      out.write("     ");

        while(rs.next() && i<=19)
        {
            i++;
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                     ");
      out.print(i);
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(rs.getString("problemcode"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       <a href=\"previewproblem.jsp?id=");
      out.print(rs.getString("problemcode"));
      out.write("&res=projecteuler\"  > ");
      out.print(rs.getString("problemname"));
      out.write(" </a>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       ");
      out.print(rs.getString("category"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

        }


      out.write("\n");
      out.write("        </table>\n");
      out.write("  <a class=\"btn btn-default btn-block btn-lg pull-right\" href=\"./viewmore.jsp?id=1&res=projecteuler\" style=\"color:#808080;font-weight: bold;text-decoration: none;\">View more...</a>\n");
      out.write("  <br/>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <div id=\"codejam\" class=\"tab-pane\"  style=\"padding:20px 10px;\">\n");
      out.write("\n");
      out.write("    ");


        st = con.createStatement();
        qry = "SELECT * FROM codejam";
        rs = st.executeQuery(qry);
        i = 0;
     
      out.write("\n");
      out.write("        <table class='table'>\n");
      out.write("            <tr style=\"font-weight: bold;\">\n");
      out.write("                    <td>S No.</td>\n");
      out.write("                    <td>Problem Code</td>\n");
      out.write("                    <td>Problem Name</td>\n");
      out.write("                    <td>Category</td>\n");
      out.write("\n");
      out.write("           </tr>\n");
      out.write("     ");

        while(rs.next() && i<=19)
        {
            i++;
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                     ");
      out.print(i);
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(rs.getString("problemcode"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       <a href=\"previewproblem.jsp?id=");
      out.print(rs.getString("problemcode"));
      out.write("&res=codejam\"  > ");
      out.print(rs.getString("problemname"));
      out.write(" </a>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       ");
      out.print(rs.getString("category"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

        }


      out.write("\n");
      out.write("        </table>\n");
      out.write("  <a class=\"btn btn-default btn-block btn-lg pull-right\" href=\"./viewmore.jsp?id=1&res=codejam\" style=\"color:#808080;font-weight: bold;text-decoration: none;\">View more...</a>\n");
      out.write("  <br/>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"acmicpc\" class=\"tab-pane\"  style=\"padding:20px 10px;\">\n");
      out.write("\n");
      out.write("    ");


        st = con.createStatement();
        qry = "SELECT * FROM acmicpc";
        rs = st.executeQuery(qry);
        i = 0;
     
      out.write("\n");
      out.write("        <table class='table'>\n");
      out.write("            <tr style=\"font-weight: bold;\">\n");
      out.write("                    <td>S No.</td>\n");
      out.write("                    <td>Problem Code</td>\n");
      out.write("                    <td>Problem Name</td>\n");
      out.write("                    <td>Category</td>\n");
      out.write("\n");
      out.write("           </tr>\n");
      out.write("     ");

        while(rs.next() && i<=19)
        {
            i++;
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                     ");
      out.print(i);
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(rs.getString("problemcode"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       <a href=\"previewproblem.jsp?id=");
      out.print(rs.getString("problemcode"));
      out.write("&res=acmicpc\"  > ");
      out.print(rs.getString("problemname"));
      out.write(" </a>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       ");
      out.print(rs.getString("category"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

        }


      out.write("\n");
      out.write("        </table>\n");
      out.write("  <a class=\"btn btn-default btn-block btn-lg pull-right\" href=\"./viewmore.jsp?id=1&res=acmicpc\" style=\"color:#808080;font-weight: bold;text-decoration: none;\">View more...</a>\n");
      out.write("  <br/>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <div id=\"uva\" class=\"tab-pane\"  style=\"padding:20px 10px;\">\n");
      out.write("\n");
      out.write("    ");


        st = con.createStatement();
        qry = "SELECT * FROM uva";
        rs = st.executeQuery(qry);
        i = 0;
     
      out.write("\n");
      out.write("        <table class='table'>\n");
      out.write("            <tr style=\"font-weight: bold;\">\n");
      out.write("                    <td>S No.</td>\n");
      out.write("                    <td>Problem Code</td>\n");
      out.write("                    <td>Problem Name</td>\n");
      out.write("                    <td>Category</td>\n");
      out.write("\n");
      out.write("           </tr>\n");
      out.write("     ");

        while(rs.next() && i<=19)
        {
            i++;
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                     ");
      out.print(i);
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(rs.getString("problemcode"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       <a href=\"previewproblem.jsp?id=");
      out.print(rs.getString("problemcode"));
      out.write("&res=uva\"  > ");
      out.print(rs.getString("problemname"));
      out.write(" </a>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       ");
      out.print(rs.getString("category"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

        }


      out.write("\n");
      out.write("        </table>\n");
      out.write("  <a class=\"btn btn-default btn-block btn-lg pull-right\" href=\"./viewmore.jsp?id=1&res=uva\" style=\"color:#808080;font-weight: bold;text-decoration: none;\">View more...</a>\n");
      out.write("  <br/>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"timus\" class=\"tab-pane\"  style=\"padding:20px 10px;\">\n");
      out.write("\n");
      out.write("    ");


        st = con.createStatement();
        qry = "SELECT * FROM timus";
        rs = st.executeQuery(qry);
        i = 0;
     
      out.write("\n");
      out.write("        <table class='table'>\n");
      out.write("            <tr style=\"font-weight: bold;\">\n");
      out.write("                    <td>S No.</td>\n");
      out.write("                    <td>Problem Code</td>\n");
      out.write("                    <td>Problem Name</td>\n");
      out.write("                    <td>Category</td>\n");
      out.write("\n");
      out.write("           </tr>\n");
      out.write("     ");

        while(rs.next() && i<=19)
        {
            i++;
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                     ");
      out.print(i);
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(rs.getString("problemcode"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       <a href=\"previewproblem.jsp?id=");
      out.print(rs.getString("problemcode"));
      out.write("&res=timus\"  > ");
      out.print(rs.getString("problemname"));
      out.write(" </a>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       ");
      out.print(rs.getString("category"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

        }


      out.write("\n");
      out.write("        </table>\n");
      out.write("  <a class=\"btn btn-default btn-block btn-lg pull-right\" href=\"./viewmore.jsp?id=1&res=timus\" style=\"color:#808080;font-weight: bold;text-decoration: none;\">View more...</a>\n");
      out.write("  <br/>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"livearchive\" class=\"tab-pane\"  style=\"padding:20px 10px;\">\n");
      out.write("\n");
      out.write("    ");


        st = con.createStatement();
        qry = "SELECT * FROM livearchive  ";
        rs = st.executeQuery(qry);
        i = 0;
     
      out.write("\n");
      out.write("        <table class='table'>\n");
      out.write("            <tr style=\"font-weight: bold;\">\n");
      out.write("                    <td>S No.</td>\n");
      out.write("                    <td>Problem Code</td>\n");
      out.write("                    <td>Problem Name</td>\n");
      out.write("                    <td>Category</td>\n");
      out.write("\n");
      out.write("           </tr>\n");
      out.write("     ");

        while(rs.next() && i<=19)
        {
            i++;
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                     ");
      out.print(i);
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        ");
      out.print(rs.getString("problemcode"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       <a href=\"previewproblem.jsp?id=");
      out.print(rs.getString("problemcode"));
      out.write("&res=livearchive\"  > ");
      out.print(rs.getString("problemname"));
      out.write(" </a>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                       ");
      out.print(rs.getString("category"));
      out.write("\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

        }


      out.write("\n");
      out.write("        </table>\n");
      out.write("  <a class=\"btn btn-default btn-block btn-lg pull-right\" href=\"./viewmore.jsp?id=1&res=livearchive\" style=\"color:#808080;font-weight: bold;text-decoration: none;\">View more...</a>\n");
      out.write("  <br/>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("   </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<br/><br/><br/>\n");
      out.write("\n");
      out.write("  ");
      out.write("<div class=\"footer\">       \n");
      out.write("<div class=\"navbar navbar-fixed-bottom\">\n");
      out.write("                      <div class=\"navbar-inner\" style=\"background:#000;\n");
      out.write("\t\t\t border-bottom:0px;\">\n");
      out.write("           <center style=\"color:white\"><a href=\"#myModal3\"  data-toggle=\"modal\" ><b>Contact Us</b></a> || <a href=\"#myModal\" data-toggle=\"modal\"><b>Feedback</b></a></center>\n");
      out.write("        <center style=\"color: white\">Copyright &copy; 2013 CodeShare, All rights reserved Disclaimer</center>\n");
      out.write("        <center style=\"color: white\">The website is at its BETA phase. Please help us to improve the website by giving your feedback.</center>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("       </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"myModal\" class=\"modal hide fade\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\" style=\"height: 800px; width: 700px\">\n");
      out.write("<div class=\"modal-header\">\n");
      out.write("<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">X</button>\n");
      out.write("<h3 id=\"myModalLabel\">Feedback form</h3>\n");
      out.write("</div>\n");
      out.write("<div class=\"modal-body\">\n");
      out.write(" <form action=\"feedback\" id=\"contact-form2\" class=\"form-horizontal\" method=\"post\">\n");
      out.write("\n");
      out.write("                                                      <div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t      <label class=\"control-label\" for=\"fname\">Name</label>\n");
      out.write("\t\t\t\t\t\t      <div class=\"controls\">\n");
      out.write("\n");
      out.write("                                                        <input type=\"text\" class=\"input-large span5\" name=\"fname\"  required id=\"fname\" placeholder=\"Name\" onkeyup=\"loadXMLDoc()\"/>\n");
      out.write("                                                              <span id=\"err\"> </span>\n");
      out.write("\n");
      out.write("                                                      </div>\n");
      out.write("\t\t\t\t\t\t    </div>\n");
      out.write("                                                    <div class=\"control-group\">\n");
      out.write("                                                      <label class=\"control-label\" for=\"email\">Email Address</label>\n");
      out.write("                                                      <div class=\"controls\">\n");
      out.write("                                                       <input type=\"email\" class=\"input-large span5\" name=\"email\" required id=\"email\" placeholder=\"Email address\"/>\n");
      out.write("                                                       </div>\n");
      out.write("                                                    </div>\n");
      out.write("\t\t\t\t\t\t    <div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t      <label class=\"control-label\" for=\"number\">Mobile No.</label>\n");
      out.write("\t\t\t\t\t\t      <div class=\"controls\">\n");
      out.write("                                                <input type=\"text\" class=\"input-large span5\" name=\"number\" id=\"number\" required maxlength=\"10\" placeholder=\"Mobile number\"/>\n");
      out.write("\t\t\t\t\t           </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                     <div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t      <label class=\"control-label\" for=\"comment\">Comment</label>\n");
      out.write("\t\t\t\t\t\t      <div class=\"controls\">\n");
      out.write("                                                        <textarea required=\"true\" class=\"form-control span5\" name=\"comment\" id=\"comment\" rows=\"8\" placeholder=\"Put youe Comment......\" required=\"true\">\n");
      out.write("                                                        </textarea>\n");
      out.write("                                                        <span id=\"err\"> </span>\n");
      out.write("                                                        </div>\n");
      out.write("\t\t\t\t\t\t    </div>\n");
      out.write("           <div class=\"control-group\">\n");
      out.write("                                                      <label class=\"control-label\"></label>\n");
      out.write("                                                      <div class=\"controls\">\n");
      out.write("                                                      <button type=\"submit\" class=\"btn btn-success btn-large\" data-loading-text=\"Loading...\">Send</button>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                                </div>\n");
      out.write("      </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"myModal3\" class=\"modal hide fade\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-header\">\n");
      out.write("    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">X</button>\n");
      out.write("    <h3 id=\"myModalLabel\">Contact Us</h3>\n");
      out.write("    </div>\n");
      out.write("    <div align=\"center\" class=\"modal-body lead\" style='color:#808080 ;font-weight: bold;' >\n");
      out.write("   \n");
      out.write("        <p>\n");
      out.write("            Abdul Qadir Faridi </p>\n");
      out.write("        <p>\n");
      out.write("            Email : <a href=\"mailto:aqfaridi@gmail.com\">aqfaridi@gmail.com</a>  </p>\n");
      out.write("         <p>\n");
      out.write("            Mobile : +91 7566062327  </p>\n");
      out.write("         <br />\n");
      out.write("        <p>    Pankaj Chaudhary </p>\n");
      out.write("        <p>\n");
      out.write("            Email : <a href=\"mailto:pankaj9310@gmail.com\">pankaj9310@gmail.com</a> </p>\n");
      out.write("        <p>\n");
      out.write("            Mobile : +91 8989931101 </p>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}