package org.obliquid.restjson.model;


public class ToDoItem {
    
    private int id;
    private String description;
    
    public ToDoItem(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }   

}
