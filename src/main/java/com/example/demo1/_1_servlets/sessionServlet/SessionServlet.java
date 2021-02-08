package com.example.demo1._1_servlets.sessionServlet;

import com.example.demo1.model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sessionServlet")
public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Object user = session.getAttribute("user");
        if(user == null) {
            User newUser = new User(1L,"name","surname","lastname");
            session.setAttribute("user", newUser);
        }
        else{
            PrintWriter printWriter = resp.getWriter();
            printWriter.println(user.toString());
        }
    }
}
