package org.example.studentsList;

import org.example.studentsList.user.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("pavel", 23));
        users.add(new User("ivan", 23));
        users.add(new User("pavel", 21));
        users.add(new User("dima", 21));
        users.add(new User("petr", 21));
        users.add(new User("pavel", 32));
        users.add(new User("leha", 32));
        users.add(new User("rinat", 32));
        users.add(new User("anton", 23));


        User.getGroupUserAge(users).forEach((key, value) -> {
            System.out.println(key);
            value.forEach(n -> System.out.println(n.toString()));
        });
    }
}
