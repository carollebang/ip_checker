package za.co.example;

import java.util.Scanner;

public class DateFormatChecker {
    private String date = "[0-9][0-9]";
    private String month = "[0-1][0-9]";
    private String year = "[0-2][0-9][0-9][0-9]";

    private String pattern = date + "-" + month + "-" + year;

    public DateFormatChecker () {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the date in the following format [dd-mm-yyyy]");

        while(in.hasNext()){
            String date = in.next();

            if (date.equalsIgnoreCase("end")) {
                break;
            }

            if (!date.matches(new DateFormatChecker().pattern)) {
                System.out.println("Invalid Date.\nEnter the date in the following format [dd-mm-yyyy]");
            } else {
                System.out.println("Valid Date");;
            }
        }
    }
}
