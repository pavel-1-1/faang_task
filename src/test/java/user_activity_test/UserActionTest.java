package user_activity_test;

import org.example.user_activity.activity.*;
import org.example.user_activity.user.UserAction;
import org.example.user_activity.user.Users;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserActionTest {

//    @Test
//    void TestTop10ActiveUsers() {
//        List<UserAction> expected = nextList(10, 20);
//        List<UserAction> result = Users.top10ActiveUsers(nextList(20, 20));
//        int sizeExpected = expected.stream().map(UserAction::getActivities).map(Map::values).map(lists -> lists.stream()
//                .map(List::size).mapToInt(value -> value).sum()).mapToInt(value -> value).sum();
//
//        int sizeResult = result.stream().map(UserAction::getActivities).map(Map::values).map(lists -> lists.stream()
//                .map(List::size).mapToInt(value -> value).sum()).mapToInt(value -> value).sum();
//
//        assertEquals(sizeExpected, sizeResult);
//        for (UserAction userAction : expected) {
//            for (UserAction action : result) {
//                //assertEquals();
//            }
//        }
//    }

    private List<UserAction> nextList(int size, int sizeActive) {
        List<UserAction> userActions = new ArrayList<>();
        List<String> list = List.of(Users.COMMENT, Users.LIKE, Users.POST, Users.SHARE);
        for (int i = 0; i < size; sizeActive--, i++) {
            UserAction user = new UserAction("", size);
            userActions.add(user);
            Map<String, List<Activity>> map = new HashMap<>();
            for (String activity : list) {
                List<Activity> activities = new ArrayList<>();
                for (int j = 0; j < i; j++) {
                    activities.add(nextActivity(activity));
                }
                map.put(activity, activities);
            }
            userActions.get(i).setActivities(map);
        }
        return userActions;
    }

    private Activity nextActivity(String activity) {
        if (activity.equals(Users.COMMENT)) return new Comment("");
        if (activity.equals(Users.LIKE)) return new Like("");
        if (activity.equals(Users.POST)) return new Post("");
        return new Share("");
    }
}
