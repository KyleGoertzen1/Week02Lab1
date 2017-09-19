/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 729347
 */
public class AgeCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String yourAge = request.getParameter("myAge");
        
        if (yourAge == null || yourAge.isEmpty()) {
            // set error message
            request.setAttribute("nothingMessage", "You must give your current age");
            
            // repopulate the JSP values with first name and last name
            request.setAttribute("age", yourAge);
            
            // forward the request back to index.jsp
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            // stop other execution of code
            return;
        }
        
        if(isNumeric(yourAge)){
            request.setAttribute("ageMessage", "You age next birthday will be " + (Integer.parseInt(yourAge)+1));
            
            request.setAttribute("age", yourAge);
            
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            // stop other execution of code
            return;
        }
        
        if(!isNumeric(yourAge)){
            request.setAttribute("numMessage", "Please enter a number");
            
            request.setAttribute("age", yourAge);
            
            // forward the request back to index.jsp
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            // stop other execution of code
            return;
        }
    }
    
    public boolean isNumeric(String s) {  
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");  
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO
    }
}
