package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class appconfig {

    @Bean
    public Actor actor() {
//Actor actor=new Actor();
//        Actor actor;
//        actor.setName("ironman");
//actor.setGender("male");
//actor.setAge(20);

        return new Actor();

    }
    @Bean
    @Scope("prototype")
    public Movie movie() {
        actor().setAge(20);
        actor().setName("ironman");
        actor().setGender("male");
        return  new Movie();
    }


}
