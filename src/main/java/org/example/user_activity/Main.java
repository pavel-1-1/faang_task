package org.example.user_activity;

import org.example.user_activity.activity.*;
import org.example.user_activity.user.UserAction;
import org.example.user_activity.user.Users;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Activity post = new Post("faang top");
        System.out.println(post);

        List<UserAction> userActions = nextList(2, 2);
        int sizeExpected = userActions.stream().map(UserAction::getActivities).map(Map::values).map(lists -> lists.stream()
                        .map(List::size).mapToInt(value -> value).sum())
                .mapToInt(value -> value).sum();

        System.out.println(sizeExpected);
        userActions.forEach(user -> user.getActivities().forEach((key, value) -> System.out.println(key + " " + value.size())));
    }

    private static List<UserAction> nextList(int size, int sizeActive) {
        List<UserAction> userActions = new ArrayList<>();
        List<String> list = List.of(Users.COMMENT, Users.LIKE, Users.POST, Users.SHARE);
        for (int i = 0; i < size; sizeActive--, i++) {
            UserAction user = new UserAction("", size);
            userActions.add(user);
            Map<String, List<Activity>> map = new HashMap<>();
            for (String activity : list) {
                List<Activity> activities = new ArrayList<>();
                for (int j = 0; j < sizeActive; j++) {
                    activities.add(nextActivity(activity));
                }
                map.put(activity, activities);
            }
            userActions.get(i).setActivities(map);
        }
        return userActions;
    }

    private static Activity nextActivity(String activity) {
        if (activity.equals(Users.COMMENT)) return new Comment("");
        if (activity.equals(Users.LIKE)) return new Like("");
        if (activity.equals(Users.POST)) return new Post("");
        return new Share("");
    }
}
