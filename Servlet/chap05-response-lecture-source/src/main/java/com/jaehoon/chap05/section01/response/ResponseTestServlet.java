package com.jaehoon.chap05.section01.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/response")
public class ResponseTestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /* 1. 요청을 받아서 처리한다 -> req.getParameter 로 전달 받은 데이터 꺼내기
        * 2. 비즈니스 로직을 처리한다 -> DB 접속 및 CRUD 로직 처리
        * 3. 응답을 처리한다 -> resp 이용해서 동적인 웹(HTML 문서) 페이지를 만들고 스트림을 이용해 내보내다 */

        /* 문자열을 이용해 사용자에게 내보내질 페이지를 작성한다 */
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<html>")
                .append("<head>")
                .append("<title>Response</title>")
                .append("</head>")
                .append("<body>")
                .append("<h1>안녕 Servlet Response</h1>")
                .append("</body>")
                .append("</html>");

        //resp.setContentType("text/html");   // 응답 데이터의 MIME type 설정
        //resp.setCharacterEncoding("UTF-8");  // 응답 데이터의 문자 셋 설정

        //resp.setContentType("text/html; charset=UTF-8");

        /* Tomcat 10 버전 부터는 MIME 타입만 기재해도 자동으로 문자셋이 설정된다 */
        resp.setContentType("text/html");

        // 사용자 브라우저에 응답하기 위한 출력 스트림을 response 객체에서 반환한다
        PrintWriter writer = resp.getWriter();
        writer.print(stringBuilder);
        writer.flush();  // 버퍼에 잔류한 데이터 내보내기
        writer.close(); // 스트림 반환




    }
}
