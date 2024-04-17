import java.util.*;;

public class employeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome !!!");

        //create random function to check wheather employee is present or not
        Random rand = new Random();
        boolean attendence = rand.nextBoolean();

        //printing employee is present or not
        if (attendence == true){
            System.out.println("Employee is present...");
        } else {
            System.out.println("Employee is Absent...");
        }
    }
}