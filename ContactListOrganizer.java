import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ContactListOrganizer {
    public static void main(String[]args){
       ArrayList <String> contact = new ArrayList<>();
       Scanner scan = new Scanner(System.in);
       Scanner scan2 = new Scanner(System.in);
       boolean loop = true;
       String choice = "";
       String add = "";
       while(loop){
           boolean dup = false;
           System.out.println("Would you like to add a contact?(enter yes or no):");
           choice = scan.nextLine().toLowerCase();
           if(choice.equals("yes")){
               System.out.println("Enter name and phone number in this format(name, xxx-xxx-xxxx)");
               add = scan2.nextLine().toLowerCase();
               for(int i = 0; i < contact.size(); i++){
                   if(contact.get(i).equals(add)){
                       System.out.println("You already have this contact, it won't be added");
                       dup = true;
                   }
               }
               if(!dup) {
                   contact.add(add);
               }
           }else{
               break;
           }
       }
       Collections.sort(contact);
       System.out.print("Here are you contacts in alphabetical order: "+contact);
    }
}
