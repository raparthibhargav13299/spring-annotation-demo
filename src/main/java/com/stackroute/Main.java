package com.stackroute;

import com.stackroute.config.appconfig;
import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


    public static void main(String[] args) {

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(appconfig.class);

        Movie movie1=applicationContext.getBean(Movie.class);
//movie1.setAct("ironman","male",20);

//        System.out.println(movie1.getAct());

        System.out.println(movie1.hashCode());
        System.out.println(movie1);
//
        Movie movie2 =applicationContext.getBean(Movie.class);

        System.out.println(movie2);
        System.out.println(movie2.hashCode());



    }


}
