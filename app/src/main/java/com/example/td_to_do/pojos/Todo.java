package com.example.td_to_do.pojos;

import java.io.Serializable;

public class Todo implements Serializable {
    private long id;
    private String name;
    private String urgency;

    public Todo() {
    }

    public Todo(String name, String urgency) {
        this.name = name;
        this.urgency = urgency;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", urgency='" + urgency + '\'' +
                '}';
    }
}
