package com.example.oauth2sts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {

    private static Logger log = LoggerFactory.getLogger(BaseController.class);

    // http://localhost:8010/oauth/check_token?
    //      response_type=code&
    //      client_id=zone1&
    //      scope=http://localhost:8010/oauth/check_token&
    //      redirect_uri=http://localhost:8080/geoserver/

    @RequestMapping("/oauth2/auth")
    public String auth(@RequestParam("redirect_uri") String redirect_uri) {
        log.info(" HERE !!!  {} ", redirect_uri);

        return "redirect:" + redirect_uri;
    }

    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        log.info(" HERE !!!  TEST ");

        return "Test";
    }
}
