package com.example.demo1._1_servlets.cookieServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet("/cookieServlet")
public class CookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        resp.addCookie(new Cookie("cookieName", "cookieValue"));
        PrintWriter printWriter = resp.getWriter();
        Arrays.stream(cookies).forEach(
                cookie -> printWriter.println("[" + cookie.getName() + ";" + cookie.getValue() + "]")
        );




    }
}
