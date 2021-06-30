import models.Tasks;
import services.impl.TasksServiceImpl;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        List<Tasks> database = new ArrayList<>();
        TasksServiceImpl tasksService = new TasksServiceImpl();

        try {
            while (choice != 5) {
                System.out.println("---------------- Welcome to your TODO list ----------------");
                System.out.print("Select an option\n1. Create a new task\n2. View a task\n3. Update a task\n4. Delete a task\n5. Exit\n~ ");
                choice = sc.nextInt();
                System.out.println("You have selected " + choice);

                switch (choice) {

                    case 1:
                        System.out.print("What's on your mind? -> ");
                        // TODO get user input and add it to database
                        String new_Task = sc.next();
                        //TasksServiceImpl task = new TasksServiceImpl();
                        System.out.println(new_Task);

                        System.out.println("Task has been added. Total tasks: " + database.size());
                        break;

                    case 2:
                        System.out.print("Enter Task Id: -> ");
                        // TODO print the task which user wants
                        int id_number = sc.nextInt();
                        System.out.println(id_number);
                        break;

                    case 3:
                        // TODO Ask user to update title for now and print updated tasks at the end
                        System.out.println("Enter a Task Id to Update Task: ");
                        int id_find = sc.nextInt();
                        System.out.println("Enter new title to update the task: ");
                        String new_Title = sc.next();

                        System.out.println(id_find);
                        System.out.println(new_Title);

                        break;

                    case 4:
                        // TODO Delete the task, and show the total count
                        System.out.println("Enter a Task Id to delete Task: ");
                        int id_delete = sc.nextInt();
                        System.out.println(id_delete);

                        System.out.println("The total task in the database is: " + database.size());

                        break;

                    default:
                        choice = 5;
                        break;

                }
            }
        } catch (InputMismatchException error) {
            System.out.println(error);
        }
    }
}
