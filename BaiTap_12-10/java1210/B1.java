package java1210;

import java.util.Scanner;

public class B1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (month < 1 || month > 12 || year < 0) {
            System.out.println("Invalid month or year.");
        } else {
            printMonthCalendar(month, year);
        }

        sc.close();
    }

    public static void printMonthCalendar(int month, int year)  {
        System.out.println("\n\n   Calendar of " + getMonthName(month) + " " + year + ":");
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
        System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");

        int daysInMonth = getDaysInMonth(month, year);
        int firstDayOfWeek = getFirstDayOfWeek(month, year);
        int dayOfWeek = 0;

        for (int i = 0; i < firstDayOfWeek; i++) {
            System.out.print("     ");
            dayOfWeek++;
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d  ", day);
            dayOfWeek++;
            if (dayOfWeek == 7) {
                System.out.println(); //sau ngày thứ 7 xuống dòng và in từ chủ nhật
                dayOfWeek = 0;
            }
        }
        System.out.println();
    }
    
    public static String getMonthName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "";
        }
    }

    public static int getDaysInMonth(int month, int year) {
    	int daysInMonth = 0;
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
        	daysInMonth = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
        	daysInMonth = 30;
        } else {
        	if (isLeapYear(year)) {
        		daysInMonth = 29;
        	} else daysInMonth = 28;
        }
        
        return daysInMonth;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDayOfWeek(int month, int year) {
        int day = 1;
        int startYear = 1800; // Năm bắt đầu mốc
        int startDayOfWeek = 3; // Thứ 4

        int totalDays = 0;

        //tính số ngày từ 1800 đến năm cần tính (chưa tính năm đó)
        for (int y = startYear; y < year; y++) {
            totalDays += isLeapYear(y) ? 366 : 365;
        }
        
        //tính số ngày của riêng năm cần tính
        for (int m = 1; m < month; m++) {
            totalDays += getDaysInMonth(m, year);
        }

        int dayOfWeek = (startDayOfWeek + totalDays % 7) % 7;

        return dayOfWeek;
    }
}
