import java.util.ArrayList;
import java.util.Scanner;
public class taskManagerBonus
{
    public static void main(String[] args)
    {
        ArrayList<String> tasksHigh = new ArrayList<>();
        ArrayList<String> tasksMedium = new ArrayList<>();
        ArrayList<String> tasksLow = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean on = true;

        while(on)
        {
            //Displaying the user's choice of task
            System.out.println();
            System.out.println("---------------------------------------------------");
            System.out.println("Here is your task management!");
            System.out.println("Press '1' if you want to add task (by priority)");
            System.out.println("Press '2' if you want to remove task (by priority)");
            System.out.println("Press '3' if you want to display each priority task");
            System.out.println("Press '4' if you want to show total and each priority task");
            System.out.println("Press '5' if you want to exit");

            //Asking which choice they would want to pick
            System.out.println();
            System.out.print("Choose an option: ");
            int option = input.nextInt();
            //This will be needed to change from intaking int and into intaking strings
            input.nextLine();

            System.out.println();
            //Adding your task
            if (option == 1)
            {
                //Asking what task you want to add
                System.out.println("Enter the task you want to add");
                String addingYourTask = input.nextLine();
                //Asking the type of priority you want to sort with
                System.out.println("What level of priority is this (High (Press 1), Medium (Press 2), Low (Press 3))?");
                int priority = input.nextInt();

                //If it is high, then it adds it to the high priority list
                if (priority == 1)
                {
                    tasksHigh.add(addingYourTask);
                    System.out.println("You have successfully added the task");
                }
                //If it is high, then it adds it to the medium priority list
                else if (priority == 2)
                {
                    tasksMedium.add(addingYourTask);
                    System.out.println("You have successfully added the task");
                }
                //If it is high, then it adds it to the low priority list
                else if (priority == 3)
                {
                    tasksLow.add(addingYourTask);
                    System.out.println("You have successfully added the task");
                }
                //Something went wrong
                else
                {
                    System.out.println("Please chose a valid option!!! Try again!!!");
                }
            }

            //Removimg your task
            else if (option == 2)
            {
                //This is asking what removing priority list you want to access
                System.out.println("Which task priority list do you want to remove from ((High (Press 1), Medium (Press 2), Low (Press 3))?");
                int removingPriority = input.nextInt();
                //Asking what index to remove from
                System.out.println("Enter the task index you would want to be remove");
                int indexOfRemoval = input.nextInt();

                if (removingPriority > 3 || removingPriority < 0)
                {
                    System.out.println("That isn't an choice... please try again");
                }

                //Checking condition to remove task
                else if (removingPriority == 1 && indexOfRemoval < tasksHigh.size() && indexOfRemoval >= 0)
                {
                    tasksHigh.remove(indexOfRemoval);
                    System.out.println("Task index of " + indexOfRemoval + " has been successfully removed");
                }
                else if (removingPriority == 2 && indexOfRemoval < tasksMedium.size() && indexOfRemoval >= 0)
                {
                    tasksMedium.remove(indexOfRemoval);
                    System.out.println("Task index of " + indexOfRemoval + " has been successfully removed");
                }
                else if (removingPriority == 3 && indexOfRemoval < tasksLow.size() && indexOfRemoval >= 0)
                {
                    tasksLow.remove(indexOfRemoval);
                    System.out.println("Task index of " + indexOfRemoval + " has been successfully removed");
                }
                //Something went wrong
                else
                {
                    System.out.println("The task index of " + indexOfRemoval + " was a failure... choose the option again");
                }
            }

            //Displaying all the task
            else if (option == 3)
            {
                //Simple for loop to print out task
                System.out.print("All High Task: ");
                for (int i = 0; i < tasksHigh.size(); i++)
                {
                    System.out.print(tasksHigh.get(i) + ", ");
                }
                System.out.println();

                System.out.print("All Medium Task: ");
                for (int i = 0; i < tasksMedium.size(); i++)
                {
                    System.out.print(tasksMedium.get(i) + ", ");
                }
                System.out.println();

                System.out.print("All Low Task: ");
                for (int i = 0; i < tasksLow.size(); i++)
                {
                    System.out.print(tasksLow.get(i) + ", ");
                }
                System.out.println();
            }



            //Showing the total amount of task
            else if (option == 4)
            {
                //Simple printing and math to show total task
                System.out.println("The amount of your total High Priority task is: " + tasksHigh.size());
                System.out.println("The amount of your total Medium Priority task is: " + tasksMedium.size());
                System.out.println("The amount of your total Low Priority task is: " + tasksLow.size());
                int totalTask = tasksHigh.size() + tasksMedium.size() + tasksLow.size();
                System.out.println("The amount of your total task is: " + totalTask);
            }

            //Exiting / done with the task management
            else if (option == 5)
            {
                on = false;
                System.out.println("You are done with the task management");
            }

            //Invalid option number
            else
            {
                System.out.println("Please chose a valid option!!! Try again!!!");
            }
        }
    }
}