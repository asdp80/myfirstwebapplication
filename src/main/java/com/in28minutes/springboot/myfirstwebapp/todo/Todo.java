package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

//database (mysql)
//static list of todos => database (H2, mysql)

public class Todo {
    public Todo(int id, String username, String description, LocalDate targetdate, boolean done) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetdate = targetdate;
        this.done = done;
    }

    private int id;
    private String username;
    private String description;
    private LocalDate targetdate;
    private boolean done;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetdate() {
        return targetdate;
    }

    public void setTargetdate(LocalDate targetdate) {
        this.targetdate = targetdate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", targetdate=" + targetdate +
                ", done=" + done +
                '}';
    }
}
