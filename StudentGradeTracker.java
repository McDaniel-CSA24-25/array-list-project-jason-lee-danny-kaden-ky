import java.util.ArrayList;
import java.util.Scanner;
public class StudentGradeTracker {
    public static void main(String[]args){

        ArrayList<Double> grades = new ArrayList<>();
        ArrayList<Double> pass = new ArrayList<>();
        ArrayList<Double> fail = new ArrayList<>();
        System.out.println("Welcome!");
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        while(a == 0){
            System.out.println("Please enter a grade you want to add(1-100)(-1 to stop): ");
            double grade = scanner.nextDouble();
            if(grade != -1 && grade <= 100 && grade >=0){
                grades.add(grade);
            }else if(grade == -1){
                break;
            }else if(grade < 0 || grade > 100){
                System.out.println("Invalid, please try again.");
            }
        }

        while(a == 0){
            boolean removed = false;
            System.out.println("Please enter a grade you want to remove(-1 to stop): ");{
                double remove = scanner.nextDouble();
                if(remove == -1){
                    break;
                }else{
                    for(int i = 0; i < grades.size(); i++){
                        if(grades.get(i) == remove){
                            grades.remove(i);
                            removed = true;
                        }
                }
                    if(!removed){
                        System.out.println("Invalid, please try again.");
                    }
            }
        }
        }


        double average = 0;
        double smallest = grades.get(0);
        double largest = grades.get(0);
        for(double n : grades){
            average += n;
            if(n >= 60){
                pass.add(n);
            }else if(n<60){
                fail.add(n);
            }
        }
        average/= grades.size();
        for(int i = 1; i < grades.size(); i++) {
            if (grades.get(i) > largest) {
                largest = grades.get(i);
            } else if (grades.get(i) < smallest) {
                smallest = grades.get(i);
            }
        }

        System.out.println("Average: "+average);
        System.out.println("Largest: "+largest);
        System.out.println("Smallest: "+smallest);
        System.out.println("Pass: "+pass);
        System.out.println("Fail: "+fail);
    }
}
