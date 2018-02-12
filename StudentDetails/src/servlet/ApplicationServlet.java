package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojo.Student;
import view.DatabaseQuery;

/**
 * Servlet implementation class ApplicationServlet
 */
@WebServlet("/details")
public class ApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DatabaseQuery query = new DatabaseQuery();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplicationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int studentId;
		Student student=null;
		
		studentId= Integer.parseInt(request.getParameter("id"));
		try {
			student=query.getDetails(studentId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Student Details</title>");
	    out.println("</head>");
	    out.println("<body bgcolor=\"white\">");
	    out.println("<h2>Student Details</h2>");
       if(student== null) {
	    	   
    	   out.println("No details found with this student id please enter  correct id");
	    }
       else
       {
    	out.println("Student ID: "+student.getId());
    	out.println("<br>");
	    out.println("Name: "+student.getName());
	    out.println("<br>");
	    out.println("Department: "+student.getDept());
	    out.println("<br>");
	    out.println("Degree: "+student.getDegree());
	    out.println("<br>");
	    out.println("Credits scored: "+student.getCredits_scored());
	    out.println("<br>");
	    out.println("Credits needed: "+student.getCredits_required());
       }
	    out.println("</body>");
	    out.println("</html>");
	
		
	}

}
