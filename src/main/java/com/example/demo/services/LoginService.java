package com.example.demo.services;

import com.example.demo.request.LoginRequest;
import com.example.demo.response.LoginResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LoginService {

  @PostMapping("/login")
  public LoginResponse Login(@RequestBody LoginRequest request){
    if (
      request.tipodocumento().equals("DNI")
      & request.documento() == 123456
      & request.password().equals("password")
    )
    {
      return new LoginResponse(200,"Login iniciado");
    }
    return new LoginResponse(404, "Autenticación fallida");
  }

}
