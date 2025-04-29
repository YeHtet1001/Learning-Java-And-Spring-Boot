package org.example.securitycontextdemo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    /**
     * If you want to run , please check and look how_to_run file under resources
     */

    @GetMapping("/home")
    public String home(){

        /**
         * You can't create SecurityContextObject,
         * so you can use SecurityContextHolder for creating object,
         * and then get authentication from SecurityContext
         */

        SecurityContext context = SecurityContextHolder.getContext();
        Authentication authentication = context.getAuthentication();

        return "Hello World"+ authentication.getName()+".";

    }


}
