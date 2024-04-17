import java.util.*;;

public class employeeWage {
    public static void main(String[] args) {
        //creating constats
        int RATE_PER_HOUR = 20;
        int FULL_TIME_HOUR = 8;

        System.out.println("Welcome !!!");

        //create random function to check wheather employee is present or not
        Random rand = new Random();
        boolean attendence = rand.nextBoolean();

        //printing employee is present or not
        int empWage = 0;
        if (attendence == true){
            empWage = RATE_PER_HOUR * FULL_TIME_HOUR;
            System.out.println("Employee is present for full time...");
            System.out.println("Employee wage is "+ empWage);
        } else {
            System.out.println("Employee is Absent...");
            System.out.println("Employee wage is "+ empWage);
        }
    }
}