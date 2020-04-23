package com.luhan.mypackage;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Theater theater = new Theater("Capitólio", 13, 15);
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
