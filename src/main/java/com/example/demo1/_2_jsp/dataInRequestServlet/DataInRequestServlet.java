package com.example.demo1._2_jsp.dataInRequestServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/dataInRequestServlet")
public class DataInRequestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("name","Имя");
        req.setAttribute("surname","Фамилия");
        getServletContext().getRequestDispatcher("/jsp/DataInRequest.jsp").forward(req,resp);
    }

}
