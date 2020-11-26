package com.firstspringapp.models;

import javax.persistence.*;

@Entity
@Table(name="GREETINGS")
public class Greeting {

    @Id
    private long id;
    private String name;

    public Greeting(){
        id = 0;
        name = "";
    }
    public Greeting(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(long id){
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}