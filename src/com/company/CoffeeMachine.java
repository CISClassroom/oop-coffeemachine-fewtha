package com.company;

import java.util.Scanner;

public class CoffeeMachine {
    //attribute
    int water = 10;
    int coffee = 10;
    public void Makecoffee(int iAmericano) {
        //System.out.println("Select your coffee");
        //.out.println("1. Americano");
        //Scanner in = new Scanner(System.in);
        //String input = in.nextLine();
        if (iAmericano > 0){
            for (int i = 0; i< iAmericano ; i++) {
                Americano americano = MakeAmericano();
                if (americano != null)
                    System.out.println(i + "cup, Here your americano");
                else
                    System.out.println("Sorry can't make this cup.");

            }
        }
    }
    //method
    public Americano MakeAmericano() {

        if (coffee > 1 && water > 2) {
            coffee -= 1;
            water -= 2;
            Americano americano = new Americano();
            return americano;
        }else
            return null;
    }
}
