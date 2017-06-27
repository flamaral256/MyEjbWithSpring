package io.epopeia.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public void hello() {
        System.out.println("Hello!");
    }
}
