package ru.progwards.my_enterprise_project;

public interface Workflow {
    /**
     * Тип на который изменяется статус Task
     * * @param type - change type
     */
    void change(TaskType type);
}
