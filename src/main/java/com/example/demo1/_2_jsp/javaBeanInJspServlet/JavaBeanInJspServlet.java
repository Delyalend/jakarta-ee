package com.example.demo1._2_jsp.javaBeanInJspServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/javaBeanInJspServlet")
public class JavaBeanInJspServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserJavaBean userJavaBean = new UserJavaBean("Danil", 19);
        req.setAttribute("userJavaBean",userJavaBean);
        req.getRequestDispatcher("/jsp/JavaBeanInJsp.jsp").forward(req,resp);
    }
}
