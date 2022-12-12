package com.example.demo;


import com.example.demo.model.Foo;
import com.example.demo.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/foo")
public class FooController {

    @Autowired
    FooService fooService ;
    
    // Collection Resource
    @GetMapping
    private Flux<Foo> findAllFoo() {
        return fooService.findAllFoo();
    }
}
