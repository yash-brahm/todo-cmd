package services.impl;

import models.Tasks;
import services.TasksService;

import java.util.List;

public class TasksServiceImpl implements TasksService {
    // TODO implement abstract methods

    @Override
    public Tasks getTasksById(List<Tasks> tasksList, int id) {

        for (int i = 0; i <= tasksList.size(); i++) {

            Tasks currentTask;
            currentTask = tasksList.get(i);

            if (currentTask.getId() == id) {
                return currentTask;
            }
        }
        return null;
    }

    @Override
    public List<Tasks> addTasks(List<Tasks> tasksList, Tasks task) {
        tasksList.add(task);
        return tasksList;
    }

    @Override
    public List<Tasks> updateTasks(List<Tasks> tasksList, Tasks task) {

        for (int i = 0; i <= tasksList.size(); i++) {

            Tasks oldTask = tasksList.get(i);
            if (oldTask.getId() == task.getId())
            {
                oldTask.setTitle(task.getTitle());
                oldTask.setNotes(task.getNotes());
                oldTask.setDueDate(task.getDueDate());
                oldTask.setTags(task.getTags());
            }
            return tasksList;
        }
        return null;
    }
    
    @Override
    public List<Tasks> deleteTasks(List<Tasks> tasksList, Tasks task) {

        tasksList.remove(task);
        return tasksList;
    }
}
