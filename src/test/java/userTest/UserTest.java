package userTest;

import org.example.studentsList.user.User;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    void userTest() {
        List<User> users = Arrays.asList(new User("pavel", 23, "Google", "London"), new User("ivan", 23, "Google", "London"),
                new User("dima", 21, "Google", "London"), new User("petr", 21, "Google", "London"),
                new User("rinat", 32, "Google", "London"), new User("anton", 32, "Google", "London"));

        Map<Integer, List<User>> mapExpected = Map.of(23, List.of(new User("pavel", 23, "Google", "London"), new User("ivan", 23, "Google", "London"))
                , 21, List.of(new User("dima", 21, "Google", "London"), new User("petr", 21, "Google", "London"))
                , 32, List.of(new User("rinat", 32, "Google", "London"), new User("anton", 32, "Google", "London")));

        Map<Integer, List<User>> mapResult = User.getGroupUserAge(users);

        for (Map.Entry<Integer, List<User>> entry : mapResult.entrySet()) {
            assertEquals(mapExpected.get(entry.getKey()), mapResult.get(entry.getKey()));
        }
    }
}
