package com.example.myapplication;

import java.util.ArrayList;

public class CheckListNote extends Note {
    private ArrayList<String> items;

    public CheckListNote(String title) {
        super(title);
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public ArrayList<String> getItems() {
        return items;
    }

    @Override
    public void getSummary() {
        System.out.println(getTitle() + " (" + getCreatedDate() + ")");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i+1) + ". [ ] " + items.get(i));
        }
    }
}
