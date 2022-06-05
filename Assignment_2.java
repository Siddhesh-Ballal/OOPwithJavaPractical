// Siddhesh Ballal 
// 15 March 2022

// Assignment 2
// Design a class named weather report that holds a daily weather report with data members day_of_month,
// hightemp, lowtemp, amount_rain and amount_snow. Use different types of constructors to initialize the
// objects. Write a program to generate monthly report that displays average of each attribute. 

import java.util.Scanner;

class WeatherReport {

    int day_of_month;
    double hightemp, lowtemp, amount_rain, amount_snow;

    public WeatherReport() {
        day_of_month = 0;
        hightemp = 0;
        lowtemp = 0;
        amount_rain = 0;
        amount_snow = 0;
    }

    WeatherReport(int day, double high, Double low, double rain, double snow) {
        day_of_month = day;
        hightemp = high;
        lowtemp = low;
        amount_rain = rain;
        amount_snow = snow;
    }

    WeatherReport(WeatherReport report) {
        hightemp = report.hightemp;
        lowtemp = report.lowtemp;
        amount_rain = report.amount_rain;
        amount_snow = report.amount_snow;
    }

    static WeatherReport ReturnAverageReport(WeatherReport WR[], int no_of_days) {

        WeatherReport temp = new WeatherReport();

        for (int i = 0; i < no_of_days; i++) {
            temp.hightemp += WR[i].hightemp;
            temp.lowtemp += WR[i].lowtemp;
            temp.amount_rain += WR[i].amount_rain;
            temp.amount_snow += WR[i].amount_snow;
        }

        temp.hightemp /= no_of_days;
        temp.lowtemp /= no_of_days;
        temp.amount_rain /= no_of_days;
        temp.amount_snow /= no_of_days;

        return temp;
    }

    void DisplayReport() {
        System.out.println("\nThe Weather report for day " + day_of_month + " is: \n");
        System.out.println("High temperature: " + hightemp + "\nLow temperature: " + lowtemp + "\nRainfall (in mm): "
                + amount_rain + "\nSnowfall: " + amount_snow);
    }
}

public class Assignment_2 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("\nEnter no. of days in your Report: ");
        int no_of_days = S.nextInt();
        WeatherReport DailyWeatherReport[] = new WeatherReport[no_of_days];
        WeatherReport AverageWeatherReport = new WeatherReport();
        for (int day = 0; day < no_of_days; day++) {
            DailyWeatherReport[day] = new WeatherReport();
            DailyWeatherReport[day].day_of_month = day + 1;

            System.out.println("\nEnter High Temperature for day " + DailyWeatherReport[day].day_of_month + ": ");
            DailyWeatherReport[day].hightemp = S.nextDouble();
            System.out.println("\nEnter Low Temperature for day " + DailyWeatherReport[day].day_of_month + ": ");
            DailyWeatherReport[day].lowtemp = S.nextDouble();
            System.out.println("\nEnter Amount of Rainfall for day " + DailyWeatherReport[day].day_of_month + ": ");
            DailyWeatherReport[day].amount_rain = S.nextDouble();
            System.out.println("\nEnter Amount of Snowfall for day " + DailyWeatherReport[day].day_of_month + ": ");
            DailyWeatherReport[day].amount_snow = S.nextDouble();
        }

        AverageWeatherReport = WeatherReport.ReturnAverageReport(DailyWeatherReport, no_of_days);
        AverageWeatherReport.DisplayReport();
        S.close();
    }
}
