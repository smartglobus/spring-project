package ru.progwards.my_enterprise_project;

import java.time.LocalDate;
import java.util.List;

public class Task {
    private String id;
    private String name;
    private String description;
    private TaskType type;
    private PriorityType priority;
    private List<Attachment> attachments;
    private User author;
    private User executor;
    private LocalDate created;
    private LocalDate updated;
    private int storyPoint;
    private List<Task> subtask;
    private List<Task> relatedTask;

}
