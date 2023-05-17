package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Movie {
    private List<Actor> act;

    public Movie() {
    }

    public Movie(List<Actor>act) {
        this.act = act;
    }
//    @Autowired
    public List<Actor> getAct() {
        return act;
    }
@Autowired
    public void setAct(List<Actor>act) {
        this.act = act;
    }


//    @Autowired
//    public void setAct(String ironman, String male, int i) {
//    }
    @Override
    public String toString() {
        return "Movie{" +
                "act=" + act +
                '}';
    }

//    public void setAct(String ironman, String male, int i) {
//    }


//    public void setAct(String ironman, String male, int i) {
//    }
}



