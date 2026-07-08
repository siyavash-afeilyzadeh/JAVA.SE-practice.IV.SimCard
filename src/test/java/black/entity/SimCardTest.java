package black.entity;

import black.utils.Operator;
import black.utils.Status;

public class SimCardTest {
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


        System.out.println(simcard1);
        System.out.println(simcard2);
        System.out.println(simcard3);
    }
}
