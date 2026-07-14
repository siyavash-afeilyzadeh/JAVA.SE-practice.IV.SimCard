package black.service;

import black.entity.SimCard;
import black.utils.Operator;

import java.util.Scanner;

public class MenuService {
    SimCardService simCardService = new SimCardService();
    private Scanner scanner = new Scanner(System.in);

    private int option() {
        return Integer.parseInt(scanner.nextLine());
    }

    public void printMenu() {
        String menu = "Welcome! Please choose one option:\n" +
                "-".repeat(20) +
                "\n" +
                "1. Add SimCard\n" +
                "2. Register Person\n" +
                "3. Sell SimCard\n" +
                "4. Print Persons\n" +
                "5. Print SimCards\n" +
                "6. Print Documents\n" +
                "7. Find SimCards By Owner\n" +
                "8. Find SimCard Owner\n" +
                "0. Exit\n" +
                "-".repeat(20) +
                "\n" +
                "Option: ";
        System.out.print(menu);
    }

    public void printAddSimCardMenu() {
        String menu = "Please choose an option:\n" +
                "-".repeat(20) +
                "\n" +
                "1. Add SimCard\n" +
                "0. Return to Menu\n" +
                "-".repeat(20) +
                "\n" +
                "Option: ";
        System.out.print(menu);
    }

    public SimCard setSimInfo() {
        SimCard simCard = new SimCard();
        System.out.println("Please enter the number:");
        simCard.setNumber(scanner.nextLine());
        System.out.println("Please choose the Operator from list blow:\n" +
                "1. MCI\n" +
                "2. Irancell\n" +
                "0. back");
        while (true) {
            switch (option()) {
                case 1:
                    simCard.setOperator(Operator.MCI);
                    return simCard;
                case 2:
                    simCard.setOperator(Operator.Irancell);
                    return simCard;
                case 0:
                    System.out.println("Return...");
                    return null;
                default:
                    System.out.println("Invalid option!");

            }
        }
    }

    public void case1() {
        while (true) {
            printAddSimCardMenu();
            switch (option()) {
                case 1: //Add SimCard
                    SimCard simCard = this.setSimInfo();
                    if (simCard != null) {
                        simCardService.saveSimCard(simCard);
                    }
                    break;
                case 0: //Return
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}