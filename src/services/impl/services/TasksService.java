package services.impl.services;

import models.Tasks;

public interface TasksService {
    public Tasks getTasksById();
    public Tasks getAllTasks();
    public Tasks addTasks(Tasks task);
    public Tasks updateTasks(Tasks task);
    public Tasks deleteTasks(Tasks task);
}
