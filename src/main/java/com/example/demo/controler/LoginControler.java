package com.example.demo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.loginRepository;
import src.main.java.com.example.demo.template.pagina;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
@RestController
@RequestMapping("/login")
public class LoginControler {
    @GetMapping("/login")
    public String login(){
        return "login";
    }

}
