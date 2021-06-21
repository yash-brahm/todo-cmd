import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        //TODO - Create a loop to continue the selection until EXIT option is selected
            System.out.println("---------------- Welcome to your TODO list ----------------");
            System.out.print("Select an option\n1. Create a new task\n2. View a task\n3. Update a task\n4. Delete a task\n5. Exit\n~ ");
            choice = sc.nextInt();
            System.out.println("You have selected " + choice);



    }
}
