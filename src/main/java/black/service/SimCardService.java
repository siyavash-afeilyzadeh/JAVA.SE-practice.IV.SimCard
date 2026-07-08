package black.service;

import black.entity.SimCard;
import black.utils.Status;

import java.util.ArrayList;
import java.util.List;

public class SimCardService {
    public static List<SimCard> simcards = new ArrayList<>();
    public static List<SimCard> activeSimcards = new ArrayList<>();

    public void saveSimCard(SimCard simCard){
        simcards.add(simCard);
        System.out.println("SimCard Successfully Submit!");
        if(simCard.getStatus().equals(Status.Active)){
            activeSimcards.add(simCard);
        }
    }

    public void deleteSimCard(SimCard simCard){
        simcards.remove(simCard);
        activeSimcards.remove(simCard);
        System.out.println("SimCard Successfully Deleted!");
    }

    public void printSimCardList(){
        System.out.println("All SimCards:");
        for(SimCard simCard: simcards){
            System.out.println(simCard);
            System.out.println("*".repeat(20));
        }
        System.out.println("_".repeat(20));
        System.out.println("Active SimCards:");
        for(SimCard simCard: activeSimcards){
            System.out.println(simCard);
            System.out.println("*".repeat(20));
        }
    }
}
