package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){
        //1.ask user for a season of the year
        System.out.println("Enter a season , Spring, Summer, Fall and Winter:");
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        String season = scanner.nextLine();
        //2.A whole number
        System.out.println("Enter the year of the season:");
        int year = scanner.nextInt();
        //3.An Adjective
        System.out.println("Enter an adjective about that season:");
        String adjective = scanner1.nextLine();
        //4.Output the result in a line
        System.out.println("On a "+adjective+" "+season+" day, I drink a minimum of "+year+" cups of coffee.");
    }
}
