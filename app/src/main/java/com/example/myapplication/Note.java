package com.example.myapplication;

public abstract class Note {
    protected String title;
    protected String createdDate;

    public Note(String title, String createdDate){
        this.createdDate = createdDate;
}
public String getTitle(){
        return title;
}
public void  setTitle(String title) {
    this.title = title;
}
public abstract void display();
}
