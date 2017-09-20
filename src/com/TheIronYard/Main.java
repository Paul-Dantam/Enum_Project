package com.TheIronYard;

import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        // write your code here

        //add into an array list all the months that follow the given month inclusively

        ArrayList<String> inclusiveFutureMonths = new ArrayList<>();


        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a month");

        String month = sc.nextLine();

        switch (month) {
            case "January":
                inclusiveFutureMonths.add(Month.JANUARY.getEnglishName());
            case "February":
                inclusiveFutureMonths.add(Month.FEBRUARY.getEnglishName());
            case "March":
                inclusiveFutureMonths.add(Month.MARCH.getEnglishName());
            case "April":
                inclusiveFutureMonths.add(Month.APRIL.getEnglishName());
            case "May":
                inclusiveFutureMonths.add(Month.MAY.getEnglishName());
            case "June":
                inclusiveFutureMonths.add(Month.JUNE.getEnglishName());
            case "July":
                inclusiveFutureMonths.add(Month.JULY.getEnglishName());
            case "August":
                inclusiveFutureMonths.add(Month.AUGUST.getEnglishName());
            case "September":
                inclusiveFutureMonths.add(Month.SEPTEMBER.getEnglishName());
            case "October":
                inclusiveFutureMonths.add(Month.OCTOBER.getEnglishName());
            case "November":
                inclusiveFutureMonths.add(Month.NOVEMBER.getEnglishName());
            case "December":
                inclusiveFutureMonths.add(Month.DECEMBER.getEnglishName());
                break;
            default:
                break;
        }

        if (inclusiveFutureMonths.isEmpty()) {
            System.out.println("That month doesn't exist, try again!");
        } else {
            for (String monthsName : inclusiveFutureMonths) {
                System.out.println(monthsName);
            }
        }
    }


}

