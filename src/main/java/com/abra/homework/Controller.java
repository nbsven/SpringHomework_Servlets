package com.abra.homework;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet {

  public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
  private static String state = "-1";

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("state_before = " + state);
    state = "Get:" + LocalDateTime.now().format(FORMATTER);
    System.out.println("state_after = " + state);
    resp.getWriter().append(state).close();
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("state_before = " + state);
    state = "Post:" + LocalDateTime.now().format(FORMATTER);
    System.out.println("state_after = " + state);
    resp.getWriter().append(state).close();
  }

  @Override
  protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("state_before = " + state);
    state = "Put:" + LocalDateTime.now().format(FORMATTER);
    System.out.println("state_after = " + state);
    resp.getWriter().append(state).close();
  }

  @Override
  protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("state_before = " + state);
    state = "Delete:" + LocalDateTime.now().format(FORMATTER);
    System.out.println("state_after = " + state);
    resp.getWriter().append(state).close();
  }
}
