import java.util.Scanner;
public class Current_time_lab2_2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the minutes : ");
        int minutes = a.nextInt();
        int hour = minutes/60;
        int remaining_minutes = minutes%60;

        if (hour < 12){
            System.out.println("Now Time is : "+hour+":"+remaining_minutes+" pm");
            //minutes passed since 12:00pm, so less than 12 it will give "pm" time
        }
        else {
            System.out.println("Now Time is : "+hour+":"+remaining_minutes+" am");
        }

    }
}
