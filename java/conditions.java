package training.java;
import java.util.*;
public class conditions {
    public static void main(String[] args){
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible for voting");
        }
        else{
            System.out.println("You are not eligible for voting");
        }



        
        String day = "thursday";

        switch(day){
            case "monday":
                System.out.println("Monday");
                break;
            case "tuesday":
                System.out.println("Tuesday");
                break;
            case "wednesday":
                System.out.println("Wednesday");
                break;
            case "thursday":
                System.out.println("Thursday");
                break;
            case "friday":
                System.out.println("Friday");
                break;
            case "saturday":
                System.out.println("Saturday");
                break;
            case "sunday":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
