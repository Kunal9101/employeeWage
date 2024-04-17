import java.util.*;;

public class employeeWage {
    public static void main(String[] args) {
        //creating constats
        int RATE_PER_HOUR = 20;
        int PART_TIME_HOUR = 4;
        int FULL_TIME_HOUR = 8;
        int WORKING_DAYS= 20;
        int MIN_WORKING_HOURS_FOR_MONTH = 100; 

        System.out.println("Welcome !!!");

        //create random function to check wheather employee is present or not
        Random rand = new Random();

        //initailize calculation of attendence
        int full = 0;
        int part = 0;
        int not = 0;
        int totalHoursForMonth = 0;

        //calculating for whole month
        int empWageForMonth = 0;
        for (int i=1 ; i <= WORKING_DAYS ; i++){
            float attendence = rand.nextFloat();

            //preparing for switch case
            //1. not present
            //2. part time
            //3. full time
            int check = 0;
            if (attendence >= 0.7){
                check = 3;
                totalHoursForMonth = totalHoursForMonth + FULL_TIME_HOUR;
                full++;
            }
            else if (attendence < 0.7 && attendence >=0.4){
                check = 2;
                totalHoursForMonth = totalHoursForMonth + PART_TIME_HOUR;
                part++;
            }
            else {
                check = 1;
                not++;
            }

            //printing employee is present or not using switch case
            int empWage_perday = 0;
            switch (check) {
                case 3:
                    empWage_perday = RATE_PER_HOUR * FULL_TIME_HOUR;
                    break;
                
                case 2:
                    empWage_perday = RATE_PER_HOUR * PART_TIME_HOUR;
                    break;
                case 1:
                    empWage_perday = empWage_perday + 0 ;
                    break;
                
                default:
                    System.out.println("Invalid!!");
                    break;
            }
            empWageForMonth = empWageForMonth + empWage_perday;
        }
        if (totalHoursForMonth >= MIN_WORKING_HOURS_FOR_MONTH){
            System.out.printf("Employee Serve %d full day\n%d half day &\n%d Absent\n", full, part , not);
            System.out.println("Total Employee wage is "+ empWageForMonth);
        }
        else{
            System.out.println("Min Working hours is not reached");
        }
    }
}