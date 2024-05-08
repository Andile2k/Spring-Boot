package com.congo.Helloworld.service;

import com.congo.Helloworld.repository.HelloRepository;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImp implements HelloService{

    private HelloRepository helloRepository;

    public String getText() {
        return "Hello World";
    }
}
