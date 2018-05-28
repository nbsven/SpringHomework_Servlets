package com.abra.homework;

import java.io.IOException;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller extends HttpServlet {

  private static String state = "-1";

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("state_before = " + state);
    state = "Get:" + LocalDate.now().toString();
    System.out.println("state_after = " + state);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("state_before = " + state);
    state = "Post:" + LocalDate.now().toString();
    System.out.println("state_after = " + state);
  }

  @Override
  protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("state_before = " + state);
    state = "Put:" + LocalDate.now().toString();
    System.out.println("state_after = " + state);
  }

  @Override
  protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("state_before = " + state);
    state = "Delete:" + LocalDate.now().toString();
    System.out.println("state_after = " + state);
  }
}
