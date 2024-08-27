package com.jaehoon.chap05.section03.status;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/status")
public class StatusCodeTestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.sendError(404, "없는 페이지 입니다 경로를 확인하시오" );
        resp.sendError(500, "서버 내부 오류입니다, 서버 오류는 개발자의 잘못, 개" +
                "발자는 여러분 입니다" );



    }
}
