/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jashan Gill
 */
public class ArithmeticCalculatorServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // GET requests will end up here!
        request.setAttribute("result", "---");
        // Load a JSP from this servlet
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticForm.jsp").forward(request, response);
        // After a JSP has been loaded, stop the code call
        return; // VERY IMPORTANT!
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // POST requests will end up here!
        
        // Capture the incoming parameters from the JSP
        String result = "";
        int first,second = 0;
        try{
            String firstString = request.getParameter("first");
            first = Integer.parseInt(firstString);
            String secondString = request.getParameter("second");
            second = Integer.parseInt(secondString);
            
        }catch(NumberFormatException e){
            result = "Values should be numbers";
            request.setAttribute("result", result);
            // load the form once again
            getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticForm.jsp").forward(request, response);
            // after a JSP has been loaded, stop the code call
            return;
        }
        String op = request.getParameter("operator");
        
        // Set attributes in the request object, to be forwarded to the JSP
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        request.setAttribute("operator", op);
        
        // Validation
        if(op.equals("+")){
           int val = first+second;
            result = ""+val;
            
            request.setAttribute("result", result);
            
        // Load the JSP
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticForm.jsp").forward(request, response);
        // Stop the code call after loading a JSP
        return;
        }
        else if(op.equals("-")){
             int val = first-second;
            result = ""+val;
            
            request.setAttribute("result", result);
            
        // Load the JSP
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticForm.jsp").forward(request, response);
        // Stop the code call after loading a JSP
        return;
        }
         else if(op.equals("*")){
             int val = first*second;
            result = ""+val;
            
            request.setAttribute("result", result);
            
        // Load the JSP
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticForm.jsp").forward(request, response);
        // Stop the code call after loading a JSP
        return;
        }
         else if(op.equals("%")){
             int val = first%second;
            result = ""+val;
            
            request.setAttribute("result", result);
            
        // Load the JSP
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticForm.jsp").forward(request, response);
        // Stop the code call after loading a JSP
        return;
        }
         else{
             int val = first+second;
            result = ""+val;
            
            request.setAttribute("result", result);
            
        // Load the JSP
        getServletContext().getRequestDispatcher("/WEB-INF/ArithmeticForm.jsp").forward(request, response);
        // Stop the code call after loading a JSP
        return;
        }
    }
}
