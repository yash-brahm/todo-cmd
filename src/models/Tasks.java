package models;

import java.util.Date;

public class Tasks {
    static int nextId = 1; // Shared across all objects

    private int id;
    private String title;
    private String notes;
    private Date dueDate;
    private Priority priority;
    private String tags;

    // No Args
    public Tasks() {
        this.id = getNextId();
    }

    public Tasks(String title, String notes, Date dueDate, Priority priority, String tags) {
        this.id = getNextId();
        this.title = title;
        this.notes = notes;
        this.dueDate = dueDate;
        this.priority = priority;
        this.tags = tags;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    private int getNextId() {
        return nextId++;
    }
}
