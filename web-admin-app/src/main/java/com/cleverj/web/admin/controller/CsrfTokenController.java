package com.cleverj.web.admin.controller;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

@Controller
public class CsrfTokenController {

    @GetMapping(value = "/csrf", produces = {TEXT_PLAIN_VALUE})
    public @ResponseBody
    String getCsrfToken(HttpServletRequest request) {
        return ((CsrfToken) request.getAttribute(CsrfToken.class.getName())).getToken();
    }

}
