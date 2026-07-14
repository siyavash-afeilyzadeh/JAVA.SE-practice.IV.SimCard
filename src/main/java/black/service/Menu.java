package black.service;

import black.entity.SimCard;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    MenuService menuService = new MenuService();
    SimCardService simCardService = new SimCardService();
    private int option() {

        return Integer.parseInt(scanner.nextLine());
    }

    public void start() {
        while (true) {
            menuService.printMenu();
            switch (option()) {
                case 1: //Add SimCard
                    menuService.case1();
                    break;

//                case 2: //Register Person
//                case 3: //Sell SimCard
//                case 4: //Print Persons
                case 5: //Print SimCards
                    System.out.println("SimCard List:");
                    System.out.println("*".repeat(20));
                    simCardService.printSimCardList();
                    break;
//                case 6: //Print Documents
//                case 7: //Find SimCards By Owner
//                case 8: //Find SimCard Owner
                case 0: //Exit
                    System.out.println("Good Bye!");
                    return;
                default:
                    System.out.println("Invalid option!");
            }


        }
    }
}
