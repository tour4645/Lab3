package com.example.myapplication;

    import java.util.Date;
public class Note {
    String title;
    String content;
    Date createdDate;

    void getSummary(){
        System.out.println(title+":"+content+"("+createdDate+")");

    }
}
