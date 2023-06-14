package org.example.collectiongUsers.user;

import java.util.*;

public class User {
    private int id;
    private String name;
    private int age;
    private final Set<String> activities = new HashSet<>();

    public Map<User, String> findHobbyLovers(List<User> users, Set<String> activities) {
        Map<User, String> map = new HashMap<>();
        Iterator<String> iterator = activities.iterator();
        users.forEach(user -> {
            while (iterator.hasNext()) {
                String activ = iterator.next();
                if (user.getActivities().contains(activ)) {
                    map.put(user, activ);
                    break;
                }
            }
        });
        return map;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<String> getActivities() {
        return activities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        int num = 31;
        return num * Objects.hash(id, name, age);
    }
}
