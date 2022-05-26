package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jashan Gill
 */
public class AgeCalculatorServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // GET requests will end up here!
        
        // Load a JSP from this servlet
        getServletContext().getRequestDispatcher("/WEB-INF/ageForm.jsp").forward(request, response);
        // After a JSP has been loaded, stop the code call
        return; // VERY IMPORTANT!
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // POST requests will end up here!
        
        // Capture the incoming parameters from the JSP
        String result = "";
        int age = 0;
        try{
            String ageString = request.getParameter("age");
            age = Integer.parseInt(ageString);
        }catch(NumberFormatException e){
            result = "Age should be a number";
            request.setAttribute("result", result);
            // load the form once again
            getServletContext().getRequestDispatcher("/WEB-INF/ageForm.jsp").forward(request, response);
            // after a JSP has been loaded, stop the code call
            return;
        }
        
        // Set attributes in the request object, to be forwarded to the JSP
        request.setAttribute("age", age);
        
        // Validation
        if( age == 0 || age <= 0){
            // if validation fails:
            // Set up an error message
             result = "Please enter a Valid age number";
            // put the error message into the request object as an attribute
            request.setAttribute("result", result);
            // load the form once again
            getServletContext().getRequestDispatcher("/WEB-INF/ageForm.jsp").forward(request, response);
            // after a JSP has been loaded, stop the code call
            return;
        }else{
            int val = age+1;
            result = "Your age next birthday will be "+ val;
            
            request.setAttribute("result", result);
            
        // Load the JSP
        getServletContext().getRequestDispatcher("/WEB-INF/ageForm.jsp").forward(request, response);
        // Stop the code call after loading a JSP
        return;
        }
      
    }

}
