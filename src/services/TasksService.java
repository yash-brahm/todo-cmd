package services;

import models.Tasks;

import java.util.List;

public interface TasksService {
    public Tasks getTasksById(List<Tasks> tasksList, int id);
    public List<Tasks> addTasks(List<Tasks> tasksList, Tasks task);
    public List<Tasks> updateTasks(List<Tasks> tasksList, Tasks task);
    public List<Tasks> deleteTasks(List<Tasks> tasksList, Tasks task);
    public void printAllTasks(List<Tasks> tasksList);
}
