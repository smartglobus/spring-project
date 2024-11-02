package ru.progwards.my_enterprise_project;

import java.util.List;

public interface ProjectService {
    List<Project> get();

    Task get(String id);

    void create(Project task);

    void update(Project task);

    void delete(String id);
}
