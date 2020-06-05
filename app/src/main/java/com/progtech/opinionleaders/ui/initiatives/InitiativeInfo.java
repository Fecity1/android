package com.progtech.opinionleaders.ui.initiatives;

public class InitiativeInfo {
    private String title;
    private String text;

    public InitiativeInfo(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
