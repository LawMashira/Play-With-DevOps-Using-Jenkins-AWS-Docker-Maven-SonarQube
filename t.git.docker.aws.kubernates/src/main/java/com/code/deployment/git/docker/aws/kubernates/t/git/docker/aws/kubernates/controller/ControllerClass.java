package com.code.deployment.git.docker.aws.kubernates.t.git.docker.aws.kubernates.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass
{


    @GetMapping("/deploy")
    public  String codeDeploy(){
        return  "Welcome to code deployment using AWS,Git,SonarQube,Jenkins,Docker + ";
    }
}
