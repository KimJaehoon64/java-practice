package com.jaehoon.chap00;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    public static String id = "포기란";
    public static String password = "없다";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>")
           .append("<head>")
           .append("<title>Login Servlet</title>")
                .append("</head>")
                .append("<body>")
                .append("<h1>로그인문제</h1>")
                .append("<h2>과연 과제를 해결할 것인가</h2>")
                .append("<form action=\"login\" method=\"post\">")
                .append(" <label>아이디 : </label><input type=\"text\" name=\"id\">")
                .append("<br>")
                .append("<label>비밀번호 : </label><input type=\"text\" name=\"password\">")
                .append("<br>")
                .append("<input type=\"submit\" value=\"결과확인\">")
                .append("</form>")
                .append("</body>")
                .append("</html>");


            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
            out.print(sb);
            out.flush();
            out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String ids = req.getParameter("id");
        String passwords = req.getParameter("password");

        if(ids.equals(id) && passwords.equals(password)) {
            StringBuilder yes = new StringBuilder();
            yes.append("<html>")
                    .append("<head>")
                    .append("<title>로그인은 난제</title>")
                    .append("</head>")
                    .append("<body>")
                    .append("<h2>축하합니다</h2>")
                    .append("<h1>앞으로도 화이팅 하세요~!</h1>")
                    .append("</body>")
                    .append("</html>");

            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
            out.print(yes);
            out.flush();
            out.close();

        }else {
            StringBuilder no = new StringBuilder();
            no.append("<html>")
                    .append("<head>")
                    .append("<title>Login Servlet</title>")
                    .append("</head>")
                    .append("<body>")
                    .append("<h1>다시 도전해 보세요</h1>")
                    .append("<h2>바보</h1>")
                    .append("<form action=\"login\" method=\"post\">")
                    .append(" <label>아이디 : </label><input type=\"text\" name=\"id\">")
                    .append("<br>")
                    .append("<label>비밀번호 : </label><input type=\"text\" name=\"password\">")
                    .append("<br>")
                    .append("<input type=\"submit\" value=\"과연결과는\">")
                    .append("</form>")
                    .append("</body>")
                    .append("</html>");

            resp.setContentType("text/html");
            PrintWriter writer = resp.getWriter();
            writer.print(no);
            writer.flush();
            writer.close();
        }
    }
}
