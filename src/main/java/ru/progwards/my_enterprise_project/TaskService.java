package ru.progwards.my_enterprise_project;

import java.util.List;

public interface TaskService {
    List<Task> get();

    Task get(String id);

    void create(Task task);

    void update(Task task);

    void delete(String id);
}
