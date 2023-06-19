package org.example.user_activity.user;

import org.example.user_activity.activity.Activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class Users {
    private final String name;
    private final int id;
    public final static String POST = "POST";
    public final static String COMMENT = "COMMENT";
    public final static String LIKE = "LIKE";
    public final static String SHARE = "SHARE";
    private Map<String, List<Activity>> activities;

    public Users(String name, int id) {
        this.name = name;
        this.id = id;
    }

 //   public static List<UserAction> top10ActiveUsers(List<UserAction> userActions) {
//        List<UserAction> top10Actions = new ArrayList<>();
//        top10Actions = userActions.stream().map(userAction -> userAction.getActivities().values()
//                .stream().collect(Collectors.toMap(userAction -> userAction, userAction -> userAction.getActivities().values().stream()
//                        .map(list -> list.size()).count())));
//                int sizeExpected = expected.stream().map(UserAction::getActivities).map(Map::values).map(lists -> lists.stream()
//                .map(List::size).mapToInt(value -> value).sum()).mapToInt(value -> value).sum();

 //       return top10Actions;
 //   }

    public Map<String, List<Activity>> getActivities() {
        return activities;
    }

    public void setActivities(Map<String, List<Activity>> activities) {
        this.activities = activities;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
