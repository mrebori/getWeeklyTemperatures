import java.util.ArrayList;
import java.util.Scanner;

public class getWeeklyTemperatures {
    public static void main(String[] args) {

        System.out.println("Welcome!");
        System.out.println(" ");

        //Declare arrays, and store days of the week (Monday to Friday) and daily average temperature
        Scanner scnr = new Scanner(System.in);
        ArrayList<String> weekDays = new ArrayList<>();
        int i;

        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");
        weekDays.add("Sunday");

        ArrayList<Integer> weekTemps = new ArrayList<>();
        weekTemps.add(68);
        weekTemps.add(65);
        weekTemps.add(70);
        weekTemps.add(72);
        weekTemps.add(75);
        weekTemps.add(67);
        weekTemps.add(78);

        String userInput; // User Input can be a string data type

        int sumTemps = 0;
        for (int temps : weekTemps) {
            sumTemps += temps; //to add all daily temperatures
        }
        int avgTemps = sumTemps / weekTemps.size(); //calculate weekly average temperature

        while (true) { //create while loop to ask for user input and return daily or weekly averages
            System.out.println("Enter a day of the week for daily average temperature. For the weekly average type: 'week'; to end: 'Done'"); //Asks for user input
            userInput = scnr.next();

            if (userInput.equals("week")) {
                System.out.println("Average Daily Temperatures:");
                System.out.println(" ");
                for (i = 0; i < weekDays.size(); i++) {
                    System.out.println(weekDays.get(i) + ": " + weekTemps.get(i) + " degrees.");
                }
                System.out.println(" ");
                System.out.println("Weekly Average Temperature: " + avgTemps + " degrees.");
            } else if (userInput.equals("Monday")){
                System.out.println(weekDays.get(0) + ": " + weekTemps.get(0) + " degrees.");
            } else if (userInput.equals("Tuesday")){
                System.out.println(weekDays.get(1) + ": " + weekTemps.get(1) + " degrees.");
            } else if (userInput.equals("Wednesday")){
                System.out.println(weekDays.get(2) + ": " + weekTemps.get(2) + " degrees.");
            } else if (userInput.equals("Thursday")){
                System.out.println(weekDays.get(3) + ": " + weekTemps.get(3) + " degrees.");
            } else if (userInput.equals("Friday")){
                System.out.println(weekDays.get(4) + ": " + weekTemps.get(4) + " degrees.");
            } else if (userInput.equals("Saturday")){
                System.out.println(weekDays.get(5) + ": " + weekTemps.get(5) + " degrees.");
            } else if (userInput.equals("Sunday")){
                System.out.println(weekDays.get(6) + ": " + weekTemps.get(6) + " degrees.");
            } else if (userInput.equals("Done")){ //end the program if Done is input by the user
                System.out.println("GoodBye!");
                break;
            } else {
                System.out.println("Please enter a valid input.");
            }
        }
    }
}
