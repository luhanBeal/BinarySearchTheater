package com.luhan.mypackage;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Theater theater = new Theater("Capitólio", 13, 15,12.00);
        System.out.println("Welcome to " + theater.getTheaterName() + " Theater");
        System.out.println("=========================================================");
        System.out.println("The current price of the ticket is: R$" + theater.getPrice());
        System.out.println(".");
        System.out.println("These are the seats that are available for this section:");
        theater.getSeats();
        // test reserving
        if (theater.reserveSeat("M10")) {
            System.out.println("Please pay.");
        } else {
            System.out.println("Sorry, seat taken.");
        }
        if (theater.reserveSeat("M10")) {
            System.out.println("Please pay.");
        } else {
            System.out.println("Sorry, seat taken.");
        }
    }
}
