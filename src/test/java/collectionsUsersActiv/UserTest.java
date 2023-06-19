package collectionsUsersActiv;

import org.example.collectiongUsers.user.User;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void findHobbyLoversTest() {
        Set<String> set = Set.of("лыжи", "теннис");

        User user = new User(2332, "pavel", 34);
        user.setActivities(Set.of("футбол"));

        User user1 = new User(4545, "alex", 32);
        user1.setActivities(Set.of("лыжы"));

        List<User> users = List.of(user, user1);

        Map<User, String> expected = Map.of(user, "футбол", user1, "лыжы");

        Map<User, String> result = user.findHobbyLovers(users, set);



        //assertEquals(expected.get(user), result.get(user));
        assertEquals(expected.get(user1), result.get(user1));

//        for (Map.Entry<User, String> entry : result.entrySet()) {
//            assertEquals(expected.get(entry.getKey()), result.get(entry.getKey()));
//        }
    }
}
