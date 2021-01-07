import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void calculate() {
        BonusService service = new BonusService();


        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;


        long actual = service.calculate(amount, registered);

        boolean passed = expected == actual;


        System.out.println(passed);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void ShouldBeRegistered() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);
        boolean passed = expected == actual;
        System.out.println(passed);


        if (!registered) {
            System.out.println(" FAILED");
        }

    }

    @org.junit.jupiter.api.Test
    void AmountUpperOrBelowZero() {
        BonusService service = new BonusService();
        long amount = -100000;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);



        String answer = amount > 1000? "passed": "failed";

        System.out.println(answer);
        System.out.println(actual);
    }
}