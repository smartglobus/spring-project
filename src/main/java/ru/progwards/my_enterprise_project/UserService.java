package ru.progwards.my_enterprise_project;

import java.util.List;

public interface UserService {
    List<User> get();

    User get(String id);

    void create(User task);

    void update(User task);

    void delete(String id);
}
