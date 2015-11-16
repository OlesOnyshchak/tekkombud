package com.tekkombud.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Router {
    @RequestMapping(value = {"/welcome"},method = RequestMethod.GET)
    public String showWelcomePage() {
        return "/app/welcome/index.html";
    }

    @RequestMapping(value = {"/admin"},method = RequestMethod.GET)
    public String showAdminPage() {
        return "/app/admin/index.html";
    }
}
