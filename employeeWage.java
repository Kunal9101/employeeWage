import java.util.*;;

public class employeeWage {
    public static void main(String[] args) {
        //creating constats
        int RATE_PER_HOUR = 20;
        int PART_TIME_HOUR = 4;
        int FULL_TIME_HOUR = 8;

        System.out.println("Welcome !!!");

        //create random function to check wheather employee is present or not
        Random rand = new Random();
        float attendence = rand.nextFloat();

        //preparing for switch case
        //1. not present
        //2. part time
        //3. full time
        int check = 0;
        if (attendence >= 0.7){
            check = 3;
        }
        else if (attendence < 0.7 && attendence >=0.4){
            check = 2;
        }
        else {
            check = 1;
        }

        //printing employee is present or not using switch case
        int empWage = 0;
        switch (check) {
            case 3:
                empWage = RATE_PER_HOUR * FULL_TIME_HOUR;
                System.out.println("Employee is present for full time...");
                System.out.println("Employee wage is "+ empWage);
                break;
            
            case 2:
                empWage = RATE_PER_HOUR * PART_TIME_HOUR;
                System.out.println("Employee is present for part time...");
                System.out.println("Employee wage is "+ empWage);
                break;
            case 1:
                System.out.println("Employee is Absent...");
                System.out.println("Employee wage is "+ empWage);
                break;
            
            default:
                System.out.println("Invalid!!");
                break;
        }

    }
}