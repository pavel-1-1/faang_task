package org.example.user_activity.activity;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Post implements Activity {
    private static final String POST = "POST";
    private final String content;
    private final String time;

    public Post(String content) {
        this.content = content;
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern(FORMAT);
        this.time = ZonedDateTime.now().format(timeFormatter);
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public String getActionDate() {
        return time;
    }

    @Override
    public String toString() {
        return content + " " + time;
    }
}
