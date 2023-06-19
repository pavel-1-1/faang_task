package org.example.user_activity.activity;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Share implements Activity {
    private static final String SHARE = "SHARE";
    private final String content;
    private final String time;

    public Share(String content) {
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
