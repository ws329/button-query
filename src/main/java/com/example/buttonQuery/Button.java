package com.example.buttonQuery;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Button {
    @Id
    private int id;
    private String name;
    private String pos;

    protected Button() {}

    public Button(int id, String name, String pos) {
        this.id = id;
        this.name = name;
        this.pos = pos;
    }

    @Override
    public String toString() {
        return String.format(
                "Button[id=%d, name='%s', position='%s']",
                id, name, pos);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPos() {
        return pos;
    }

}