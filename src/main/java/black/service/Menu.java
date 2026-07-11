package black.service;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private void printMenu(){
        String menu = "Welcome! Please choose one option:\n" +
                "-".repeat(20) +
                "1. Add SimCard\n" +
                "2. Register Person\n" +
                "3. Sell SimCard\n" +
                "4. Print Persons\n" +
                "5. Print SimCards\n" +
                "6. Print Documents\n" +
                "7. Find SimCards By Owner\n" +
                "8. Find SimCard Owner\n" +
                "0. Exit\n";
        System.out.println(menu);
    }
    private int option(){
        return Integer.parseInt(scanner.nextLine());
    }

    public void start(){
        while(true){
            printMenu();

            switch (option()){
                case 1: //Add SimCard
                case 2: //Register Person
                case 3: //Sell SimCard
                case 4: //Print Persons
                case 5: //Print SimCards
                case 6: //Print Documents
                case 7: //Find SimCards By Owner
                case 8: //Find SimCard Owner
                case 0: //Exit
                default:
            }


        }
    }
}
