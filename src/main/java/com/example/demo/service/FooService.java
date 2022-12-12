package com.example.demo.service;

import com.example.demo.model.Foo;
import com.example.demo.repository.FooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class FooService {

    @Autowired
    FooRepository fooRepository;

    public Flux<Foo> findAllFoo() {
        return fooRepository.findAllFoo();
    }
}
