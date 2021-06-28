import models.Tasks;
import services.impl.TasksServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        List <Tasks> database = new ArrayList<>();
        TasksServiceImpl tasksService = new TasksServiceImpl();

        while (choice != 5) {
            System.out.println("---------------- Welcome to your TODO list ----------------");
            System.out.print("Select an option\n1. Create a new task\n2. View a task\n3. Update a task\n4. Delete a task\n5. Exit\n~ ");
            choice = sc.nextInt();
            System.out.println("You have selected " + choice);

            switch (choice) {

                case 1:
                    System.out.print("What's on your mind? -> ");
                    // TODO get user input and add it to database

                    System.out.println("Task has been added. Total tasks: " + database.size());
                    break;

                case 2:
                    System.out.print("Enter Task Id: -> ");
                    // TODO print the task which user wants
                    break;

                case 3:
                    // TODO Ask user to update title for now and print updated tasks at the end
                    break;

                case 4:
                    // TODO Delete the task, and show the total count
                    break;

                default:
                    choice = 5;
                    break;

            }
        }
    }
}
