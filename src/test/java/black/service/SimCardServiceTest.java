package black.service;

import black.entity.SimCard;
import black.utils.Operator;
import black.utils.Status;

public class SimCardServiceTest {
    public static void main(String[] args) {
        SimCard simcard1 = SimCard
                .builder()
                .id(1)
                .number("234")
                .operator(Operator.MCI)
                .status(Status.Active)
                .build();

        SimCard simcard2 = SimCard
                .builder()
                .id(2)
                .number("156")
                .operator(Operator.Irancell)
                .status(Status.Active)
                .build();

        SimCard simcard3 = SimCard
                .builder()
                .id(3)
                .number("754")
                .operator(Operator.Rightel)
                .build();

        SimCardService simCardService = new SimCardService();
        simCardService.saveSimCard(simcard1);
        simCardService.saveSimCard(simcard2);
        simCardService.saveSimCard(simcard3);
        simCardService.printSimCardList();
        simCardService.deleteSimCard(simcard2);
        simCardService.printSimCardList();
        simCardService.saveSimCard(simcard2);
    }
}
