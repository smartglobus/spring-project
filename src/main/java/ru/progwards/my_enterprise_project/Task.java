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


    //getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public TaskType getType() {
        return type;
    }

    public PriorityType getPriority() {
        return priority;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public User getAuthor() {
        return author;
    }

    public User getExecutor() {
        return executor;
    }

    public LocalDate getCreated() {
        return created;
    }

    public LocalDate getUpdated() {
        return updated;
    }

    public int getStoryPoint() {
        return storyPoint;
    }

    public List<Task> getSubtask() {
        return subtask;
    }

    public List<Task> getRelatedTask() {
        return relatedTask;
    }

    //setters

}
