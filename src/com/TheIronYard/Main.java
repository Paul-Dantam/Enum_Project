package com.TheIronYard;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
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

        ObjectMapper mapper = new ObjectMapper();

        try {
            String json = mapper.writeValueAsString(Month.MAY);
            try {
                File outputFile = new File(Month.MAY+ ".json");
                FileWriter fileWriter = new FileWriter(outputFile);
                fileWriter.write(json);
                fileWriter.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        } catch(Exception e){
            e.printStackTrace();
        }



    }
}

