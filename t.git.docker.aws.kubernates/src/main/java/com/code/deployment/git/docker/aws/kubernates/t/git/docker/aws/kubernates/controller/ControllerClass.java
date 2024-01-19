package com.code.deployment.git.docker.aws.kubernates.t.git.docker.aws.kubernates.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass
{


    @GetMapping("/deploy")
    public  String codeDeploy(){
        int number=5;

        if(number>5){
           System.out.println("Number is greater than 5");
        }else{System.out.println("Number is less than 5");}
        return  "Welcome to code deployment using AWS,Git,SonarQube,Jenkins,Docker + ";
    }

}
