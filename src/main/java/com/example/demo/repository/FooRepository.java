package com.example.demo.repository;

import com.example.demo.model.Foo;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Repository
public class FooRepository {
    Foo[] foos  = new Foo[]{
            Foo.builder().id(1).name("foo1").build(),
            Foo.builder().id(2).name("foo2").build(),
            Foo.builder().id(3).name("foo3").build()
    };

    public Flux<Foo> findAllFoo() {
        return Flux.fromArray(foos)
                .delayElements(Duration.ofSeconds(1))
                .repeat().log();
    }
}
