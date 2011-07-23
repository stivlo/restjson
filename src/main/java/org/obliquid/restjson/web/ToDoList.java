package org.obliquid.restjson.web;

import java.util.ArrayList;
import java.util.List;

import org.obliquid.restjson.model.ToDoItem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ToDoList {

    @RequestMapping("/toDoList")
    public @ResponseBody List<ToDoItem> test() {
        List<ToDoItem> toDoList = new ArrayList<ToDoItem>();        
        toDoList.add(new ToDoItem(1, "First thing, first"));
        toDoList.add(new ToDoItem(1, "After that, do the second task"));
        return toDoList;
    }
    
}
