package org.apache.jsp.ap;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.PrintWriter;

public final class adminprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/ap/../footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title></title>\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"assets/img/favicon.ico\"/>\n");
      out.write("<link href=\"../assets/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"../assets/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"../assets/css/bootstrap-responsive.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"../assets/js/jquery.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"../assets/js/jquery-1.7.1.min.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"../assets/js/bootstrap-button.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"../assets/js/jquery.validate.min.js\"></script>\n");
      out.write("                <script type=\"text/javascript\" src=\"../assets/js/bootstrap-tab.js\"></script>\n");
      out.write("                <script type=\"text/javascript\" src=\"../assets/js/bootstrap-carousel.js\"></script>\n");
      out.write("                <script type=\"text/javascript\" src=\"../assets/js/bootstrap-dropdown.js\"></script>\n");
      out.write("                <script type=\"text/javascript\" src=\"../assets/js/bootstrap.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"../script1.js\"></script>\n");
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
      out.write("\n");
      out.write("<div class=\"navbar\">\n");
      out.write("<div class=\"navbar-inner\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("<a href=\"#\" class=\"brand\"> <img src=\"../assets/img/logo.png\" alt=\"CodeShare\" width=\"100px\" height=\"70px\"/></a>\n");
      out.write("<br/>\n");
      out.write("<h1 class=\"brand\" style=\"font-weight:bold;\">Admin Panel</h1>\n");
      out.write("<form action=\"logout\" method=\"post\" class=\"pull-right\">\n");
      out.write("<button class=\"btn btn-primary\" > logout </button>\n");
      out.write("</form>\n");
      out.write("<p class=\"pull-right\" style=\"color:white;\">\n");
      out.write("<br />\n");

 

            String uname = (String)session.getAttribute("user");
             if(uname==null)
                {
                    response.sendRedirect("adminpanel.jsp");
                }
            else
            {
                   out.println("<b> Welcome , "+uname+"</b>");
            }

   

      out.write("\n");
      out.write("&nbsp;&nbsp;\n");
      out.write("\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"container well\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("\n");
      out.write("        <div class=\"span2\">\n");
      out.write("            <ul class=\"nav nav-tabs nav-stacked nav-justified\"  style='background-color:white;'>\n");
      out.write("                    <li class=\"active\">\n");
      out.write("                    <a href=\"#\" data-toggle=\"tab\">Admin Home</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                    <a href=\"#student\" data-toggle=\"tab\">Student Detail</a>\n");
      out.write("                    </li>\n");
      out.write("                     <li>\n");
      out.write("                    <a href=\"#faculty\" data-toggle=\"tab\">Faculty Detail</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                    <a href=\"#subject\" data-toggle=\"tab\">Subject Detail</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                    <a href=\"#changepass\" data-toggle=\"tab\">Change Password</a>\n");
      out.write("                    </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("   <div id=\"maincontent\" class=\"span7 pull-right\" >\n");
      out.write("            <div id=\"myTabContent\" class=\"tab-content\">\n");
      out.write("<div id=\"student\" class=\"tab-pane\n");
      out.write("\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("     \">\n");
      out.write("\n");
      out.write("\n");
      out.write(" ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("   ");

                                Connection con=null;
                                Statement st=null;
                                ResultSet rs=null;
                                try
                                {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examshow","root","root");
                                    st=con.createStatement();

             String studentid="";
             String q="select * from student";
              st=con.createStatement();
             rs=st.executeQuery(q);

      out.write("\n");
      out.write(" <div class=\"modal-header\">\n");
      out.write("                    <h3 id=\"myModalLabel\"><center>Student Details.</center></h3>\n");
      out.write("</div>\n");
      out.write(" <table class=\" table table-bordered\">\n");
      out.write("\n");
      out.write("     <tr>\n");
      out.write("         <td><strong>Student ID</strong></td>\n");
      out.write("         <td><strong>Student Name</strong></td>\n");
      out.write("                        <td><strong>Email</strong></td>\n");
      out.write("                        <td><strong>Mobile</strong> </td>\n");
      out.write("                        <td colspan=\"2\">Delete Student</td>\n");
      out.write("                    </tr>\n");
      out.write("     ");

             while(rs.next())
             {
             
      out.write("\n");
      out.write("\n");
      out.write("             <tr><td>\n");
      out.write("\n");
      out.write("                     ");

out.print(rs.getString("studentid"));

      out.write("\n");
      out.write("                 </td>\n");
      out.write("                 <td>\n");
      out.write("\n");
      out.write("                     ");

out.print(rs.getString("studentname"));

      out.write("\n");
      out.write("                 </td>\n");
      out.write("                 <td>\n");
      out.write("\n");
      out.write("                     ");

out.print(rs.getString("email"));

      out.write("\n");
      out.write("\n");
      out.write(" </td><td>\n");
      out.write("\n");
      out.write("                     ");

out.print(rs.getString("mobile"));

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                 </td>\n");
      out.write("\n");
      out.write("              <td><i class=\"icon-remove\"></i><a href=\"delete?user=");
 out.print(rs.getString("studentid"));
      out.write("&who=student\">Delete</a>\n");
      out.write("              </td></tr>\n");
      out.write("\n");
      out.write("             ");
 }
                 
      out.write("\n");
      out.write("                </table>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("\n");
      out.write("                                ");
 
                                }
                                catch(Exception e){}
                  
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"faculty\" class=\"tab-pane \n");
      out.write("  ");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("     \">\n");
      out.write(" ");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("   ");

                         
                                try
                                {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examshow","root","root");
                                    st=con.createStatement();

             String studentid="";
             String q="select * from faculty";
              st=con.createStatement();
             rs=st.executeQuery(q);

      out.write("\n");
      out.write(" <div class=\"modal-header\">\n");
      out.write("                    <h3 id=\"myModalLabel\"><center>Faculty Details.</center></h3>\n");
      out.write("</div>\n");
      out.write(" <table class=\" table table-bordered\">\n");
      out.write("\n");
      out.write("     <tr>\n");
      out.write("         <td><strong>Faculty ID</strong></td>\n");
      out.write("         <td><strong>Faculty Name</strong></td>\n");
      out.write("                        <td><strong>Email</strong></td>\n");
      out.write("                        <td><strong>Phone</strong> </td>\n");
      out.write("                        <td colspan=\"2\"> Delete Faculty</td>\n");
      out.write("                    </tr>\n");
      out.write("     ");

             while(rs.next())
             {
             
      out.write("\n");
      out.write("\n");
      out.write("             <tr><td>\n");
      out.write("\n");
      out.write("                     ");

out.print(rs.getString("facultyid"));

      out.write("\n");
      out.write("                 </td>\n");
      out.write("                 <td>\n");
      out.write("\n");
      out.write("                     ");

out.print(rs.getString("facultyname"));

      out.write("\n");
      out.write("                 </td>\n");
      out.write("                 <td>\n");
      out.write("\n");
      out.write("                     ");

out.print(rs.getString("email"));

      out.write("\n");
      out.write("\n");
      out.write(" </td><td>\n");
      out.write("\n");
      out.write("                     ");

out.print(rs.getString("mobile"));

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                 </td>\n");
      out.write("\n");
      out.write("              <td><i class=\"icon-remove\"></i><a href=\"delete?user=");
 out.print(rs.getString("facultyid"));
      out.write("&who=faculty\">Delete</a>\n");
      out.write("              </td></tr>\n");
      out.write("\n");
      out.write("             ");
 }
                 
      out.write("\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                ");

                                }
                                catch(Exception e){}
                  
      out.write("\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"subject\" class=\"tab-pane\n");
      if (_jspx_meth_c_005fif_005f4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\">\n");
      out.write(" ");
      if (_jspx_meth_c_005fif_005f5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("   ");


                                try
                                {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/examshow","root","root");
                                    st=con.createStatement();

             String studentid="";
             String q="select * from subjects";
              st=con.createStatement();
             rs=st.executeQuery(q);

      out.write("\n");
      out.write(" <div class=\"modal-header\">\n");
      out.write("                    <h3 id=\"myModalLabel\"><center>Subject Details.</center></h3>\n");
      out.write("</div>\n");
      out.write(" <table class=\" table table-bordered\">\n");
      out.write("\n");
      out.write("     <tr>\n");
      out.write("         <td><strong>Subject Code</strong></td>\n");
      out.write("         <td><strong>Subject Name</strong></td>\n");
      out.write("                        <td colspan=\"2\"> Delete Subject</td>\n");
      out.write("                    </tr>\n");
      out.write("     ");

             while(rs.next())
             {
             
      out.write("\n");
      out.write("\n");
      out.write("             <tr><td>\n");
      out.write("\n");
      out.write("                     ");

out.print(rs.getString("subjectcode"));

      out.write("\n");
      out.write("                 </td>\n");
      out.write("                 <td>\n");
      out.write("\n");
      out.write("                     ");

out.print(rs.getString("subjectname"));

      out.write("\n");
      out.write("                 </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("              <td><i class=\"icon-remove\"></i><a href=\"delete?user=");
 out.print(rs.getString("subjectcode"));
      out.write("&who=subject\">Delete</a>\n");
      out.write("              </td></tr>\n");
      out.write("\n");
      out.write("             ");
 }
                 
      out.write("\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                ");

                                }
                                catch(Exception e){}
                  
      out.write("\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <div id=\"changepass\" class=\"tab-pane \n");
      out.write("\n");
      if (_jspx_meth_c_005fif_005f6(_jspx_page_context))
        return;
      out.write('\n');
      out.write(' ');
      if (_jspx_meth_c_005fif_005f7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \">\n");
      out.write("<form  action ='");
      out.print( response.encodeURL("adminpasschange") );
      out.write("' id=\"contact-form4\" class=\"form-horizontal\" method=\"post\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t    <div class=\"control-group\">\n");
      out.write("\t\t\t\t\t\t      <label class=\"control-label\" for=\"passwd\">Current Password</label>\n");
      out.write("\t\t\t\t\t\t      <div class=\"controls\">\n");
      out.write("                                                          <div class=\"input-prepend\">\n");
      out.write("                                                        <span class=\"add-on\"><i class=\"icon-book\"></i></span>\n");
      out.write("                                                        <input type=\"password\" class=\"input-large\" name=\"passwd\" id=\"passwd\" placeholder=\"Current Password\" required=\"true\" onkeyup=\"loadXMLDoc()\"/>\n");
      out.write("                                                              <span id=\"err\"> </span>\n");
      out.write("                                                          </div>\n");
      out.write("                                                      </div>\n");
      out.write("\t\t\t\t\t\t    </div>\n");
      out.write("                                                    <div class=\"control-group\">\n");
      out.write("                                                                              <label class=\"control-label\" for=\"apasswd\">New Password</label>\n");
      out.write("                                                                              <div class=\"controls\">\n");
      out.write("                                                                                  <div class=\"input-prepend\">\n");
      out.write("                                                        <span class=\"add-on\"><i class=\"icon-barcode\"></i></span>\n");
      out.write("                                                                                <input type=\"password\" class=\"input-large\" name=\"apasswd\" id=\"apasswd\" required=\"true\" placeholder=\"New Password\"/>\n");
      out.write("                                                                              </div>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                                                <div class=\"control-group\">\n");
      out.write("                                                                              <label class=\"control-label\" for=\"conpasswd\">Re Password</label>\n");
      out.write("                                                                              <div class=\"controls\">\n");
      out.write("                                                                                  <div class=\"input-prepend\">\n");
      out.write("                                                        <span class=\"add-on\"><i class=\"icon-barcode\"></i></span>\n");
      out.write("                                                                                <input type=\"password\" class=\"input-large\" name=\"conpasswd\" id=\"conpassword\" required=\"true\" placeholder=\"New Password\"/>\n");
      out.write("                                                                              </div>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                      <div class=\"control-group\">\n");
      out.write("                                                      <label class=\"control-label\"></label>\n");
      out.write("                                                      <div class=\"controls\">\n");
      if (_jspx_meth_c_005fif_005f8(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_005fif_005f9(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                      <button type=\"submit\" class=\"btn btn-success\">Submit</button>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("   </div>\n");
      out.write("                </div>\n");
      out.write("    </div></div>\n");
      out.write(" ");
      out.write("<div class=\"footer\">       \n");
      out.write("<div class=\"navbar navbar-fixed-bottom\" style=\" margin-bottom: 0px\">\n");
      out.write("                      <div class=\"navbar-inner\" style=\"background:#000; border-bottom:0px;\">\n");
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
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /ap/adminprofile.jsp(106,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty param[\"student\"]}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("active\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /ap/adminprofile.jsp(113,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty param[\"studentSuccess\"]}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write(" <p style=\"color:green;font-weight:bold;\">Deletion is successful.</p>\n");
        out.write("\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /ap/adminprofile.jsp(197,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${(not empty param[\"faculty\"])}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("active\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent(null);
    // /ap/adminprofile.jsp(203,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty param[\"facultySuccess\"]}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write(" <p style=\"color:green;font-weight:bold;\">Deletion is successful.</p>\n");
        out.write("\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent(null);
    // /ap/adminprofile.jsp(285,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty param[\"subject\"]}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("active\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f5.setParent(null);
    // /ap/adminprofile.jsp(290,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty param[\"subjectSuccess\"]}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write(" <p style=\"color:green;font-weight:bold;\">Deletion is successful.</p>\n");
        out.write("\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f6.setParent(null);
    // /ap/adminprofile.jsp(357,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty param[\"Success\"]}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write(" active\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f7.setParent(null);
    // /ap/adminprofile.jsp(360,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty param[\"Failed\"]}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write(" active\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f8.setParent(null);
    // /ap/adminprofile.jsp(401,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fif_005f8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty param[\"Success\"]}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
    if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write(" <p style=\"color:green;font-weight:bold;\">Your Password is changed successfully.</p>\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f9.setParent(null);
    // /ap/adminprofile.jsp(405,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_c_005fif_005f9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty param[\"Failed\"]}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f9 = _jspx_th_c_005fif_005f9.doStartTag();
    if (_jspx_eval_c_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write(" <p style=\"color:red;font-weight:bold;\">Wrong current Password.</p>\n");
        out.write("\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f9);
    return false;
  }
}
