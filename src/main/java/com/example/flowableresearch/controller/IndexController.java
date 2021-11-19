package com.example.flowableresearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
  private static final String INDEX = "index";

  @RequestMapping("/show")
  @ResponseBody
  public String getIndex(){
    return "Hello SpringBoot!";
  };
}
