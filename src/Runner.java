import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("---------------- Welcome to your TODO list ----------------");
            System.out.print("Select an option\n1. Create a new task\n2. View a task\n3. Update a task\n4. Delete a task\n5. Exit\n~ ");
            choice = sc.nextInt();
            System.out.println("You have selected " + choice);

            switch (choice) {

                case 1:
                    // addTasks(null);
                    break;

                case 2:
                    // getTasksbyId(1);
                    break;

                case 3:
                    // updateTasks(null);
                    break;

                case 4:
                    // deleteTasks(null);
                    break;

                default:
                    choice = 5;
                    break;

            }
        }
    }
}
